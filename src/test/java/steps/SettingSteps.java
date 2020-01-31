package steps;

import cucumber.api.java.en.Then;
import pages.actions.SettingPage;

public class SettingSteps extends BaseClass {

	public static SettingPage sp= new SettingPage(Driver,Driver);
	

	@Then("^Verify that user should able to enter amount$")
	public void verify_that_user_should_able_to_enter_amount() throws Throwable {
		sp.enterQRLimitAmount();
	}
	
	@Then("^Verify that user should able to enter debit card number$")
	public void verify_that_user_should_able_to_enter_debit_card_number() throws Throwable {
	   sp.enterDebitCardNumber();
	}

	@Then("^Verify that user should able to enter atm pin$")
	public void verify_that_user_should_able_to_enter_atm_pin() throws Throwable {
	    sp.enterATMPin();
	}

	@Then("^Verify that password field is hidden$")
	public void verify_that_password_field_is_hidden() throws Throwable {
	 sp.verifyPassHiddenQRTrancsactionLimit();
	}
	@Then("^Verify that password field is hidden in QR pin$")
	public void verify_that_password_field_is_hidden_in_QR_pin() throws Throwable {
	 sp.verifyPassHiddenQRPin();
	}
	
	@Then("^User send the six digit pin$")
	public void user_send_the_six_digit_pin() throws Throwable {
	    sp.entersSixDigitPin();
	}
}
