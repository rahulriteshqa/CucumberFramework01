Feature: feature to test login functionality

@SmokeTest
  Scenario: check login is successful with valid credentials
    Given when user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the homepage
