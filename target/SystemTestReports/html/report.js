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
formatter.uri("file:src/test/java/resources/features/Megamenu.feature");
formatter.feature({
  "name": "Megamenu fucntionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FullTestSuite"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validation of Megamenu functionality - Category and SubCategory",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MegaMenu"
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
  "name": "I see \"\u003cSubCat\u003e\" page",
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
        "SubCat"
      ]
    },
    {
      "cells": [
        "WOMEN",
        "Evening Dresses"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of Megamenu functionality - Category and SubCategory",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@MegaMenu"
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
  "name": "I see \"Evening Dresses\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsPageSteps.i_see_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validation of Megamenu functionality - Category",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@MegaMenu"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on \"\u003cCat\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I see \"\u003cCat\u003e\" page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Cat"
      ]
    },
    {
      "cells": [
        "WOMEN"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of Megamenu functionality - Category",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@MegaMenu"
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
  "name": "I click on \"WOMEN\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"WOMEN\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsPageSteps.i_see_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/resources/features/Register.feature");
formatter.feature({
  "name": "Register Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FullTestSuite"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validation of registation functionality with valid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003cemail_address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.step({
  "name": "I see Create An Account page",
  "keyword": "Then "
});
formatter.step({
  "name": "Complete the registration process",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email_address"
      ]
    },
    {
      "cells": [
        "pokala007@example.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of registation functionality with valid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@Register"
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
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"pokala007@example.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Create An Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAnAccountPageSteps.i_see_create_an_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Complete the registration process",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnAccountPageSteps.complete_the_registration_process()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validation of registation functionality with existing email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003cemail_address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.step({
  "name": "Portal displays an error message \"\u003cerror_message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email_address",
        "error_message"
      ]
    },
    {
      "cells": [
        "assignment1@example.com",
        "email address has already been registered"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of registation functionality with existing email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@Register"
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
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"assignment1@example.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Portal displays an error message \"email address has already been registered\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.portal_displays_an_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validation of registation functionality with incorrect email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \"\u003cemail_address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.step({
  "name": "Portal displays an error message \"\u003cerror_message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email_address",
        "error_message"
      ]
    },
    {
      "cells": [
        "assignment1@.com",
        "Invalid email address"
      ]
    },
    {
      "cells": [
        "assignment1",
        "Invalid email address"
      ]
    },
    {
      "cells": [
        ".com",
        "Invalid email address"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validation of registation functionality with incorrect email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@Register"
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
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"assignment1@.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Portal displays an error message \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.portal_displays_an_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of registation functionality with incorrect email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@Register"
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
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"assignment1\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Portal displays an error message \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.portal_displays_an_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of registation functionality with incorrect email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FullTestSuite"
    },
    {
      "name": "@Register"
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
  "name": "I click on Signin link",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.i_click_on_Signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \".com\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPageSteps.i_click_on_Create_an_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Portal displays an error message \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPageSteps.portal_displays_an_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});