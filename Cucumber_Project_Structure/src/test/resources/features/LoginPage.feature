Feature: Login to HRM Application

  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
    When User enters username and password
    Then User should be able to login successfully and new page open