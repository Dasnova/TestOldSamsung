package uk.co.netpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemindPasswordPage extends BasePage {

	    public RemindPasswordPage(WebDriver driver) {
	        super(driver);
	    }

	    public LoginPage remindPassword(String emailAddress){
	        driver.findElement(By.id("emailRemind")).sendKeys(emailAddress);
	        driver.findElement(By.id("remindBtn")).click();
	        return new LoginPage(driver);
	    }
}
