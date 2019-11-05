package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CartSummary_Page extends BasePage {

	public String DressNameInCartSummaryPage;
	public String QuantityInCartSummaryPage;
	public String ColorInCartSummaryPage;
	
	public CartSummary_Page() throws IOException {
		super();
	}
	
	public CartSummary_Page verifyProductDetails() throws Exception {
		
		DressNameInCartSummaryPage = 
				driver.findElement(By.xpath("/html//table[@id='cart_summary']/tbody/tr//p/a")).getText();
		QuantityInCartSummaryPage = 
				driver.findElement(By.xpath("//table[@id='cart_summary']/tbody/tr//input")).getAttribute("value").toString();
		ColorInCartSummaryPage = 
				driver.findElement(By.xpath("/html//table[@id='cart_summary']/tbody/tr/td[@class='cart_description']/small[2]/a")).getText();
		
		// String pattern Color : Yellow, Size : S (8chars beginning)
		ColorInCartSummaryPage= ColorInCartSummaryPage.substring(8,ColorInCartSummaryPage.indexOf(", Size :") );
		
		
		System.out.println("Product Details in Cart Summary Page");
		System.out.println("Dress Name is " +DressNameInCartSummaryPage);
		System.out.println("Quanity is " +QuantityInCartSummaryPage);
		System.out.println("Color is " +ColorInCartSummaryPage);
		
		
		scenarioConext.setCartSummaryProductDetails("DressName", DressNameInCartSummaryPage);
		scenarioConext.setCartSummaryProductDetails("Quantity", QuantityInCartSummaryPage);
		scenarioConext.setCartSummaryProductDetails("Color", ColorInCartSummaryPage);
		
		System.out.println("Product Details in Cart Summary Page - Scenario Context Hashmap");
		System.out.println("Dress Name is " +scenarioConext.getCartSummaryProductDetails("DressName"));
		System.out.println("Quanity is " +scenarioConext.getCartSummaryProductDetails("Quantity"));
		System.out.println("Color is " +scenarioConext.getCartSummaryProductDetails("Color"));
		
		Assert.assertTrue("Details of the selected product and Detail of the product in Cart Summary Page are matching",
				scenarioConext.ExpectedProductDetails.equals(scenarioConext.CartSummaryProductDetails));
		
		return new CartSummary_Page();
		
	}

}
