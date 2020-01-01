package stepImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;


public class NewToursBDD {

	public static WebDriver driver;
	@Given("^That the User is on NewTours Page$")
	public void that_the_User_is_on_NewTours_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriver driver = helperMethods.BrowserFactory.open("t");
			/*System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();*/
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// 2. navigate to url
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	@When("^entered correct login details$")
	// Write code here that turns the phrase above into concrete actions
	public static void entered_correct_login_details()  {
		if ( driver != null) {
			 System.out.println("driver =" + driver);
		}
		else
	
			driver.findElement(By.name("userName")).sendKeys("okwonguya@yahoo.com");
		    		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.name("login")).click(); 
	
	}

	@Then("^the User should login$")
	public void the_User_should_login()  {
	    		 // Verify that User login and click on continue button
		if ( driver != null) {
			 System.out.println("driver =" + driver);
			 String actualResult = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
				String expectedResult = "Flight Details";
				Assert.assertEquals(expectedResult, actualResult);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println("Okwong that is your " + actualResult);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("findFlights")).click();
		}
	}

	@Then("^select flight details$")
	public void select_flight_details()  {
	    // Write code here that turns the phrase above into concrete actions
		// User Signs out
		if ( driver != null) {
			 System.out.println("driver =" + driver);
					driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
				 //   throw new PendingException();
			driver.quit();
	}

	}
}
