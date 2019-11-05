package stepDefinitions;

import cucumber.api.java.en.And;
import utils.DriverFactory;

public class ProductDetailsPageSteps extends DriverFactory {

	
	
	@And("^I add item to the cart$")
	public void i_add_item_to_the_cart() throws Exception {
		ProductDetailsPage.clickOnAddtoCartButton();
	}
	
}
