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

@All
Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions


#Scenario: Amazon Login Page
    #Given user is on Amazon landing page
    #Given Sign in button is present on screen
    #When user clicks on Sign in button
    #Then user can see login screen
    #When user enters "naveen@gmail.com" in username field
    #When user enters "test@123" in password field
    #When user clicks Sign in button
    #Then user is on home page
    #Then title of home page is "Amazon" 
    

Scenario: Amazon Login Page
    Given user is on Amazon landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "naveen@gmail.com" in username field
    And user enters "test@123" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "Amazon"
    But Sign in button is not present



