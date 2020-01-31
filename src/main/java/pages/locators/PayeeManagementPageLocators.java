package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PayeeManagementPageLocators {
	
	@FindBy(id = "app.com.brd.dev:id/delbillbtn")
	@CacheLookup
	public
	WebElement deletePayeeBtn;
	
	
	@FindBy(id = "app.com.brd.dev:id/title")
	@CacheLookup
	public
	WebElement verifyTitle;
	
	

}
