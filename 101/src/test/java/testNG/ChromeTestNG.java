package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ChromeTestNG {
	WebDriver driver;
//  1. Open the browser
	@Test
	public void ChromeLogin() {
		
		driver = helperMethods.BrowserFactory.open("chrome");
		/*System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			 
	 // 2. navigate to url
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//  3. Click Sign In Hyperlink
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
	//  4. Enter Username and Password
		driver.findElement(By.name("email")).sendKeys("okwonguya@yahoo.com");
		driver.findElement(By.name("passwd")).sendKeys("8Newpolice");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//  5.Click on T Shirts	
		driver.findElement(By.partialLinkText("SHIRTS")).click();
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");
				
	//  6. Search Button
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//    7.Verify that the Selenium log in Site
		String actualResult = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
		String expectedResult = "3 results have been found.";
		Assert.assertEquals(expectedResult, actualResult);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Okwong do you know " + actualResult);
	//  8. Sign Out
		driver.findElement(By.className("logout")).click();
	
	// 	9.Close Browser
		driver.quit();


	}

	
}
