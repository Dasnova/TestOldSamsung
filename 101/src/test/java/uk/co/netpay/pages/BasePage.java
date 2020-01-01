package uk.co.netpay.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	
	 protected static  WebDriver driver;

	    public BasePage(WebDriver driver) {
	        BasePage.driver = driver;

	    }

	    public static LoginPage loadApplication(){
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.navigate().to("https://developer.netpay.co.uk");
	        return new LoginPage(driver);
	    }
}
