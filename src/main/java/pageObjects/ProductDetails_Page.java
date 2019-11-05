package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails_Page extends BasePage{

	public String DressNameValue;
	public String QuantityValue;
	public String ColorValue;
	
	public @FindBy(xpath = "//p[@id='add_to_cart']//span[.='Add to cart']") WebElement AddToCartBtn;
	public @FindBy(xpath = "//html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span") WebElement ProceedToCheckoutBtn;
	
	
	public ProductDetails_Page() throws IOException {
		super();
	}
	
	public ProductDetails_Page clickOnAddtoCartButton() throws Exception {
		
		DressNameValue = 
				driver.findElement(By.xpath("/html//div[@id='center_column']//h1")).getText();
		QuantityValue = driver.findElement(By.id("quantity_wanted")).getAttribute("value").toString();
		ColorValue = 
				driver.findElement(By.xpath("//ul[@id='color_to_pick_list']//a[@class='color_pick selected']")).getAttribute("name").toString();
		
		// storing the dress details in scenario context variable for future validation
		scenarioConext.setProductDetails("DressName", DressNameValue);
		scenarioConext.setProductDetails("Quantity", QuantityValue);
		scenarioConext.setProductDetails("Color", ColorValue);
		
		waitAndClickElement(AddToCartBtn);
		waitAndClickElement(ProceedToCheckoutBtn);

		return new ProductDetails_Page();
	}

}