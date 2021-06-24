

Feature: User Login



  Scenario: Login with valid credentials
    When user logs in with valid credentials
    Then the page title should be "Zero -Account Summary"

    Scenario Outline: Login with invalid credentials
      When user enters "<Username>" and "<password">
      Then user should not be able to login
      Examples:
      |Username|Password|
      |Username|Password|
      |Username|Password|
      |Username|Password|
      |Username|Password|
      |Username|Password|
      |Username|Password|