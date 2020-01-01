package stepImplementation;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TruStepsBDD {
 WebDriver driver;
	@Given("^that the User has launch chrome browser to open google home page$")
	public void that_the_User_has_launch_chrome_browser_to_open_google_home_page()throws Throwable {
	      	 // launch Chrome Browser and open google home page
		driver = helperMethods.BrowserFactory.open("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
	 	
	}

	@Given("^search for Trunarrative and verify search returned displayed$")
	public void search_for_Trunarrative_and_verify_search_returned_displayed() throws Throwable {
		//verify search return displays : https://trunarrative.com/
		if ( driver != null) {
			 System.out.println("driver =" + driver); 
	    driver.findElement(By.name("q")).sendKeys("TruNarrative" + Keys.ENTER);
		 WebElement link =driver.findElement(By.className("iUh30"));
	 
	if (link.isDisplayed()) {
		System.out.print("https://trunarrative.com/") ;
	}
		else {
		System.out.print("link not found");
		 throw new PendingException();
	}}}
		
	@When("^click on the search link displayed to navigate trunarrative home page$")
	public void click_on_the_search_link_displayed_to_navigate_trunarrative_home_page() throws Throwable {
		//Navigate to TruNarrative website
		if ( driver != null) {
			 System.out.println("driver =" + driver); 
		 driver.findElement(By.className("iUh30")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	    throw new PendingException();
	}}
	
	@When("^verify the strap line found on the page$")
	public void verify_the_strap_line_found_on_the_page() throws Throwable {
	   		//Verify that the strap line “Easy Onboarding.  Smooth Transactions.  Insightful Compliance.” Is found on the page.
		if ( driver != null) {
			 System.out.println("driver =" + driver); 
		String actualResult = driver.findElement(By.className("bigger")).getText();
		String expectedResult = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";
		Assert.assertEquals(expectedResult, actualResult);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("\n I can see " + actualResult);

	    throw new PendingException();
	}}
		
	@Then("^navigate to via the UI to the team page$")
	public void navigate_to_via_the_UI_to_the_team_page() throws Throwable {
	   			//Navigate via the UI to the TruNarrative Team page
			if ( driver != null) {
				 System.out.println("driver =" + driver); 
			driver.findElement(By.xpath("//*[@id=\"menu-item-6055\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-6388\"]/a")).click();
			
			 throw new PendingException();
	}}
	
	@Then("^verify team and leadership roles$")
	public void verify_team_and_leadership_roles() throws Throwable {
		
		if ( driver != null) {
			 System.out.println("driver =" + driver); 
		String actualResult1 = driver.findElement(By.xpath("//*[@id=\"main-content-wrapper\"]/section[2]"
		+ "/div/article/div/div[1]/div[2]/div/h2")).getText();
		
		String actualResult2 = driver.findElement(By.xpath("//*[@id=\"main-content-wrapper\"]/section[2]"
				+ "/div/article/div/div[1]/div[2]/div/p")).getText();
		
		String expectedResult1 = "John Lord";
		String expectedResult2 = "Founder & CEO";
	Assert.assertEquals(expectedResult1, actualResult1);
	 Assert.assertEquals(expectedResult2, actualResult2);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		System.out.println("I know " + actualResult1 );
		System.out.print("He is the " + actualResult2 ); 
		
		Thread.sleep(5000);
		if ( driver != null) {
			 System.out.println("driver =" + driver); 
			List<WebElement> TeamList =driver.findElements(By.tagName("img"));
			
			HashMap<Integer, String> map = new HashMap<Integer, String>();  
			String text = null;
			for (WebElement ele : TeamList)
			{
				text = ele.getText();
				if (!text.equals(""));
				{
					map.put(1, text);
					map.put(2, text);
					map.put(3, text);
					map.put(4, text);
					map.put(5, text);
					map.put(6, text);
					map.put(7, text);
					map.put(8, text);
			
	    throw new PendingException();
	}}}}}
	}

	
