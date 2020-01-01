package Selenium_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
protected  WebDriver driver;

@BeforeMethod
public void beforeMethod() {
	
System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE DRIVERS\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
//@AfterMethod
/*public void cleanUp() {
	if (driver= null) {
		driver.quit();
	}
	
}
private WebDriver driver () {
	return driver*/
}


