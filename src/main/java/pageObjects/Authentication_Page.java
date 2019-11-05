package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Authentication_Page extends BasePage{
	public @FindBy(id = "email_create") WebElement email_createaccount;
	public @FindBy(id = "SubmitCreate") WebElement CreateAnAccount_Btn;
	public @FindBy(id = "email_create") WebElement CreateEmail_TxtBox;
	public @FindBy(xpath = "//div[@id='create_account_error']//li") WebElement error_message;
	
	public Authentication_Page() throws IOException {
		super();
	}
	
	public Authentication_Page enterEmailAddrForCreateAcc(String EmailAdd) throws Exception {
		sendKeysToWebElement(CreateEmail_TxtBox,EmailAdd);
		return new Authentication_Page();
	}
	
	public Authentication_Page clickCreateAnAccountButton() throws Exception {
		waitAndClickElement(CreateAnAccount_Btn);
		return new Authentication_Page();
	}
	
	public String ErrorMessage() throws Exception {
		String error_msg_txt;
		if (WaitUntilWebElementIsVisible(error_message)) {
			error_msg_txt = error_message.getText();
			return error_msg_txt;
		}
		return null;
	}
	
}
