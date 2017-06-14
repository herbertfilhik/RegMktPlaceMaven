Feature: Login MktPlace Chrome

  Scenario: Successful Login with Valid Credentials Chrome
    Given User is on Home Page Chrome
    When User Navigate to LogIn Page Chrome
    And User enters UserName and Password Chrome
    Then Message displayed Login Successfully Chrome
    When User LogOut from the Application Chrome
    Then Message displayed Logout Successfully Chrome
