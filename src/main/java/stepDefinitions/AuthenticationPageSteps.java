package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class AuthenticationPageSteps extends DriverFactory {

	@And("^I enter \\\"([^\\\"]*)\\\"$")
	public void i_enter(String EmailAddress) throws Exception {
		AuthenticationPage.enterEmailAddrForCreateAcc(EmailAddress);
	}

	@And("^I click on Create an account button$")
	public void i_click_on_Create_an_account_button() throws Exception {
		AuthenticationPage.clickCreateAnAccountButton();

	}

	@Then("^Portal displays an error message \\\"([^\\\"]*)\\\"$")
	public void portal_displays_an_error_message(String ExpectedError) throws Exception {
		assertThat(AuthenticationPage.ErrorMessage(), containsString(ExpectedError));
	}

}
