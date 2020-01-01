package SeleniumTutorial;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OnTheBeach {
		
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Launch Browser
		
  driver = helperMethods.BrowserFactory.open("chrome");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
  
  //get Url
  driver.get("https://www.google.com/");
  
  //search for On The Beach
  driver.findElement(By.name("q")).sendKeys("On the beach" + Keys.ENTER);
 String link = driver.findElement(By.className("UdQCqe")).getText();
  if (link.equals("www.onthebeach.co.uk/"));
  driver.findElement(By.className("UdQCqe")).click();
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
 
 driver.findElement(By.xpath("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/div/button")).click();
 driver.findElement(By.xpath("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/div/button")).click();
 List<WebElement>elements = driver.findElements(By.className("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/div/button"));
 elements.contains("Barcelona");
 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
 
 //.findElement(By.cssSelector("))
 //nation_dropdown = driver.findElement(By.xpath("//Select[@class ='input-select__dropdown']"));
 //Select dropdown= new Select(destination_dropdown);
 
 
 
// dropdown.selectByVisibleText("Antalya");
// WebElement element =driver.findElement(By.xpath("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/div[2]/ul")); 
 
 
 //driver.findElement(By.className("highlighted-text input-select__option input-select__option--shift")).click();
  //driver.findElement(By.xpath("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/input")).sendKeys("Ibiza");
  //driver.findElement(By.xpath("/html/body/main/div/section[1]/div[1]/form/div/div/section/div/section/div[1]/div/div/input")).click();
  
	}
}
