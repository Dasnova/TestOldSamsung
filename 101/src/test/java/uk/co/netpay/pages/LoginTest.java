package uk.co.netpay.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestHooks {

    private LoginPage LoginPage;

    @Test
    public void netPayLoginTest(){
        String message = "Hello, Okwong";
        String username = "okwonguya@yahoo.com";
        String password = "8Newpolice";

        BasePage BasePage = new BasePage(driver);
       boolean result = uk.co.netpay.pages.BasePage.loadApplication().
               doLogin(username,password).validateLogin(message);
        Assert.assertTrue(result);



    }

}
