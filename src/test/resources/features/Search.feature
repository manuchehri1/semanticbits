@regression
Feature: Testing Search Functionality in Home Page


  Scenario: User should be able to search using search engine
    Given user is on the home page
    When user navigate to the "Expertise" page
    Then user should verify that title is a "Expertise – SemanticBits"


  @smoke
  Scenario: User should be able to navigate between Tabs and its Modules
    Given user is on the home page
    When user hover over "Expertise" tab and click "Mobility" module
    Then user should verify that title is a "Mobility – SemanticBits"
