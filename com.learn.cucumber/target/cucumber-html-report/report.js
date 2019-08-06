$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/login_emeter.feature");
formatter.feature({
  "name": "Login to em-ui",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "With user name and password able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on emtersite",
  "keyword": "Given "
});
formatter.step({
  "name": "Login with valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Access customer info tab",
  "keyword": "Then "
});
formatter.step({
  "name": "Logout from site",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "uiuser1",
        "",
        "uiuser1"
      ]
    },
    {
      "cells": [
        "TestGEU1",
        "",
        "TestGEU1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "With user name and password able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on emtersite",
  "keyword": "Given "
});
formatter.match({
  "location": "loginToEmeter.open_emeter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login with valid \"uiuser1\" and \"uiuser1\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginToEmeter.enter_user_name_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Access customer info tab",
  "keyword": "Then "
});
formatter.match({
  "location": "loginToEmeter.access_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from site",
  "keyword": "And "
});
formatter.match({
  "location": "loginToEmeter.logout()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With user name and password able to login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on emtersite",
  "keyword": "Given "
});
formatter.match({
  "location": "loginToEmeter.open_emeter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login with valid \"TestGEU1\" and \"TestGEU1\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginToEmeter.enter_user_name_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Access customer info tab",
  "keyword": "Then "
});
formatter.match({
  "location": "loginToEmeter.access_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from site",
  "keyword": "And "
});
formatter.match({
  "location": "loginToEmeter.logout()"
});
formatter.result({
  "status": "passed"
});
});