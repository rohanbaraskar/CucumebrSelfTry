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
  "duration": 21045697195,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_link()"
});
formatter.result({
  "duration": 809571316,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_Username_and_valid_Password()"
});
formatter.result({
  "duration": 297269020,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Login_button()"
});
formatter.result({
  "duration": 121443437,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_successfully_logged_in()"
});
formatter.result({
  "duration": 5169124964,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@class\u003d\u0027ico-account\u0027]\"}\nCommand duration or timeout: 5.11 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027kaival-PC\u0027, ip: \u0027192.168.0.60\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d37.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 171ccdab-726f-4a11-acd1-eac59914f0c4\n*** Element info: {Using\u003dxpath, value\u003d//a[@class\u003d\u0027ico-account\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.getText(Unknown Source)\r\n\tat NopecommerceProject.Utilities.Utils.get_Text(Utils.java:28)\r\n\tat NopecommerceProject.Page.LoginPage.getLoginAccountInfo(LoginPage.java:55)\r\n\tat Test_Runner.Steps.LoginSteps.user_should_successfully_logged_in(LoginSteps.java:53)\r\n\tat ✽.Then user should successfully logged in(Nopecommerce.feature:18)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@class\u003d\u0027ico-account\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027kaival-PC\u0027, ip: \u0027192.168.0.60\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/kaival/AppData/Local/Temp/anonymous5420307368970813905webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/kaival/AppData/Local/Temp/anonymous5420307368970813905webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:625)\r\n",
  "status": "failed"
});
});