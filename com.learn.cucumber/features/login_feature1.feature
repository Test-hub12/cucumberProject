Feature: Login to em-ui

  Scenario: With user name and password able to login
    Given I am on emtersite
    When Login with valid username and password
    Then Access customer info tab
    And Logout from site

  