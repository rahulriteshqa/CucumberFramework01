Feature: feature to test google search functionality

  Scenario: Google Search Functionality
    Given Browser is open
    And user is on google search page
    When User enters a text in the search box
    And clicks on Searh button
    Then user is navigated to the search results page
