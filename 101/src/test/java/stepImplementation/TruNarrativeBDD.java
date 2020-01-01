package stepImplementation;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import truNarrativeTest.DataSet;

public class TruNarrativeBDD {
    WebDriver  driver;
	@Given("^that a User launch chrome browser and search for TruNarrative$")
	public void that_a_User_launch_chrome_browser_and_search_for_TruNarrative() {
		//1a)  launch Chrome Browser and open google home page
		driver = helperMethods.BrowserFactory.open("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	//	System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
		driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		}
	
	@And("^verify that TruNarrative is the first search result return and navigate to website$")
	public void verify_that_TruNarrative_is_the_first_search_result_return_and_navigate_to_website() {
				//1b)  verify that search return displays : https://trunarrative.com/
		if ( driver != null) {
			 System.out.println("driver =" + driver);  		
		driver.findElement(By.name("q")).sendKeys("TruNarrative" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite"));
		String actualResult3 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).getText();
		String expectedResult3 = "https://trunarrative.com/";
		Assert.assertEquals(expectedResult3, actualResult3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(" I can see " + actualResult3);
	}
	}
	
	@When("^On TruNarrative Home page verify the strap line$")
	public void on_TruNarrative_Home_page_verify_the_strap_line() throws Exception {
		//2a) Navigate to TruNarrative website
		if ( driver != null) {
			 System.out.println("driver =" + driver);  		
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//2b)Verify that the strap line ìEasy Onboarding.  Smooth Transactions.  Insightful Compliance.î Is found on the page.
					String actualResult = driver.findElement(By.className("bigger")).getText();
					String expectedResult = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";
					Assert.assertEquals(expectedResult, actualResult);
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					System.out.println("\n I can see " + actualResult);
		}
	}
	@And("^navigate via the UI to TruNarrative team page$")
	public void navigate_via_the_UI_to_TruNarrative_team_page() {
		if ( driver != null) {
			 System.out.println("driver =" + driver);  
			 driver.findElement(By.xpath("//*[@id=\"menu-item-6055\"]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"menu-item-6388\"]/a")).click();
	}
	}
	@Then("^verify that TruNarrative leadership team consist  of \"([^\"]*)\" people$")
	public void verify_that_TruNarrative_leadership_team_consist_of_people(String arg1) {
	 		//Calling function		
		// Data will fetched from DataSet.java class
		verifyTeamRoles(driver,DataSet.getDataSet());
		@SuppressWarnings("unused")
		List<WebElement> TeamRoles=driver.findElements(By.xpath("//div[@class='stack-img-content']//div[@class='content']"));
		
		
				
	}
	
	// Call this function to verify team member names and roles
	public static void verifyTeamRoles(WebDriver driver,Map<String,String> DataSet)	{
		
		//Get All Team members on the page
		List<WebElement> TeamRoles=driver.findElements(By.xpath("//div[@class='stack-img-content']//div[@class='content']"));
		
		//Now we can Iterate each memeber of our input hash map and see if it exists on the web page 
		for (Map.Entry<String,String> entry : DataSet.entrySet())  
		{
			System.out.println("Key = " + entry.getKey() + 
                    ", Value = " + entry.getValue());
			
			boolean Found=false;
			for(WebElement Member: TeamRoles)
			{
				
				String MemberName=Member.findElement(By.xpath("h2")).getText();
				if(entry.getKey().equals(MemberName))
				{
					Found=true;
					String Role=Member.findElement(By.xpath("p[@class='sub']")).getText();
					if(DataSet.get(MemberName).equals(Role))
					{
						System.out.println(true); 
					}
					else {
						
						System.out.println(false); 
					}
					break;
						
				}
				
					
			}
			if(Found)
			{
				//System.out.println(Found); 
			}
					}
            
	}
	
	

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	
	if ( driver != null) {
		driver.quit();
}
}}


