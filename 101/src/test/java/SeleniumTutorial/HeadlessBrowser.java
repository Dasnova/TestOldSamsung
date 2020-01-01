package SeleniumTutorial;



			 
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.firefox.FirefoxBinary;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.firefox.FirefoxOptions;
		/**
		 * 
		 * @author Sarang Holey
		 *
		 * 10:49:00 pm
		 */
		public class HeadlessBrowser {
			static WebDriver driver;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			// creating WebDriver instance as static
			
			
				// calling static chrome driver headless method 
				ChromeHeadless("https://www.facebook.com");
				// calling static firefox driver headless method 
				FirefoxHeadless("https://www.flipkart.com");
			}
			
			/**
			 * 
			 * @param URL
			 */
			public static void ChromeHeadless(String URL)
			{
				// setting up chromedriver system properties
				System.setProperty("webdriver.chrome.driver","C:\\SOFTWARE DRIVERS\\chromedriver.exe");
				//creating ChromeOptions object
				ChromeOptions options = new ChromeOptions();
				// adding arguments for activation of chrome browser in headless mode
				options.addArguments("--headless");
				// creating ChromeDriver instance with argument to the constructor ChromeOptions instance
				driver = new ChromeDriver(options);
				// passing the URL from method argument
				driver.get(URL);
				// printing title of the given URL page of the Website
				System.out.println(driver.getTitle());
			}
			
			/**
			 * 
			 * @param URL
			 */
			public static void FirefoxHeadless(String URL)
			{
				// creating object of firefox binary 
				FirefoxBinary firefoxbinary = new FirefoxBinary();
				
				// adding the argument to activate headless mode of firefox
				firefoxbinary.addCommandLineOptions("--headless");
				
				// setting up chromedriver system properties
				System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE DRIVERS\\Drivers\\geckodriver.exe");
				// creating FirefoxOptions object
				FirefoxOptions fo = new FirefoxOptions();
				
				// setting up firefoxbinary 
				fo.setBinary(firefoxbinary);
				
				// creating FirefoxDriver instance with argument to the constructor FirefoxOptions instance
				WebDriver driver = new FirefoxDriver(fo);
				
				// passing the URL from method argument
				driver.get(URL);
				
				// printing title of the given URL page of the Website
				System.out.println(driver.getTitle());
				
	}

}
