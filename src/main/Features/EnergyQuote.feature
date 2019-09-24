@ctm
Feature: Energy Quote feature 

Background:
	Given User is on CTM energy quote page  

 @test @gas-quotes
Scenario: Energy quotes to compare with Gas 
	When User enters the gas supplier details 
	And User enters the gas energy details 
	And User enters the gas details 
	Then User redirects to the gas quotes results page
	
 @test @electricity-quotes
Scenario: Energy quotes to compare with Electricity 
	When User enters the electricity supplier details 
	And User enters the electricity energy details 
	And User enters the electricity details 
	Then User redirects to the electricity quotes results page 
	
 @test @gas-and-electricity-quotes
Scenario: Energy quotes to compare with Gas and Electricity 
	When User enters the Gas and Electricity supplier details 
	And User enters the Gas and Electricity energy details 
	And User enters the Gas and Electricity details 
	Then User redirects to the Gas and Electricity quotes results page 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	