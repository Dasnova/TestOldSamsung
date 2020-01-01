package uk.co.netpay.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean validateLogin(String message){
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }

}
