Feature: I want to test login functionality
  Scenario: I can login with valid credentials
    Given I am on Mail.ru login page
    When I enter "pavel.jahont" in username input
    And I enter "javascript202099775533" in password input
    Then Home page of Mail.ru inbox appears