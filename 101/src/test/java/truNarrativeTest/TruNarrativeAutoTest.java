package truNarrativeTest;

	import java.util.List;
	import java.util.Map;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	public class TruNarrativeAutoTest {
		public static void main(String[] args) {
			//1a)  launch Chrome Browser and open google home page
			System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		//1b)  verify that search return displays : https://trunarrative.com/
		driver.findElement(By.name("q")).sendKeys("TruNarrative" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite"));
		String actualResult3 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).getText();
		String expectedResult3 = "https://trunarrative.com/";
		Assert.assertEquals(expectedResult3, actualResult3);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(" I can see " + actualResult3);
		
		
		//2a) Navigate to TruNarrative website
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//2b)Verify that the strap line ìEasy Onboarding.  Smooth Transactions.  Insightful Compliance.î Is found on the page.
			String actualResult = driver.findElement(By.className("bigger")).getText();
			String expectedResult = "Easy Onboarding.  Smooth Transactions.  Insightful Compliance.";
			Assert.assertEquals(expectedResult, actualResult);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("\n I can see " + actualResult);
		
		//3a) Navigate via the UI to the TruNarrative Team page
			driver.findElement(By.xpath("//*[@id=\"menu-item-6055\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-6388\"]/a")).click();
	//3b) Verify that three people held these positions
			
					
			//Calling function
			
			// Data will fetched from DataSet.java class
			verifyTeamRoles(driver,DataSet.getDataSet());
			
			
			
			//System.out.println("I know " + actualResult1 );
			//System.out.print("He is the " + actualResult2 ); 
		}
		
		// Call this function to verify team member names and roles
		public static void verifyTeamRoles(WebDriver driver,Map<String,String> DataSet)
		{
			
			//Get All Team members on the page
			List<WebElement> TeamRoles=driver.findElements(By.xpath("//div[@class='stack-img-content']//div[@class='content']"));
			
			//Now Iterate each memeber of our input hash map and see if it exists on the web page 
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
					System.out.println(Found); 
				}
				
			}
			//close browser
			driver.quit();
		}
		}
	

	

