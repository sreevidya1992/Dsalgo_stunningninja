
@tag @stackFeature
Feature: Testing Stack Data Structure
  User will be able to learn about Stack Data Structure

  @tag1 @TS01
  Scenario: Learning Operations in Stack
    Given The user is in the "Stack" page after logged in
    When The user try to click the "Operations in Stack" button
    Then The user should be directed to "Operations in Stack" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
		When The user enter a sample code in the tryEditor 
		And The user try to click the "Run" button
		Then The result should be printed
		
		@tag2 @TS02
  Scenario: Learning Implementations in Stack
    Given The user navigationg back to the "Stack" page
    When The user try to click the "Implementation" button
    Then The user should be directed to "implementation" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
    When The user enter a sample code in the tryEditor 
    And The user try to click the "Run" button
		Then The result should be printed
		
		
	@tag3 @TS03
  Scenario: Learning Applications in Stack
    Given The user navigationg back to the "Stack" page
    When The user try to click the "Applications" button
    Then The user should be directed to "stack-applications" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
    When The user enter a sample code in the tryEditor 
    And The user try to click the "Run" button
		Then The result should be printed
    
  @tag4 @TS04
  Scenario: Side Links
    Given The user navigationg back to the "stack-applications" page
    When The user clicks "Operations in Stack" link at the left side
    Then The user should be directed to "Operations in Stack" Page
    When The user clicks "Implementation" link at the left side
    Then The user should be directed to "implementation" Page
    When The user clicks "Applications" link at the left side
    Then The user should be directed to "stack-applications" Page
		When The user clicks "Practice Questions" link at the left side
    Then The user should be directed to "practice" Page
    And  User try to click the Sign out
		
	