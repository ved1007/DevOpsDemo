$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/vedant.jagani/Documents/Automation/SeleniumCucumberBDDFramework/Features/YouTubeSearch.feature");
formatter.feature({
  "line": 2,
  "name": "YouTube Search validations",
  "description": "",
  "id": "youtube-search-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UATTesting"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "YouTube Search possitive scenarios",
  "description": "",
  "id": "youtube-search-validations;youtube-search-possitive-scenarios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "OPen chrome browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter search creteria",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "YouTubeSearchStepDef.open_chrome_browser_and_enter_url()"
});
formatter.result({
  "duration": 4082663479,
  "status": "passed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.enter_search_creteria()"
});
formatter.result({
  "duration": 20254773650,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d83.0.4103.97)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027HQ-991-0L7LVCF\u0027, ip: \u00272601:246:4500:eb00:521:693a:bd75:406e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/s3/88ktkygs3s3...}, goog:chromeOptions: {debuggerAddress: localhost:59948}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ff4ca499834a7f6bf7e0d210c34602d5\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:100)\n\tat com.testautomation.StepDef.YouTubeSearchStepDef.enter_search_creteria(YouTubeSearchStepDef.java:41)\n\tat ✽.When Enter search creteria(/Users/vedant.jagani/Documents/Automation/SeleniumCucumberBDDFramework/Features/YouTubeSearch.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "YouTubeSearchStepDef.click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
});