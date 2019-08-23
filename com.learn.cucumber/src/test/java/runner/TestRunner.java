package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="features/login_feature1.feature",
		glue= {"stepDefinition"},
		plugin= {"html:target/cucumber-reports"})
public class TestRunner {

}
