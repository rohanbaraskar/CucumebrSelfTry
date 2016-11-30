$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Nopecommerce.feature");
formatter.feature({
  "line": 1,
  "name": "User should buy product successfully",
  "description": "",
  "id": "user-should-buy-product-successfully",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to Register successfully",
  "description": "",
  "id": "user-should-buy-product-successfully;user-should-be-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open browser and goto Nopecommerce website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on register link to open register page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter register details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I see successfully registered message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_open_browser_and_goto_Nopecommerce_website()"
});
formatter.result({
  "duration": 12257073067,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_register_link_to_open_register_page()"
});
formatter.result({
  "duration": 2038859119,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_enter_register_details()"
});
formatter.result({
  "duration": 1752178448,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_register_button()"
});
formatter.result({
  "duration": 1412584508,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_see_successfully_registered_message()"
});
formatter.result({
  "duration": 1406237591,
  "status": "passed"
});
});