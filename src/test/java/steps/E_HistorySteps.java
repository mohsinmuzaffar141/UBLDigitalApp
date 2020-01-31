package steps;

import cucumber.api.java.en.Then;
import pages.actions.E_HistoryPage;

public class E_HistorySteps extends BaseClass{

	public static E_HistoryPage hp= new E_HistoryPage(Driver,Driver);
	
	@Then("^Verify transaction id on E-Transaction History Page$")
	public void verify_transaction_id_on_E_Transaction_History_Page() throws Throwable {
	    hp.verifyEHistoryPage();
	}
	
	@Then("^Verify that bank name should be present$")
	public void verify_that_bank_name_should_be_present() throws Throwable {
	  hp.verifyBankNameEHistoryPage();
	  hp.verifyAccountNoEHistoryPage();
	}
	
	@Then("^User scroll the list of transfer Fund \"([^\"]*)\"$")
	public void user_scroll_the_list_of_transfer_Fund(String transaction) throws Throwable {
	    hp.transferListScroll(transaction); 
	}
	
	@Then("^Scroll list of E_History transaction up$")
	public void scroll_list_of_E_History_transaction_up() throws Throwable {
	    hp.listScrollUp();
	}
	
	@Then("^Verify that account name should be present$")
	public void verify_that_account_name_should_be_present() throws Throwable {
	    hp.verifyAccountNoEHistoryPage();
	}

}
