package ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Login {

			
		WebDriver driver;
		public PO_Login(WebDriver driver) {
			this.driver  = driver;
		}
		
		@FindBy(how = How.NAME, using = "username")
		private WebElement txtbx_login;
		
		@FindBy(how = How.NAME, using = "password")
		private WebElement txtbx_password;
		
		@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Log In']")
		private WebElement btn_login;
		
		public void SetUserName(String u) {
			txtbx_login.sendKeys(u);
		}
		public void SetPassword(String p) {
			txtbx_password.sendKeys(p);
		}
		public void ClickLoginBtn() {
			btn_login.click();
		}
		
	 
	}


