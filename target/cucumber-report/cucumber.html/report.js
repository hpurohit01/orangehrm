$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM",
  "description": "",
  "id": "orange-hrm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8488139100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify that logo displayed on home page",
  "description": "",
  "id": "orange-hrm;verify-that-logo-displayed-on-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I enter username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I can see logo",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 434699500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 137841000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3272780900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iCanSeeLogo()"
});
formatter.result({
  "duration": 148017100,
  "status": "passed"
});
formatter.after({
  "duration": 954656300,
  "status": "passed"
});
formatter.uri("user.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM",
  "description": "As a user i can operate orange hrm website",
  "id": "orange-hrm",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4656285300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is om homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "admin should add user successfully",
  "description": "",
  "id": "orange-hrm;admin-should-add-user-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on admin tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on add button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select user role \"Admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter employee name \"Karan Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter my username",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select status \"Disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I set password \"prime@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I set confirm password \"prime@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 148218500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 123300900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 2926028200,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.iClickOnAdminTab()"
});
formatter.result({
  "duration": 976316900,
  "status": "passed"
});
formatter.match({
  "location": "UserStep.iClickOnAddButton()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "UserStep.iSelectUserRole(String)"
});
formatter.result({
  "duration": 9964700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karan Patel",
      "offset": 23
    }
  ],
  "location": "UserStep.iEnterEmployeeName(String)"
});
formatter.result({
  "duration": 20110260300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027systemUser_employeeName_empName\u0027]\"}\n  (Session info: chrome\u003d96.0.4664.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027HEMAL\u0027, ip: \u0027192.168.0.41\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d2c723a60933af508b6147a6a6077ba3, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027systemUser_employeeName_empName\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.93, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\HEMALP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61744}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:61744/devtoo..., se:cdpVersion: 96.0.4664.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d2c723a60933af508b6147a6a6077ba3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat com.orangehrm.utility.Utility.sendTextToElement(Utility.java:89)\r\n\tat com.orangehrm.pages.AddUserPage.setEmpName(AddUserPage.java:72)\r\n\tat com.orangehrm.cucumber.steps.UserStep.iEnterEmployeeName(UserStep.java:27)\r\n\tat ✽.And I enter employee name \"Karan Patel\"(user.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserStep.iEnterMyUsername()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Disabled",
      "offset": 17
    }
  ],
  "location": "UserStep.iSelectStatus(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prime@123",
      "offset": 16
    }
  ],
  "location": "UserStep.iSetPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "prime@123",
      "offset": 24
    }
  ],
  "location": "UserStep.iSetConfirmPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserStep.iClickOnSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1159044400,
  "status": "passed"
});
});