#Author: Shiva Prakash Pokala (prakash.pokala@gmail.com)

@FullTestSuite
Feature: Add to Cart fucntionality

  @AddToCart
  Scenario Outline: Validation of Add to Cart functionality (with a single item)
    Given I am on the home page
    When I hover on "<MegaMenuCat>" and click on "<SubCat>"
    And I click on a "<Dress>"
    And I add item to the cart
    Then Item added in the cart as expected

    Examples: 
   		# ** please provide menu category, sub category and Dress details in case sensitive **
      | MegaMenuCat	 | SubCat 						| Dress	 										|
      | DRESSES			 | SUMMER DRESSES			| Printed Chiffon Dress 		|
      | WOMEN				 | Evening Dresses		| Printed Dress 						|

