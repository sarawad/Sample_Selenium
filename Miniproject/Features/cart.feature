
Feature: Online Shopping website 

Background:
Given clear the already created users before starting the scenario

Scenario: Validation of contact button
Given user is on home page
When user clicks on contact us
Then navigates to customer service page


Scenario: Validation of new user registration
Given user is on home page
When user clicks on sign in
Then navigates to customer authentication page
When user gives valid email id
And clicks on create account
Then navigates to registration page
When user gives valid details
And clicks on register
Then navigates to my account page

Scenario: Validation of category list
Given user is on home page
When user clicks on search for a product and types value
Then navigates to required product page
When user clicks on women button
Then navigates to women section
When user clicks on dresses button
Then navigates to Dresses section
When user clicks on tshirt button
Then navigates to Tshirt section

Scenario: Successful login
Given user is on authentication page
When user gives valid email id and password
And clicks on sign in button
Then navigates to my account page


Scenario: In case of forgot password and successful login
Given user is on authentication page
When user gives valid email id and empty password
And clicks on forgot password button
And navigates to forgot password page
And user gives valid email id and clicks on retrieve password
And navigate to confirmation page
Then click on back to login
   
Scenario: Validation of product selection without sign in
  	Given user is on home page
  	And click on search field
  	And enters product
  	And click on search
  	And click on product1
    And select quantity
    And select size
    And select color
    And click on Addtocart
    And click on proceed to checkout
    Then Cart summary displays
 
    Scenario: Validation of product selection with sign in
  	Given user is on home page
    When User click on sign in
    And User enters valid email and password
    And click on sign in
    And click on My Wishlist
    Then Navigate to wishlist page
    
    
    
   @tag 
Scenario: Successful Signout
    Given User is on shopping home page
    And User clicks on signin tab
    And User enters registered email and password
    When User clicks on signin button
    And User clicks on sign out tab
    
    @tag
   Scenario: Successful ReportGeneration for already purchased item
    Given User is on shopping home page
    And User clicks on signin tab
    And User enters registered email and password
    When User clicks on signin button
    And User clicks on profile tab
    And User clicks on order history
    Then Report generation is successful
         