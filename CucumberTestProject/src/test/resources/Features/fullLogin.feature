Feature: test full login functionality

  Scenario Outline: check if login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to the homepage after login

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
