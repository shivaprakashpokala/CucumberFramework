$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/features/AddToCart.feature");
formatter.feature({
  "name": "Add to Cart fucntionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FullTestSuite"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validation of Add to Cart functionality (with a single item)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I hover on \"\u003cMegaMenuCat\u003e\" and click on \"\u003cSubCat\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on a \"\u003cDress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I add item to the cart",
  "keyword": "And "
});
formatter.step({
  "name": "Item added in the cart as expected",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MegaMenuCat",
        "SubCat",
        "Dress"
      ]
    },
    {
      "cells": [
        "DRESSES",
        "SUMMER DRESSES",
        "Printed Chiffon Dress"
      ]
    },
    {
      "cells": [
        "WOMEN",
        "Evening Dresses",
        "Printed Dress"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of Add to Cart functionality (with a single item)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover on \"DRESSES\" and click on \"SUMMER DRESSES\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_hover_on_and_click_on(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on a \"Printed Chiffon Dress\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPageSteps.i_add_item_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Item added in the cart as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "CartSummaryPageSteps.item_added_in_the_cart_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of Add to Cart functionality (with a single item)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@AddToCart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover on \"WOMEN\" and click on \"Evening Dresses\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_hover_on_and_click_on(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on a \"Printed Dress\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProductsPageSteps.i_click_on_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add item to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPageSteps.i_add_item_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Item added in the cart as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "CartSummaryPageSteps.item_added_in_the_cart_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});