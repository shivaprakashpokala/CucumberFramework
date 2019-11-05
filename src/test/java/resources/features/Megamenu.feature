#Author: Shiva Prakash Pokala (prakash.pokala@gmail.com)

@FullTestSuite
Feature: Megamenu fucntionality

  @MegaMenu
  Scenario Outline: Validation of Megamenu functionality - Category and SubCategory
    Given I am on the home page
    When I hover on "<MegaMenuCat>" and click on "<SubCat>"
    Then I see "<SubCat>" page

    Examples: 
   		# ** please provide menu category and sub category in case sensitive **
      | MegaMenuCat	 | SubCat 					| 
      #| DRESSES			 | SUMMER DRESSES 	|
      | WOMEN				 | Evening Dresses					|

   @MegaMenu
  Scenario Outline: Validation of Megamenu functionality - Category
    Given I am on the home page
    When I click on "<Cat>"
    Then I see "<Cat>" page

    Examples: 
   		# ** please provide menu category and sub category in case sensitive **
      | Cat	 			| 
      | WOMEN			| 
      