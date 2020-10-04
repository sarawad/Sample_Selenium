$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.before({
  "duration": 7693882700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background: User is already registered into the system"
    },
    {
      "line": 5,
      "value": "#and has valid login URL"
    }
  ],
  "line": 8,
  "name": "Failure in hotel booking login when username is left empty",
  "description": "",
  "id": "login-feature;failure-in-hotel-booking-login-when-username-is-left-empty",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@CauseAndEffect"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User leaves username empty",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Alert message is displayed username empty",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 141128800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_username_empty()"
});
formatter.result({
  "duration": 2139778400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 80435100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_username_empty()"
});
formatter.result({
  "duration": 26252000,
  "status": "passed"
});
formatter.after({
  "duration": 121231900,
  "status": "passed"
});
formatter.before({
  "duration": 6541867800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Failure in hotel booking login when password is left empty",
  "description": "",
  "id": "login-feature;failure-in-hotel-booking-login-when-password-is-left-empty",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@CauseAndEffect"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User leaves password empty",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Alert message is displayed password empty",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 5843700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_password_empty()"
});
formatter.result({
  "duration": 2143362500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 61626200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_password_empty()"
});
formatter.result({
  "duration": 25618300,
  "status": "passed"
});
formatter.after({
  "duration": 108597100,
  "status": "passed"
});
formatter.before({
  "duration": 6643033200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Failure in hotel booking login when username and password is left empty",
  "description": "",
  "id": "login-feature;failure-in-hotel-booking-login-when-username-and-password-is-left-empty",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@CauseAndEffect"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User leaves username and password empty",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Alert message is displayed username empty",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 70825200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_username_and_password_empty()"
});
formatter.result({
  "duration": 2222269300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 76625100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_username_empty()"
});
formatter.result({
  "duration": 38574300,
  "status": "passed"
});
formatter.after({
  "duration": 120763700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 33,
  "name": "User logging in with invalid data",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@CauseAndEffect"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Alert message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 41,
      "id": "login-feature;user-logging-in-with-invalid-data;;1"
    },
    {
      "cells": [
        "Rahul",
        "123456"
      ],
      "line": 42,
      "id": "login-feature;user-logging-in-with-invalid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6644596200,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User logging in with invalid data",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 32,
      "name": "@CauseAndEffect"
    },
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User enters \"Rahul\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Alert message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 6626100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rahul",
      "offset": 13
    },
    {
      "val": "123456",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2266228200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 73261300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed()"
});
formatter.result({
  "duration": 17437500,
  "status": "passed"
});
formatter.after({
  "duration": 207790300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 46,
  "name": "User logging with valid data",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 45,
      "name": "@StateTransition"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User is logged into the system",
  "keyword": "Then "
});
formatter.examples({
  "line": 53,
  "name": "",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 54,
      "id": "login-feature;user-logging-with-valid-data;;1"
    },
    {
      "cells": [
        "capgemini",
        "capg1234"
      ],
      "line": 55,
      "id": "login-feature;user-logging-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6560086700,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "User logging with valid data",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 45,
      "name": "@StateTransition"
    },
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User enters \"capgemini\" and \"capg1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User is logged into the system",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 6814300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "capgemini",
      "offset": 13
    },
    {
      "val": "capg1234",
      "offset": 29
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2356624600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 167705900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_logged_into_the_system()"
});
formatter.result({
  "duration": 20661800,
  "status": "passed"
});
formatter.after({
  "duration": 215307200,
  "status": "passed"
});
});