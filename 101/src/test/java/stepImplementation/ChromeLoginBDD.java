package stepImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ChromeLoginBDD {
	WebDriver driver;
	@Given("^that User is on the Home page$")
	public void that_User_is_on_the_Home_page() {
	//  1. Open the browser
			driver = helperMethods.BrowserFactory.open("chrome");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				 
				 // 2. navigate to url
					driver.get("http://automationpractice.com/index.php");
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
				//  3. Click Sign In Hyperlink
					driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
					
	}
	
	@When("^the User enters the correct username and password$")
		public void the_User_enters_the_correct_username_and_password() {
	//  4. Enter Username and Password
		driver.findElement(By.name("email")).sendKeys("okwonguya@yahoo.com");
		driver.findElement(By.name("passwd")).sendKeys("8Newpolice");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@And("^the User clicks on shirt and search$")
	public void the_user_clicks_on_shirt_and_search () {
	//  5.Click on T Shirts	
					driver.findElement(By.partialLinkText("SHIRTS")).click();
					driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");
							
				//  6. Search Button
					driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();	
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@Then("^the user should be logged in successfully$")
	public void the_user_should_be_logged_in_successfully() {
	//  7.Verify that the Selenium log in Site
				String actualResult = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
				String expectedResult = "3 results have been found.";
				Assert.assertEquals(expectedResult, actualResult);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println("Okwong do you know " + actualResult);
			//  8. Sign Out
						driver.findElement(By.className("logout")).click();
				driver.quit();
	}
}
