package stepDefinitions;

import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class CartSummaryPageSteps extends DriverFactory {

	@Then("Item added in the cart as expected")
	public void item_added_in_the_cart_as_expected() throws Exception {
		CartSummaryPage.verifyProductDetails();
	}
	
}
