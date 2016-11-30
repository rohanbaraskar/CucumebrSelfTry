$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Nopecommerce.feature");
formatter.feature({
  "line": 2,
  "name": "User should buy product successfully",
  "description": "",
  "id": "user-should-buy-product-successfully",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "User should be able to Login  successfully with valid username and password",
  "description": "",
  "id": "user-should-buy-product-successfully;user-should-be-able-to-login--successfully-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@kavya"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user open browser and goto Nopecommerce website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enter valid Username and valid Password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_open_browser_and_goto_Nopecommerce_website()"
});
formatter.result({
  "duration": 18352886281,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_link()"
});
formatter.result({
  "duration": 838300486,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_Username_and_valid_Password()"
});
formatter.result({
  "duration": 335267435,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1241795566,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_successfully_logged_in()"
});
formatter.result({
  "duration": 1902452051,
  "status": "passed"
});
});