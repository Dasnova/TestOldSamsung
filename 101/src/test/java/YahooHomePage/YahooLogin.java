package YahooHomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//  1. Open the browser
		WebDriver driver;
		driver = helperMethods.BrowserFactory.open("chrome");
		//System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
			 
	 // 2. navigate to url
		driver.get("https://uk.yahoo.com/?p=us");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//  3. Click Sign In Hyperlink
		driver.findElement(By.xpath("/html/body/div/div/div/form/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"uh-signin\"]")).click();
		driver.findElement(By.id("login-username")).sendKeys("okwonguya@yahoo.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='submit' and @value='Next']")).click(); 
		////*[@id="login-signin"]
		//driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.name("passwd")).sendKeys("8Newpolice");
		//driver.findElement(By.name("SubmitLogin")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
}
}
