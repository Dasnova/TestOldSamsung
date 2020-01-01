

Feature: So that User can operate successfully on Applitools Page
  
  Scenario: Login scenario for NewTours Page
    Given That the User is on NewTours Page
    When entered correct login details
    Then the User should login
    And select flight details
  