Feature: Demo

  Background:
    Given I am on the HomePage

  @signIn
  Scenario: Simple sign in scenario
    When I click on openAccount button
    Then I should be on the Registration page
    Then I click on Start my application button
    And sleep for "10000" millisec