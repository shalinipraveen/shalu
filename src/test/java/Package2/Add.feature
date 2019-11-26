Feature: Test Calculator 
This file describes calculator functionality

Scenario: Addition of two numbers
		Given I enter 40 in the calculator
		And I press add
		And I have entered 20 in the calculator
		When I press equal
		Then The result should be 40 on the screen