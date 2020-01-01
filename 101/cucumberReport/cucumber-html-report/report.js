$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TruNarrative.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: okwonguya@yahoo.com"
    }
  ],
  "line": 3,
  "name": "I want to search for TruNarrative so i can verify some web element",
  "description": "",
  "id": "i-want-to-search-for-trunarrative-so-i-can-verify-some-web-element",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "TruNarrative Page search and web element verification",
  "description": "",
  "id": "i-want-to-search-for-trunarrative-so-i-can-verify-some-web-element;trunarrative-page-search-and-web-element-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@truNarrative"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that a User launch chrome browser and search for TruNarrative",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify that TruNarrative is the first search result return and navigate to website",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "On TruNarrative Home page verify the strap line",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "navigate via the UI to TruNarrative team page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify that TruNarrative leadership team consist  of \"8\" people",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TruNarrativeBDD.that_a_User_launch_chrome_browser_and_search_for_TruNarrative()"
});
formatter.result({
  "duration": 8597990612,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeBDD.verify_that_TruNarrative_is_the_first_search_result_return_and_navigate_to_website()"
});
formatter.result({
  "duration": 2811232726,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeBDD.on_TruNarrative_Home_page_verify_the_strap_line()"
});
formatter.result({
  "duration": 28195923992,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeBDD.navigate_via_the_UI_to_TruNarrative_team_page()"
});
formatter.result({
  "duration": 11294007471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 54
    }
  ],
  "location": "TruNarrativeBDD.verify_that_TruNarrative_leadership_team_consist_of_people(String)"
});
formatter.result({
  "duration": 2265308249,
  "status": "passed"
});
formatter.match({
  "location": "TruNarrativeBDD.close_browser()"
});
formatter.result({
  "duration": 782285679,
  "status": "passed"
});
});