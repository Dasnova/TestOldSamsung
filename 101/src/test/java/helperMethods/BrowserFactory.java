package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver open(String browserType) {
		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
					return new ChromeDriver();
		
		}
		else {
			System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE DRIVERS\\Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
	}

}
