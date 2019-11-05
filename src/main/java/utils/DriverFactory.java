package utils;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Authentication_Page;
import pageObjects.CartSummary_Page;
import pageObjects.Home_Page;
import pageObjects.ProductDetails_Page;
import pageObjects.Products_Page;
import pageObjects.ScenarioContext;
import pageObjects.CreateAnAccount_Page;

public class DriverFactory {
	public static WebDriver driver;
	public static Home_Page HomePage;
	public static Authentication_Page AuthenticationPage;
	public static CreateAnAccount_Page CreateAnAccountPage;
	public static Products_Page ProductsPage;
	public static CartSummary_Page CartSummaryPage;
	public static ProductDetails_Page ProductDetailsPage;
	public static ScenarioContext scenarioConext;
	
	public WebDriver getDriver() {
		try {
			// Read Maven property to determine browser
			String browserName = System.getProperty("browser").toLowerCase();
			switch (browserName) {
			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				break;

			case "chrome": 
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
					// CHROME OPTIONS
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--start-maximized");
					options.addArguments("disable-infobars");
					driver = new ChromeDriver(options);
				}
				break;
			default:
				Assert.fail("Incorrect Browser name, please specifiy either  chromer or firefox during rerun");
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} 
		finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			scenarioConext = new ScenarioContext();
			HomePage = PageFactory.initElements(driver, Home_Page.class);
			AuthenticationPage = PageFactory.initElements(driver, Authentication_Page.class);
			CreateAnAccountPage = PageFactory.initElements(driver, CreateAnAccount_Page.class);
			ProductsPage = PageFactory.initElements(driver, Products_Page.class);
			CartSummaryPage = PageFactory.initElements(driver, CartSummary_Page.class);
			ProductDetailsPage = PageFactory.initElements(driver, ProductDetails_Page.class);
		}
		return driver;
	}
}
