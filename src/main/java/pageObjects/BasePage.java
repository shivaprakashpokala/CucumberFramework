package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.listener.Reporter;

import utils.DriverFactory;

public class BasePage extends DriverFactory {

	protected WebDriverWait wait;
	protected JavascriptExecutor jsExecutor;
	private static String screenshotName;

	public BasePage() throws IOException {
		this.wait = new WebDriverWait(driver, 15);
		jsExecutor = ((JavascriptExecutor) driver);
	}

	/**********************************************************************************
	 ** CLICK METHODS
	 * 
	 * @throws IOException
	 **********************************************************************************/
	public void waitAndClickElement(WebElement element) throws InterruptedException, IOException {
		boolean clicked = false;
		int attempts = 0;
		while (!clicked && attempts < 10) {
			try {
				this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
				clicked = true;
			} catch (Exception e) {
				System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
				Assert.fail(
						"Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
			}
			attempts++;
		}
	}

	/**********************************************************************************
	 ** SEND KEYS METHOD /
	 **********************************************************************************/
	public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
		try {
			this.WaitUntilWebElementIsVisible(element);
			element.clear();
			element.sendKeys(textToSend);
			System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<"
					+ element.toString() + ">");
		} catch (Exception e) {
			System.out.println("Unable to locate WebElement: " + "<" + element.toString()
					+ "> and send the following keys: " + textToSend);
			Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
		}
	}

	/**********************************************************************************
	 ** SELECT DROPDOWN SELECT METHOD /
	 **********************************************************************************/
	public void dropdownSelect(WebElement element, String textToSelect) throws Exception {

		try {
			Select Cdropdown = new Select(element);
			Cdropdown.selectByVisibleText(textToSelect);
			System.out.println("Successfully clicked the dropdown field: " + "<" 
						+ element.toString() + ">" + " and selected the dropdown value " + textToSelect);
		} catch (Exception e) {
			System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
			Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
		}

	}

	/**********************************************************************************
	 ** WAIT METHODS
	 **********************************************************************************/
	public boolean WaitUntilWebElementIsVisible(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
			Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
			return false;
		}
	}


	public boolean isElementClickable(WebElement element) {
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(element));
			System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
			return true;
		} catch (Exception e) {
			System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
			return false;
		}
	}

	/**********************************************************************************
	 ** MOUSE HOVER AND CLICK METHOD
	 **********************************************************************************/
	public void mouseHoverAndClick(String cat, String subcat) throws Exception {
		Actions action = new Actions(driver);
		try {
			WebElement category = driver.findElement(By.linkText(cat));
			action.moveToElement(category).build().perform();
			System.out.println("Successfully hover the mouse on the WebElement:  " + "<" + cat + ">");
			
			WebDriverWait wait = new WebDriverWait(driver, 5); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(subcat)));
			WebElement subcategory = driver.findElement(By.linkText(subcat));
			subcategory.click();
			
		} catch (Exception e) {
			Assert.fail("Unable to hover the mouse on category: " + cat + " or Sub category: " + subcat+ " Exception: " + e.getMessage());
		}
	}
	
	/**********************************************************************************
	 ** PAGE METHODS
	 **********************************************************************************/
	public BasePage loadUrl(String url) throws Exception {
		driver.get(url);
		return new BasePage();
	}

	public String getCurrentURL() {
		try {
			String url = driver.getCurrentUrl();
			System.out.println("Found(Got) the following URL: " + url);
			return url;
		} catch (Exception e) {
			System.out.println("Unable to locate (Get) the current URL, Exception: " + e.getMessage());
			return e.getMessage();
		}
	}

	/***
	 * EXTENT REPORT
	 ****************************************************************/
	public static String returnDateStamp(String fileExtension) {
		Date d = new Date();
		String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
		return date;
	}

	public static void captureScreenshot() throws IOException, InterruptedException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		screenshotName = returnDateStamp(".jpg");

		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));

		Reporter.addStepLog("Taking a screenshot!");
		Reporter.addStepLog("<br>");
		Reporter.addStepLog("<a target=\"_blank\", href=" + returnScreenshotName() + "><img src="
				+ returnScreenshotName() + " height=200 width=300></img></a>");
	}

	public static String returnScreenshotName() {
		return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
	}

}
