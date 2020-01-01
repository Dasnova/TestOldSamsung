package testNG;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
	 
	public class TruTestNG {
	 
public static 	WebDriver driver;
	 
	@Before
	public void setUp(){
			// launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("TruNarrative" + Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite"));
		if (link.isDisplayed()) {
			System.out.print("Pass");
			}
		else {
			System.out.print("Fail");
		}
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualResult = driver.findElement(By.className("bigger")).getText();
		String expectedResult = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";
		Assert.assertEquals(expectedResult, actualResult);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(" I can see " + actualResult);
		driver.findElement(By.xpath("//*[@id=\"menu-item-6055\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-6388\"]/a")).click();
	}
	 
	/*@AfterClass
	public void tearDown(){
	driver.quit();
	}*/
	 
	@Test
	public void testImages()throws Exception{
	 
	//File files = null;
	//Integer counter=0;
	 
	Thread.sleep(5000);
	if ( driver != null) {
		 System.out.println("driver =" + driver); 
		List<WebElement> TeamList =driver.findElements(By.tagName("img"));
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();  
		String text = null;
		for (WebElement ele : TeamList)
		{
			text = ele.getText();
			if (!text.equals(""));
			{
				map.put(1, text);
				map.put(2, text);
				
		}
		}
	}
	}
		}
	

