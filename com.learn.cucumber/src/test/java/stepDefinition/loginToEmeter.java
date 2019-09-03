package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginToEmeter {

	WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z00406KF\\Downloads\\chrome driver for 76version\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		//To Turns off multiple download warning
		prefs.put("profile.default_content_settings.popups", 0);

		prefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );

		//Turns off download prompt
		prefs.put("download.prompt_for_download", false);
		prefs.put("credentials_enable_service", false);
		//To Stop Save password propmts
		prefs.put("password_manager_enabled", false);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("disable-infobars");
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-extensions");
		options.addArguments("--start-maximized");
		  
		driver=new ChromeDriver(options);
	}
	
	@Given("^I am on emtersite$")
	public void open_emeter() {
		login();
		//driver.manage().window().maximize();
		driver.get("https://ind-lnxapp312.emeter.com:8443/em-ui");
	}
	
	@When("^Login with valid \"([^\"]*)\" and \"([^\\\"]*)\"$")
	public void enter_user_name_password(String uname,String pwd) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("btn-submit")).submit();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@When("^Login with valid username and password")
	public void enter_user_name_password1() {
		driver.findElement(By.id("username")).sendKeys("uiuser1");
		driver.findElement(By.id("password")).sendKeys("uiuser1");
		driver.findElement(By.className("btn-submit")).submit();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Then("^Access customer info tab$")
	public void access_customer() {
	driver.findElement(By.linkText("Customer Info")).click();
	}
	
	@And("^Logout from site$")
	public void logout() {
		WebElement logout=driver.findElement(By.xpath("//span[@id='userdisplay-btnInnerEl']"));
		mouseHover(logout);
		logout.getLocation().getX();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		System.out.println("success");
		driver.close();// to close the browser
		
	}
	
	@Test
	public void multipleWindow() throws AWTException, IOException {
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.login-method-title")).click();
	driver.switchTo().alert();
	Actions action=new Actions(driver);
		action.sendKeys(Keys.RETURN).build().perform();
		Runtime.getRuntime().exec("C:\\Users\\Z00406KF\\Desktop\\PKI_Accept.exe");
		/*Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		String currWindow=driver.getWindowHandle();
		System.out.println(currWindow);
		
	}
	
	public void mouseHover(WebElement log) {
		Actions action=new Actions(driver);
		
		action.moveToElement(log).perform();
	}
}


