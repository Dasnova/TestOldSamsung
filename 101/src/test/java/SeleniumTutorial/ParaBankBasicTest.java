package SeleniumTutorial;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankBasicTest {




	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
	
		//Navigate
		driver.get("http://parabank.parasoft.com");
		
		
		//Locators for Login
		WebElement txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		WebElement txt_password = driver.findElement(By.xpath("//input[@name='password' and @class='input']"));
		WebElement btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
		//Operation on- Login in to application
		txt_username.sendKeys("john");
		txt_password.sendKeys("demo");
		btn_submit.click();
		
		
		//Click on update contact info
		WebElement link_update_contact_info = 
				driver.findElement(By.linkText("Update Contact Info"));
		
		link_update_contact_info.click();
		
		//Locators for all the fields from Contact Info
		WebElement txtbx_firstname = driver.findElement(By.id("customer.firstName"));
		/*WebElement txtbx_lastname = driver.findElement(By.id("customer.lastName"));
		WebElement txtbx_add_street = driver.findElement(By.id("customer.address.street"));
		WebElement txtbx_add_city = driver.findElement(By.id("customer.address.city"));
		WebElement txtbx_add_state = driver.findElement(By.id("customer.address.state"));
		WebElement txtbx_add_zip_code = driver.findElement(By.id("customer.address.zipCode"));
		WebElement txtbx_phn_number = driver.findElement(By.id("customer.phoneNumber"));
		*/

		System.out.println(txtbx_firstname.getAttribute("value"));
		
		//Find Elements
		List<WebElement> txtbx_collection = 
				driver.findElements(By.xpath("//input[@type='text']"));
		
		String[] arr_input = 
			{"Akash","Tyagi","add1","add2","add3","add4","976983939"};
		
		for(int i=0;i<txtbx_collection.size();i++) {
			txtbx_collection.get(i).clear();
			txtbx_collection.get(i).sendKeys(arr_input[i]);
		}
		//WebElement sendpayment = driver.findElement(By.xpath("//input[@value='Update Profile']"));
		/*
		txtbx_collection.get(0).sendKeys("Akash");
		txtbx_collection.get(1).sendKeys("Tyagi");
		txtbx_collection.get(2).sendKeys("add1");
	*/
		
		
		
		
	
		

		
		
		
		
		
		
		
	}

}
