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

Feature: Login Feature

Scenario Outline: Login fail - possible combinations
 Given user is on Amazon landing page
 When user clicks on Sign in button
 Then user is displayed login screen
 When user enters "<UserName>" in username field
 And user enters "<Password>" in password field
 And user clicks Sign in button
 Then user gets login failed error message

    Examples: 
      | UserName          | Password          |
      | incorrectusername | 123456            |
      | naveenautomation  | incorrectpassword |    
      | incorrectusername | incorrectpassword |


