package ParaBank;



	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.ui.Select;
	 
	import junit.framework.Assert;
	 
	public class PO_TransferFunds {
		
		WebDriver driver;
		public PO_TransferFunds(WebDriver driver) {
			this.driver  = driver;
		}
		
		@FindBy(how = How.ID, using = "amount")
		private WebElement txtbox_ammount;
		
		@FindBy(how = How.ID, using = "fromAccountId")
		private WebElement list_from_account;
		
		@FindBy(how = How.ID, using = "toAccountId")
		private WebElement list_to_account;
		
		@FindBy(how = How.XPATH, using = "//input[@value = 'Transfer']")
		private WebElement btn_tranfer;
		
		@FindBy(how = How.XPATH, using = "//div[@ng-if = 'showResult']")
		private WebElement txt_container_transfer_results;
		
		
		
		public void SetAmmount(String u) {
			txtbox_ammount.sendKeys(u);
		}
		public void SelectFromAccount(String p) {
			Select oFromList = new Select(list_from_account);
			oFromList.selectByValue(p);
		}
		public void SelectToAccount(String p) {
			Select oToList = new Select(list_to_account);
			oToList.selectByValue(p);
		}
		public void ClickTransfer() {
			btn_tranfer.click();
		}
		
		/*
		 * Transfer Complete!
	$123.00 has been transferred from account #13122 to account #13566.
	 
	See Account Activity for more details.
		 */
		public void ValidateTransferResults() {
			//Validation 1
			boolean result_actual = txt_container_transfer_results.isDisplayed();
			boolean result_expected = true;
			Assert.assertEquals(result_actual, result_expected);
			
			//Validation 2
			String result_text_actual = txt_container_transfer_results.getText();
			String result_text_expected_1 = "Transfer Complete!";
	 
			boolean b = (result_text_actual.contains(result_text_expected_1));
			Assert.assertTrue(b);
	 
			//String result_text_expected_2 = "has been transferred from account";
			//String result_text_expected_3 = "See Account Activity for more details.";
			//Assert.assertEquals(result_text_actual, result_text_expected_1);
			//Assert.assertEquals(result_text_actual, result_text_expected_2);
			//Assert.assertEquals(result_text_actual, result_text_expected_3);
		}
		
		
	 
}
