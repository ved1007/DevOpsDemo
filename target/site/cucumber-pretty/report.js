$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YoutubeChannelValidation.feature");
formatter.feature({
  "line": 2,
  "name": "YouTube channel name validation",
  "description": "",
  "id": "youtube-channel-name-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ExtentReport"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "YouTube channel name validations",
  "description": "",
  "id": "youtube-channel-name-validation;youtube-channel-name-validations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "OPen chrome browser with URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search selenium tutorial",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "CLick on channel name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Validate channel name",
  "keyword": "Then "
});
formatter.match({
  "location": "YoutubeChannelValidationsStepDef.open_chrome_browser_with_URL()"
});
formatter.result({
  "duration": 108080402,
  "error_message": "java.lang.NullPointerException\n\tat com.testautomation.Listeners.ExtentReportListener.testStepHandle(ExtentReportListener.java:41)\n\tat com.testautomation.StepDef.YoutubeChannelValidationsStepDef.open_chrome_browser_with_URL(YoutubeChannelValidationsStepDef.java:42)\n\tat ✽.Given OPen chrome browser with URL(YoutubeChannelValidation.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "YoutubeChannelValidationsStepDef.search_selenium_tutorial()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YoutubeChannelValidationsStepDef.click_on_channel_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YoutubeChannelValidationsStepDef.validate_channel_name()"
});
formatter.result({
  "status": "skipped"
});
});