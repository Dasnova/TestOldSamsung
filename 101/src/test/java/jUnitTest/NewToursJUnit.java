package jUnitTest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;


 
public class NewToursJUnit {
	
@Test
	 // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	public void setUp() {
		 WebDriver driver = helperMethods.BrowserFactory.open("HJ");
			/*System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();*/
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			// 2. navigate to url
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			if ( driver != null) {
				 System.out.println("driver =" + driver);
				
				//} else {
					driver.findElement(By.name("userName")).sendKeys("okwonguya@yahoo.com");
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("password")).sendKeys("1234567890");
			driver.findElement(By.name("login")).click();
		    // throw new PendingException();
			//Verify that the Selenium log in Site
			String actualResult = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
			String expectedResult = "Flight Details";
			Assert.assertEquals(expectedResult, actualResult);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("Okwong that is your " + actualResult);
			 // Clickon Continue button
			driver.findElement(By.name("findFlights")).click();
			
			// User Signs out
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		 //   throw new PendingException();
	driver.close();
				}
	}
	}
			



