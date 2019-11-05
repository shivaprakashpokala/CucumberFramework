package stepDefinitions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class ProductsPageSteps extends DriverFactory{

	@Then("^I see \\\"([^\\\"]*)\\\" page$")
	public void i_see_page(String title) throws Exception {
		title = title.toUpperCase();
		assertThat(ProductsPage.catalogItem(), containsString(title));
	}
	
	@And("^I click on a \\\"([^\\\"]*)\\\"$")
	public void i_click_on_a(String DressName) throws Exception {
		ProductsPage.clickOnaDress(DressName);
	}
	
	
}
