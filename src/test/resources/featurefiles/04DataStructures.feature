
Feature: DataStructures
 A  Data structure is a way to store, organize, and manage information(or data) in a way that allows the programmer to easily access or modify the values in them.

  Background:
    Given User is on Login Page
    When  User enters username
    And   User   enters Password
    And   User cliicks on Login Button
    Then  User redirects to "NumpyNinja" home page
    
  @DataStructuresTS03
  Scenario: DataStructures
    Given  User Clicks on "Get Strated" Button on  "Data Structures-Introduction"
    Then   The user should land in "Data Structures-Introduction" Page 
    Given  User is on Data structures-Introduction page
    When   The user clicks "Time Complexity" button
    Then   User will be redirected to "Time Complexity" page
    When   The user clicks "Try Here" button on Time Complexity page
    Then   The user should be redirected to a page having an tryEditor with a Run button to test
    Then   User should navigate back to previous page
    When   The user clicks the "Practice Questions" link on left side of page
    Then   The user should be redirected to "Practice Questions" of Data structures-Introduction
    And    User clicks Sign out
    
   
    
    
    

  
