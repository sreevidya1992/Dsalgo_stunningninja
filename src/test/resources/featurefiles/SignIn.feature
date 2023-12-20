
@SignIn
Feature: Sign in Feature

  @LoginTS02
  Scenario Outline: Sign in to portal
    Given The user opens Sign in Page
    When User enters username "<name>" and passord "<value>" and user clicks on Login Button
    #Then verify the "<status>" in the step
    #Then user will be redirected to home page with message "You are logged in" and user clicks sign out if "<status>" is "success"
    Then verify the "<status>" from "<identifier>" and if user redirected to home page with message "You are logged in" then user clicks sign out

    Examples: 
      | name          | value      | status                        |identifier	|
      |               |            |Please fill out this field.    |USER_NAME		|
      |abc            |            |Please fill out this field.    |PASSWORD		|
      |abc            |abc         |Invalid Username and Password  |ALERT				|
      |stunningninja  |abc         |Invalid Username and Password  |ALERT				|
      |stunningninja  |TestWeb@321 |You are logged in  						 |ALERT				|
    
      