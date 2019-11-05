package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends BasePage{

	public @FindBy(xpath = "//div[@id='center_column']//span[@class='cat-name']") WebElement cat_title;
	
	
	public Products_Page() throws IOException {
		super();
	}
	
	public String catalogItem () throws Exception {
		WaitUntilWebElementIsVisible(cat_title);
		return cat_title.getText();
	}
	
	public Products_Page clickOnaDress(String DressName) throws Exception {
		
		WebElement Dress = driver.findElement(By.linkText(DressName));
		if (!Dress.isDisplayed())
			Assert.fail("Dress not avialable on the page, please correct the test data and try again");
		Dress.click();
		return new Products_Page();
	}
	
}
