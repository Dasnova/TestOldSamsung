package truNarrativeTest;

import java.util.concurrent.TimeUnit;


import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import junit.framework.Assert;

public class NewTruJUnit {

	WebDriver driver;
	 
	@Before
	public static void setUp(){
			// launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
				driver.findElement(By.name("q")).sendKeys("TruNarrative" + Keys.ENTER);
					 WebElement link =driver.findElement(By.className("iUh30"));
				 
				if (link.isDisplayed()) {
					System.out.print("https://trunarrative.com/") ;
					
					}
					else {
					System.out.print("link not found");
					
				}
								
				/*if ( driver != null) {
					 System.out.println("driver =" + driver); 			
				*/
					//verify search return displays : https://trunarrative.com/
					/*if ( driver != null) {
						 System.out.println("driver =" + driver); */
			
				//Navigate to TruNarrative website
				driver.findElement(By.className("iUh30")).click();;
					//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//Verify that the strap line “Easy Onboarding.  Smooth Transactions.  Insightful Compliance.” Is found on the page.
					String actualResult = driver.findElement(By.className("bigger")).getText();
					String expectedResult = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";
					Assert.assertEquals(expectedResult, actualResult);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					System.out.println("\n I can see " + actualResult);
				
				//Navigate via the UI to the TruNarrative Team page
					driver.findElement(By.xpath("//*[@id=\"menu-item-6055\"]/a")).click();
					driver.findElement(By.xpath("//*[@id=\"menu-item-6388\"]/a")).click();
			//verify that three people held these positions
					String actualResult1 = driver.findElement(By.xpath("//*[@id=\"main-content-wrapper\"]/section[2]"
							+ "/div/article/div/div[1]/div[2]/div/h2")).getText();
					
					String actualResult2 = driver.findElement(By.xpath("//*[@id=\"main-content-wrapper\"]/section[2]"
							+ "/div/article/div/div[1]/div[2]/div/p")).getText();
					
					String expectedResult1 = "John Lord";
					String expectedResult2 = "Founder & CEO";
				Assert.assertEquals(expectedResult1, actualResult1);
				 Assert.assertEquals(expectedResult2, actualResult2);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
									
					System.out.println("I know " + actualResult1 );
					System.out.print("He is the " + actualResult2 );
							
	}}



