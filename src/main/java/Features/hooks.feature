Feature: Free CRM app test 

Scenario: free crm create deal test 
	Given user is on deal page 
	When user fills the deals form 
	Then deal is created 
	
	
Scenario: free crm create contact test 
	Given user is on contact page 
	When user fills the contact form 
	Then contact is created