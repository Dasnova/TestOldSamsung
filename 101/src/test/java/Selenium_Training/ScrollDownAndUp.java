package Selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class ScrollDownAndUp {

	WebDriver driver;
	@Test
	public void setUp () {
		//1. TODO Auto-generated method stub

		driver = helperMethods.BrowserFactory.open("chrome");
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
					 
	 // 3. navigate to url
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[26]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		//WebElement scrollDown = driver.findElement(By.className("no-js"));
		
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //Vertical scroll down by 600  pixels		
        js.executeScript("scrollBy(0,2500)");		
	}

}
