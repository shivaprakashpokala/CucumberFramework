package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class HomePageSteps extends DriverFactory {

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Exception {
//		getDriver().get("http://automationpractice.com/index.php");
//		Reporter.addStepLog("Accessing AutomationPractise");
		HomePage.getHomePage();
	}

	@When("^I click on Signin link$")
	public void i_click_on_Signin_link() throws Exception {
		HomePage.clickSignIn();
	}
	
	@When("^I hover on \\\"([^\\\"]*)\\\" and click on \\\"([^\\\"]*)\\\"$")
	public void i_hover_on_and_click_on(String MegaMenuCat, String SubCat) throws Exception{
		HomePage.hoverOnCatAndClickOnSubCat(MegaMenuCat, SubCat);
	}
	
	@When("^I click on \\\"([^\\\"]*)\\\"$")
	public void i_click_on(String maincat) throws Exception{
		HomePage.clickOnCategory(maincat);
	}
}
