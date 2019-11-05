package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage{
	
	public @FindBy(xpath = "/html//header[@id='header']//nav//a[@title='Log in to your customer account']") WebElement SignIn_Link;
	
	public Home_Page() throws IOException {
		super();
	}
	
	public Home_Page getHomePage() throws IOException {
		getDriver().get("http://automationpractice.com/index.php");
		return new Home_Page();
	}
	
	public Home_Page clickSignIn() throws Exception {
		waitAndClickElement(SignIn_Link);
		return new Home_Page();
	}
	
	public Home_Page hoverOnCatAndClickOnSubCat(String cat, String subcat) throws Exception {
		cat = cat.trim();
		subcat = subcat.trim();
		if (subcat.isEmpty())
		{
			WebElement category = driver.findElement(By.linkText(cat));
			waitAndClickElement(category);
		}
		else {
		mouseHoverAndClick(cat, subcat);
		}
		return new Home_Page();
	}
	
	public Home_Page clickOnCategory(String category) throws Exception {
		WebElement cat = driver.findElement(By.linkText(category));
		waitAndClickElement(cat);
		return new Home_Page();
	}
	
	
	

}
