Feature: TruNarrative Automation Test 

  @truBDD
  Scenario: I want search truNarrative on google so i can verified it web Element
    Given that the User has launch chrome browser to open google home page
    And search for Trunarrative and verify search returned displayed
    When click on the search link displayed to navigate trunarrative home page 
    And verify the strap line found on the page
    Then navigate to via the UI to the team page
    And verify team and leadership roles

 
