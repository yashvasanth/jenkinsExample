gherkin
Feature: Login functionality
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid credentials to check
    And I click the login button
    Then I should be redirected to the dashboard website
