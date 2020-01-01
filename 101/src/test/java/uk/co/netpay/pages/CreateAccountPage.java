package uk.co.netpay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage populateCreateAccountForm(String merchantAccountId, String firstName, String lastName, String email,
                                               String companyName, String middleName, String position, String password, String confirmPassword){
        driver.findElement(By.name("merchant_account_id")).sendKeys(merchantAccountId);
        driver.findElement(By.name("first_name")).sendKeys(firstName);
        driver.findElement(By.name("last_name")).sendKeys(lastName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("company_name")).sendKeys(companyName);
        driver.findElement(By.name("middle_name")).sendKeys(middleName);
        driver.findElement(By.name("position")).sendKeys(position);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("confirm_password")).sendKeys(confirmPassword);
//        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//*[@id='registerForm']/form/div[6]/div/div/a")).click();
        return new LoginPage(driver);

    }

}
