#Author: okwonguya@yahoo.com

Feature: I want to search for TruNarrative so i can verify some web element
 @truNarrative
  Scenario: TruNarrative Page search and web element verification 
    Given that a User launch chrome browser and search for TruNarrative
    And verify that TruNarrative is the first search result return and navigate to website 
    When On TruNarrative Home page verify the strap line    
    And navigate via the UI to TruNarrative team page
    Then verify that TruNarrative leadership team consist  of "8" people
    Then close browser
   
