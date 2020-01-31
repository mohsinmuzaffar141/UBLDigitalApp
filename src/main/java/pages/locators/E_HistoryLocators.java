package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class E_HistoryLocators {
	
	@FindBy(id = "app.com.brd.dev:id/dlbl_toaccno")
	@CacheLookup
	public
	WebElement e_HistoryAcct;
	
	@FindBy(id = "app.com.brd.dev:id/tv_ID")
	@CacheLookup
	public
	WebElement transactionID;
	
	@FindBy(id = "app.com.brd.dev:id/dlbvouchertxt")
	@CacheLookup
	public
	WebElement bankNameEHistory;
	
	
	
}
