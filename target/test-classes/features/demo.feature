Feature: Login

  Scenario: login in valid crediantals
    Given I am on sauce lab login page
    And I enter usrename
    And I enter password
    And I click on login button
    Then I will be navigated to dashboard

