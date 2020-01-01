package Selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScrollPractice {

	WebDriver driver;
	 @Test		
	    public void Login() 					
	    {		
			driver = helperMethods.BrowserFactory.open("chrome");
			driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
	        		
	        //Creating the JavascriptExecutor interface object by Type casting		
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        		
	        //Launching the Site.		
	        driver.get("http://moneyboats.com/");			
	     
	        //Maximize window		
	        driver.manage().window().maximize();		
	        		
	        //Vertical scroll down by 600  pixels		
	        js.executeScript("window.scrollBy(0,1800)");			
	    }		
}
