@Array
Feature: Testing Array Page



	Scenario: Arrays 
    Given user is in the Array page after logged in
    When user clicks "Arrays in Python" link
    Then user should be redirected to "Arrays in Python" page and click the sidelink of arrays in python
    When user clicks "Try Here" button 
    Then user should be redirected to a page having an tryEditor with a Run button to test
    Then user should redirected to array page

	 
    
    When user wants "Arrays Using List" link
    Then user should be redirected to "Arrays Using List" page and click the sidelink of Arrays Using List
    When user clicks "Try Here" button 
    Then user should be redirected to a page having an tryEditor with a Run button to test
    Then user should redirected to array page

	
    When user selects "Basic Operations in List" link
    Then user should be redirected to "Basic Operations in List" page and click the sidelink of Basic Operations in List
    When user clicks "Try Here" button 
    Then user should be redirected to a page having an tryEditor with a Run button to test
    Then user should redirected to array page
    
    When user want to learn "Applications of Array" link
    Then user should be redirected to "Applications of Array" page and click the sidelink of Applications of Array
    When user clicks "Try Here" button 
    Then user should be redirected to a page having an tryEditor with a Run button to test
   Then user should be redirected to "Practice" page
    
    
  	
		When user clicks the "Search the array" link
		Then user should be redirected to "Question" page contains questions,an tryEditor to write code with Run and Submit buttons
		Then user should redirected to practice page
		When user clicks the "Max Consecutive Ones" link in Practice page
		Then user should be redirected to "Question" page contains questions,an tryEditor to write code with Run and Submit buttons
		Then user should redirected to practice page
		When user selects "Find Numbers with Even Number of Digits" link in Practice page
		Then user should be redirected to "Question" page contains questions,an tryEditor to write code with Run and Submit buttons
		Then user should redirected to practice page
		When user clicks "Squares of a  Sorted Array" link in Practice page
		Then user should be redirected to "Question" page contains questions,an tryEditor to write code with Run and Submit buttons
		Then user should redirected to practice page
		And user click Sign Out