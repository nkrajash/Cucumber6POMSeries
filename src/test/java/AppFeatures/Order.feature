#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

 Feature: Home Page
 	In order to check my order details
 	As a registered user 
 	I want to specify the features of order details page

	Background:
		Given a registered user exists
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page


  Scenario: Check Previous Order Details
    When user clicks on Order link
    Then user checks the previous order detials

  Scenario: Check Open Order Details
    When user clicks on Open Orders link
    Then user checks the open order details

  Scenario: Check Cancelled Order Details
    When user clicks on Cancelled Orders link
    Then user checks the cancelled order details
