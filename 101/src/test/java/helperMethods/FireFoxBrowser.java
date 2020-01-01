package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
 public static WebDriver Okwong (String FoxDriver) {
	 if (FoxDriver.equals("myDriver")) {
		 System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE DRIVERS\\Drivers\\geckodriver.exe");
		 return new FirefoxDriver();
	 }
	 else 
		 System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
		return new ChromeDriver();
 }
 
}
