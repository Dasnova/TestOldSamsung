package uk.co.netpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage   {

	
	public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage doLogin(String username, String password) {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();
        return new HomePage(driver);
    }

    public CreateAccountPage goToCreateAccountPage() {
        driver.findElement(By.xpath("/html/body/div/div/div/nav/ul/li[3]/a")).click();
        return new CreateAccountPage(driver);
    }

    public boolean validateCreateAccount(String message) {
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }
    public boolean validateRemindPassword(String message) {
        return driver.getPageSource().toLowerCase().contains(message.toLowerCase());
    }
    public RemindPasswordPage goToRemindPasswordPage() {
        driver.findElement(By.xpath("/html/body/div/div/div/nav/ul/li[2]/a")).click();
        return new RemindPasswordPage(driver);

    }
}

