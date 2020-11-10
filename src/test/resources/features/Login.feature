Feature:
  As a user I should be able to login to the app with valid credential


  @first
  Scenario:
    Parametrized login

    Given user in the login page
    When user logs in as a "posmanager"
    Then user should be see home page

