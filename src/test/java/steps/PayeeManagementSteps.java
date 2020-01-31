package steps;

import cucumber.api.java.en.Then;
import pages.actions.PayeeManagementPage;

public class PayeeManagementSteps extends BaseClass {

	public static PayeeManagementPage pm= new PayeeManagementPage(Driver,Driver);

	@Then("^User enters the bank account detail \"([^\"]*)\"$")
	public void user_enters_the_bank_account_detail(String account) throws Throwable {
		pm.enterBankAccount(account);
	}

	@Then("^User Click on cancel button$")
	public void user_Click_on_cancel_button() throws Throwable {
		pm.clickCancelBtn();
	}

	@Then("^User scroll it down payee management \"([^\"]*)\"$")
	public void user_scroll_it_down_payee_management(String profilePage) throws Throwable {
		pm.scrollKamranMirza(profilePage);
	}
	
	@Then("^User click on Payements button$")
	public void user_click_on_Payements_button() throws Throwable {
	   pm.clickPayementBtn();
	}
	
	@Then("^User click on delete payee button$")
	public void user_click_on_delete_payee_button() throws Throwable {
	   pm.clickDeletePayeeBtn();
	}
	
	@Then("^User verify the title of the page$")
	public void user_verify_the_title_of_the_page() throws Throwable {
	    pm.verifyTitlePage();
	}

	
}
