@LoginFeature
Feature: Login feature

#Background: User is already registered into the system 
#and has valid login URL

@CauseAndEffect
Scenario: Failure in hotel booking login when username is left empty

Given User is on login page
When User leaves username empty
And Clicks on login button
Then Alert message is displayed username empty

@CauseAndEffect
Scenario: Failure in hotel booking login when password is left empty

Given User is on login page
When User leaves password empty
And Clicks on login button
Then Alert message is displayed password empty

@CauseAndEffect
Scenario: Failure in hotel booking login when username and password is left empty

Given User is on login page
When User leaves username and password empty
And Clicks on login button
Then Alert message is displayed username empty


@CauseAndEffect
Scenario Outline: User logging in with invalid data

Given User is on login page
When User enters "<username>" and "<password>"
And Clicks on login button
Then Alert message is displayed

Examples:
| username | password |
|Rahul|123456|


@StateTransition
Scenario Outline: User logging with valid data

Given User is on login page
When User enters "<username>" and "<password>"
And Clicks on login button
Then User is logged into the system

Examples:
| username | password  |
|capgemini|capg1234|