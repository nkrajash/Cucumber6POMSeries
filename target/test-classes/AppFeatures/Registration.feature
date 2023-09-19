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

Feature: User Registration

Scenario: user registration with different data
	Given User is on registration page
	When User enters following user details
		| naveen | automation | nav@gmail.com 	| 99999 	| Bangalore |
		| tom 	 | peter 			| tom@gmail.com 	| 99999 	| London 		| 
		| lisa   | dsouza 		| lisa@gmail.com 	| 8887777 | SFO 			| 
	Then user registration should be successful
	
	
Scenario: user registration with different data with columns
	Given User is on registration page
	When User enters following user details with columns
		| firstname | lastname 		| email 					| phone		| city 			|	
		| naveen 		| automation 	| nav@gmail.com 	| 99999 	| Bangalore |
		| tom 			| peter 			| tom@gmail.com 	| 99999	 	| London 		| 
		| lisa 			| dsouza 			| lisa@gmail.com 	| 8887777 | SFO 			| 
	Then user registration should be successful



