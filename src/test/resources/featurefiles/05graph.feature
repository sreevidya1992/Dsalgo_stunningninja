Feature: Testing Graph data Structure
  I want to use this template for my feature file
  
 Background:
    Given User is on Login Page
    When  User enters username
    And   User   enters Password
    And   User cliicks on Login Button
    Then  User redirects to "NumpyNinja" home page 
  
  @GraphPage @TC_Graph_001
  Scenario: Clicking the graph button
    Given User is in graph page after login
    When User clicks graph button
    Then User should be directed to graph page
    
		When user selects second graph button
		Then user is able to view the tryEditor 
		
  @GraphRepresentationPage @TC_Graph_002
  Scenario: Clicking the graph representation button
    Given User is in graph rep page
    When user selects graph representation button
		Then user is able to view the tryRepEditor 
