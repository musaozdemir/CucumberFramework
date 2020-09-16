$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee Functionalty",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Add employee page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.navigate_to_Add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee without login details without middle name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "add employee details",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.add_employee_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify employee name in employee list",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_employee_name_in_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add new employee without login details without middle name");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to Add employee page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.navigate_to_Add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new employee with login details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "add employee details",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.add_employee_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter login details",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.enter_login_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify employee name in employee list",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_employee_name_in_employee_list()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027profile-pic\u0027]/h1\"}\n  (Session info: chrome\u003d85.0.4183.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Musa-Air.attlocal.net\u0027, ip: \u0027fe80:0:0:0:4b9:8e11:eca4:b328%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: /var/folders/4v/62cnb8l94qg...}, goog:chromeOptions: {debuggerAddress: localhost:63320}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 89eef645f41278fe23c52fc5b723bc9d\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027profile-pic\u0027]/h1}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\n\tat com.hrms.stepDefinitions.AddEmployeeDefinitions.verify_employee_name_in_employee_list(AddEmployeeDefinitions.java:31)\n\tat ✽.verify employee name in employee list(file:///Users/musaozdemir/Desktop/Eclipse-workspace/CucumberFrameWork/src/test/resources/features/AddEmployee.feature:17)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "Add new employee with login details");
formatter.after({
  "status": "passed"
});
});