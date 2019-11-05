package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class CreateAnAccountPageSteps extends DriverFactory{
	
	
	@Then("^I see Create An Account page$")
	public void i_see_create_an_account_page() {
		if (!CreateAnAccountPage.getCurrentURL().contains("my-account")) {
			Assert.fail("Unexpected Error, Portal did not redirect to Create Account page. Test Failed");			
		}
			
}
	
	@And("Complete the registration process")
	public void complete_the_registration_process() throws Exception {

		//Enter Registration Information Details
		CreateAnAccountPage.selectTitle();
		CreateAnAccountPage.enterCustomerFirstName();
		CreateAnAccountPage.enterCustomerLastName();
		CreateAnAccountPage.enterPassword();
		CreateAnAccountPage.enterFirstName();
		CreateAnAccountPage.enterLastName();
		CreateAnAccountPage.enterAddress1();
		CreateAnAccountPage.enterCity();
		CreateAnAccountPage.selectState("Alabama");
		CreateAnAccountPage.enterPostCode();
		CreateAnAccountPage.enterMobile();
		CreateAnAccountPage.enterAlias();
		
		//Clicks on Register Buttons
		CreateAnAccountPage.clickOnRegisterButton();
		
		if (!CreateAnAccountPage.isSignOutPresent()) {
			Assert.fail("Unexpected Error, Registration incomplete. Test Failed");
		}
	}
}

