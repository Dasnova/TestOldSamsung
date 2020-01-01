package uk.co.netpay.pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import helperMethods.BrowserFactory;

public class TestHooks {
	 private BrowserFactory BrowserFactory;
	    protected WebDriver driver;
		@Before
	    public void preCondition() {
	        String browserType = "chrome";
	        this.BrowserFactory = new BrowserFactory();
	      //  driver = helperMethods.BrowserFactory.open("chrome");
	      // this.driver = BrowserFactory.lunchBrowser(browserType);
	    }

	    @After
	    public void postCondition(){
	        driver.quit();
	       
	   }
	}
	
