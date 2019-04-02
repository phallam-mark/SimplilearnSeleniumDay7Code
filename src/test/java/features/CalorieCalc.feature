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
Feature: Navigate to Calorie Calculator page and from there Navigate to BMI link, 
and Enter BMI Calculator details, calculate the BMI and get and Verify the BMI Category

	Background:
		Given The User Launches the Calorie Calculator BMI Page

  @smoke @regression
  Scenario: Enter Calorie Details
    # Given The User Launches the Calorie Calculator BMI Page
    And The User enters 45 in the age text box
    When The user clicks on the Calculate Button
    Then The user is provided with BMI Value and BMI Category
    
  @regression
  Scenario: Enter Calorie Details Parameterized
  	# Given The User Launches the Calorie Calculator BMI Page
    And The User enters the height / inches as 0
    When The user clicks on the Calculate Button
    Then The user is provided with BMI Value and BMI Category
    
  # use 'Scenario Outline' with 'Examples'
  @regression
  Scenario Outline: Enter Calorie Details Parameterized with Examples
  	# Given The User Launches the Calorie Calculator BMI Page
  	And The User enters the age as <age>
  	And The user enters the height / inches as <height>
  	When the user clicks on the Calculate Button
  	Then the user is provided with BMI value and BMI Category
  Examples:
  	|age|height|
  	|50|2|
  	|25|8|
