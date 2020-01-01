package stepImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SauceLoginBDD {
	
	WebDriver driver;
	 @Given ("^that User is on the Web page$") 
	 public void that_User_is_on_the_Web_page() {
		//  1. Open the browser
			
				driver = helperMethods.BrowserFactory.open("chrome");
				//System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
						//WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }
	   @When ("^User enters the correct login credentials$")
	   public void User_enters_the_correct_login_credentials () {
		// 2. navigate to url
					driver.get("https://www.saucedemo.com/");
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					// User Sign In
					driver.findElement(By.id("user-name")).sendKeys("standard_user");
					driver.findElement(By.id("password")).sendKeys("secret_sauce");
					driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	    @And ("^add items to the cart$")
	    public void add_items_t0_the_cart() {
	    	//3. add items to cart
			driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id="shopping_cart_container"]/a/span")).click();
	    	
	    	
	    }
	    @Then ("^User should logout$")
	    public void User_should_logout() {
	    	//4. Verify that User login successfully before login out
			String actualResult = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
			String expectedResult = "Sauce Labs Backpack";
			Assert.assertEquals(expectedResult, actualResult);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("Okwong do you know " + actualResult);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.findElement(By.id("logout_sidebar_link")).click();
			
			// close broswer
						driver.quit();
	    }
}
