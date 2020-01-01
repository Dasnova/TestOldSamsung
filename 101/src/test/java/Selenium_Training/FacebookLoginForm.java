package Selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FacebookLoginForm {

	static WebDriver driver;
	@Test
	public void Trial ()  {
	
	//launch browser
		driver = helperMethods.BrowserFactory.open("chrome");
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//select gender
		driver.findElement(By.id("u_0_7")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_16")).sendKeys("Nice one");
		
		
	
	//enter date of birth
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		String dob = "10-May-2010";
		String dobArr [] = dob.split("-");
		
		selectValueFromDropDown(day, dobArr[0]);
		selectValueFromDropDown(month, dobArr[1]);
		selectValueFromDropDown(year, dobArr[2]);
		
	}
		
		public void selectValueFromDropDown(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByVisibleText(value);
			
		Select pronoun =new Select (driver.findElement(By.xpath("//*[@id=\"u_0_15\"]/select")));
		pronoun.selectByVisibleText("He: \"Wish him a happy birthday!\"");
		
		}
		
		public void scrollDown () {
			
			
			
		}
		@AfterTest
         public static void close() throws Exception {
        	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
		
				
 }	
				
}
		
		
			

