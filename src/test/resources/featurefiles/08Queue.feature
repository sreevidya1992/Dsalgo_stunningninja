
@tag @queueFeature
Feature: Testing Queue Data Structure
  User will be able to learn about Queue Data Structure

  @tag1 @TS01
  Scenario: Learning Implementation of Queue in Python
    Given The user is in the "Queue" page after logged in
    When The user try to click the "Implementation of Queue in Python" button
    Then The user should be directed to "implementation-lists" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
		When The user enter a sample code in the tryEditor 
		And The user try to click the "Run" button
		Then The result should be printed
		
		@tag2 @TS02
  Scenario: Learning Implementation using collections.deque
    Given The user navigationg back to the "queue" page
    When The user try to click the "Implementation using collections.deque" button
    Then The user should be directed to "implementation-collections" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
    When The user enter a sample code in the tryEditor 
    And The user try to click the "Run" button
		Then The result should be printed
		
		
	@tag3 @TS03
  Scenario: Learning Implementation using Array
    Given The user navigationg back to the "queue" page
    When The user try to click the "Implementation using Array" button
    Then The user should be directed to "Implementation-array" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
    When The user enter a sample code in the tryEditor 
    And The user try to click the "Run" button
		Then The result should be printed
    
    @tag4 @TS04
  Scenario: Learning Queue Operations
    Given The user navigationg back to the "queue" page
    When The user try to click the "Queue Operations" button
    Then The user should be directed to "QueueOp" Page
    When The user try to click the "Try Here" button
    Then The user should be redirected to "tryEditor" page with a Run button to test
    When The user enter a sample code in the tryEditor 
    And The user try to click the "Run" button
		Then The result should be printed
    
  @tag5 @TS05
  Scenario: Side Links
    Given The user navigationg back to the "QueueOp" page
    When The user clicks "Implementation of Queue in Python" link at the left side
    Then The user should be directed to "implementation-lists" Page
    When The user clicks "Implementation using collections.deque" link at the left side
    Then The user should be directed to "implementation-collections" Page
    When The user clicks "Implementation using Array" link at the left side
    Then The user should be directed to "Implementation-array" Page
    When The user clicks "Queue Operations" link at the left side
    Then The user should be directed to "QueueOp" Page
		When The user clicks "Practice Questions" link at the left side
    Then The user should be directed to "practice" Page
    And  User try to click the Sign out
		
	