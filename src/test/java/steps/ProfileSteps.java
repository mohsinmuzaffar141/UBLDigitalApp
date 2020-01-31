package steps;

import cucumber.api.java.en.Then;
import pages.actions.ProfilePage;

public class ProfileSteps extends BaseClass {


	public static ProfilePage pp= new ProfilePage(Driver,Driver);
	
	@Then("^User click on IBAN number$")
	public void user_click_on_IBAN_number() throws Throwable {
	   pp.clickIBANNumber();
	}
}
