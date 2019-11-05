package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CreateAnAccount_Page extends BasePage{

	public @FindBy(id = "id_gender1") WebElement title;
	public @FindBy(id = "customer_firstname") WebElement customer_firstname;
	public @FindBy(id = "customer_lastname") WebElement customer_lastname;
	public @FindBy(id = "passwd") WebElement password;
	public @FindBy(id = "firstname") WebElement firstname;
	public @FindBy(id = "lastname") WebElement lastname;
	public @FindBy(id = "address1") WebElement address1;
	public @FindBy(id = "city") WebElement city;
	public @FindBy(id = "id_state") WebElement state;
	public @FindBy(id = "postcode") WebElement postcode;
	public @FindBy(id = "phone_mobile") WebElement mobile;	
	public @FindBy(id = "alias") WebElement alias;
	public @FindBy(id = "submitAccount") WebElement Register_Btn;
	
	public @FindBy(xpath = "/html//header[@id='header']//nav//a[@title='Log me out']") WebElement SignOut;
	
	public CreateAnAccount_Page() throws IOException {
		super();
	}
	
	public CreateAnAccount_Page selectTitle() throws Exception {
		waitAndClickElement(title);
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterCustomerFirstName() throws Exception {
		sendKeysToWebElement(customer_firstname,"Practise FN");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterCustomerLastName() throws Exception {
		sendKeysToWebElement(customer_lastname,"PractiseLFN");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterPassword() throws Exception {
		sendKeysToWebElement(password,"Password@123");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterFirstName() throws Exception {
		sendKeysToWebElement(firstname,"FN");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterLastName() throws Exception {
		sendKeysToWebElement(lastname,"LN");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterAddress1() throws Exception {
		sendKeysToWebElement(address1,"889 Collins Street");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterCity() throws Exception {
		sendKeysToWebElement(city,"Docklands");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page selectState(String StateValue) throws Exception {
		dropdownSelect(state, StateValue);
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterPostCode() throws Exception {
		sendKeysToWebElement(postcode,"12345");
		return new CreateAnAccount_Page();
	}

	public CreateAnAccount_Page enterMobile() throws Exception {
		sendKeysToWebElement(mobile,"9899890000");
		return new CreateAnAccount_Page();
	}
	
	public CreateAnAccount_Page enterAlias() throws Exception {
		sendKeysToWebElement(alias,"Shiva Prakash");
		return new CreateAnAccount_Page();
	}	

	public CreateAnAccount_Page clickOnRegisterButton() throws Exception {
		waitAndClickElement(Register_Btn);
		return new CreateAnAccount_Page();
	}
	
	public boolean isSignOutPresent() throws Exception {
		boolean flag = false;
		flag = SignOut.isDisplayed();
		return flag;
	}

}
