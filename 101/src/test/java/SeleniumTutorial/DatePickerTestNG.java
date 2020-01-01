package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerTestNG {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	
	String URL = "https://www.goibibo.com/";
	String MonthToBeSelected = "September 2019";
	String Day = "15";
	
	@Test
	public void datePicker() {
		if ( driver != null) {
			 System.out.println("driver =" + driver);  
			//passing URL
			 driver.get(URL);
			 //Clicking on Departure Date Picker Box
			 driver.findElement(By.xpath("//input[@type='text' and @placeholder='Departure']")).click();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 while (true)
							
			 {
			 // logic for expected month and date picker
				 //click on next button
				 driver.findElement(By.xpath("//span[@role='button' and @class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				 
				 //verify month selected
	String monthOnPage = driver.findElement(By.xpath("//div[@class = 'DayPicker-Caption' and @role ='heading']")).getText();
		if (monthOnPage.equals(MonthToBeSelected))	 
		{
			break;
		}else
			//Clicking over the DAY variable date
			driver.findElement(By.id("fare_20190915")).click();
		
			 }
		}
		
		
	}
	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}
}