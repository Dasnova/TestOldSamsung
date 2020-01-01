package uk.co.netpay.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestHooks {

	    @Test
	    public void netPayCreateAccountTest(){
	        String merchantAccountId = "1234";
	        String firstName = "okwong";
	        String lastName = "okwong";
	        String email = "okwonguya@yahoo.com";
	        String companyName = "Netpay";
	        String middlename = "uya";
	        String position = "Tester";
	        String password = "8Newpolice";
	        String confirmPassword ="8Newpolice";
	        String message = "please login";
	        BasePage BasePage = new BasePage(driver);
	       boolean result =  BasePage.loadApplication().
	               goToCreateAccountPage().populateCreateAccountForm(merchantAccountId,
	                firstName,lastName,email,companyName,middlename,
	                position,password,confirmPassword).
	                validateCreateAccount(message);
	        Assert.assertTrue(result);


	    }


}
