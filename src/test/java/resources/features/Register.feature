#Author: Shiva Prakash Pokala (prakash.pokala@gmail.com)

@FullTestSuite
Feature: Register Functionality

  @Register
  Scenario Outline: Validation of registation functionality with valid email address
    Given I am on the home page
    When I click on Signin link 
    And I enter "<email_address>"
    And I click on Create an account button 
    Then I see Create An Account page 
    And Complete the registration process
    # Authors Comments 
    #Providing same registtration details for all the accounts, hence no parameters mentioned

    Examples: 
      | email_address 					| 
      | pokala010@example.com 	|
      
  @Register
  Scenario Outline: Validation of registation functionality with existing email address
    Given I am on the home page
    When I click on Signin link 
    And I enter "<email_address>"
    And I click on Create an account button 
    Then Portal displays an error message "<error_message>"

    Examples: 
      | email_address 					| error_message 														|
      | assignment1@example.com | email address has already been registered |
      
  @Register
  Scenario Outline: Validation of registation functionality with incorrect email address
    Given I am on the home page
    When I click on Signin link 
    And I enter "<email_address>"
    And I click on Create an account button 
    Then Portal displays an error message "<error_message>"

    Examples: 
      | email_address 	 | error_message 					|
      | assignment1@.com | Invalid email address 	| 
      | assignment1			 | Invalid email address 	| 
      | .com						 | Invalid email address 	| 
      
      
      
      
      
      
