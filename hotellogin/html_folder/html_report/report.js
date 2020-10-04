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
  "duration": 11467588100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is already registered into the system",
  "description": "and has valid login URL",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
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
  "duration": 101830100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_username_empty()"
});
formatter.result({
  "duration": 2192641400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 155122600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_username_empty()"
});
formatter.result({
  "duration": 25689000,
  "status": "passed"
});
formatter.after({
  "duration": 240981900,
  "status": "passed"
});
formatter.before({
  "duration": 10796626700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is already registered into the system",
  "description": "and has valid login URL",
  "type": "background",
  "keyword": "Background"
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
  "duration": 5955400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_password_empty()"
});
formatter.result({
  "duration": 2130150600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 63206000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_password_empty()"
});
formatter.result({
  "duration": 32973700,
  "status": "passed"
});
formatter.after({
  "duration": 210805800,
  "status": "passed"
});
formatter.before({
  "duration": 10690125400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is already registered into the system",
  "description": "and has valid login URL",
  "type": "background",
  "keyword": "Background"
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
  "duration": 8845200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_leaves_username_and_password_empty()"
});
formatter.result({
  "duration": 2191536600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 114668100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed_username_empty()"
});
formatter.result({
  "duration": 36893000,
  "status": "passed"
});
formatter.after({
  "duration": 197938000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "User logging in with invalid data",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@CauseAndEffect"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Alert message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 39,
  "name": "",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 40,
      "id": "login-feature;user-logging-in-with-invalid-data;;1"
    },
    {
      "cells": [
        "Rahul",
        "123456"
      ],
      "line": 41,
      "id": "login-feature;user-logging-in-with-invalid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10719711900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is already registered into the system",
  "description": "and has valid login URL",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 41,
  "name": "User logging in with invalid data",
  "description": "",
  "id": "login-feature;user-logging-in-with-invalid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@CauseAndEffect"
    },
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User enters \"Rahul\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Alert message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 5040900,
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
  "duration": 2250048700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 108889800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.alert_message_is_displayed()"
});
formatter.result({
  "duration": 12219700,
  "status": "passed"
});
formatter.after({
  "duration": 197186700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 45,
  "name": "User logging with valid data",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 44,
      "name": "@StateTransition"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User is logged into the system",
  "keyword": "Then "
});
formatter.examples({
  "line": 52,
  "name": "",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 53,
      "id": "login-feature;user-logging-with-valid-data;;1"
    },
    {
      "cells": [
        "capgemini",
        "capg1234"
      ],
      "line": 54,
      "id": "login-feature;user-logging-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10729341100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is already registered into the system",
  "description": "and has valid login URL",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 54,
  "name": "User logging with valid data",
  "description": "",
  "id": "login-feature;user-logging-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 44,
      "name": "@StateTransition"
    },
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "User enters \"capgemini\" and \"capg1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User is logged into the system",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 6038500,
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
  "duration": 2235618100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 173639500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_logged_into_the_system()"
});
formatter.result({
  "duration": 18025600,
  "status": "passed"
});
formatter.after({
  "duration": 194389800,
  "status": "passed"
});
});