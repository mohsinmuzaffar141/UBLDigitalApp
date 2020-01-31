package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SettingPageLocators {

	@FindBy(id = "app.com.brd.dev:id/input_amount")
	@CacheLookup
	public
	WebElement transactionAmount;
	
	@FindBy(id = "app.com.brd.dev:id/input_card")
	@CacheLookup
	public
	WebElement debitCardNumber;
	
	
	@FindBy(id = "app.com.brd.dev:id/input_atm")
	@CacheLookup
	public
	WebElement atmPin;
	
	@FindBy(id = "app.com.brd.dev:id/input_pin")
	@CacheLookup
	public
	WebElement sixDigitPin;
	
	@FindBy(id = "app.com.brd.dev:id/input_comments")
	@CacheLookup
	public
	WebElement reEnterSixDigitPin;
	
	
	
	
	
	
	
}
