package YahooHomePage;



	//import java.io.File;
	//import java.net.URL;
	import java.util.List;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	 
	public class WikiTrials {
	 
	WebDriver driver;
	 
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","C:\\SOFTWARE DRIVERS\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://en.wikipedia.org/wiki/Flower");
	}
	 
	@AfterClass
	public void tearDown(){
	driver.quit();
	}
	 
	@Test
	public void testImages()throws Exception{
	 
	//File files = null;
	Integer counter=0;
	 
	Thread.sleep(5000);
	List<WebElement> listImages=driver.findElements(By.tagName("img"));
	System.out.println("No. of Images: "+listImages.size());
	 
	for(WebElement image:listImages)
	{
	if(image.isDisplayed())
	{
	counter++;
	String[] names = image.getAttribute("src").split("/");
	String name = names[names.length-1];
	System.out.println(name);
	//URL myURL = new URL(image.getAttribute("src"));
	//files= new File("C:\\downloadedPictures\\"+ System.currentTimeMillis()+ "." +name);
	//org.apache.commons.io.FileUtils.copyURLToFile(myURL, files);
	}
	}
	System.out.println("No. of total displable images: "+counter);
	}
	
}
