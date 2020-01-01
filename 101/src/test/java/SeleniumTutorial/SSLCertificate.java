package SeleniumTutorial;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	 
	public class SSLCertificate {
		public static void main(String[] args) {
			// DesiredCapabilities Predefined class inside Selenium
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			// Creating its object Reference
			// Delibrately throwing SSL certificate as true to selenium
			// As selenium don't allow to open Website without valid(Unexpired) SSL Certificate
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			// Setting Up ChromeDriver
			System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
			//driver = new ChromeDriver();
			// Creating a Object Reference for ChromeDriver
			// And Passing object reference of DesiredCapabilities to Accept SSL Certicate as True
			@SuppressWarnings("deprecation")
			WebDriver driver = new ChromeDriver(cap);
			
			// Launching the URL without SSL Certificate
			driver.get("https://www.cacert.org/");
			String currentURL = driver.getCurrentUrl();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(currentURL);
			
			driver.close();
			}	 
	}
	

