Feature: Login Functionality

  @web
  Scenario: User cannot login with invalid credentials
    Given the user is on the login page
    When the user enters username "<username>" and password "<password>"
    And the user clicks the login button
    Then the user should see an error message containing "<errorMessage>"

    Examples: 
      | username | password | errorMessage        																											|
      | admin    | wrong    | Epic sadface: Username and password do not match any user in this service |
      | admin    | wrong    | Epic sadface: Username and password do not match any user in this service |