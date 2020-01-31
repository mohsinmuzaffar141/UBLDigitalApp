package steps;

//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.actions.LoginPage;



public class LoginSteps extends BaseClass {
	
	public static LoginPage lp;
	
	@Given("^User Launch ubl app$")
	public void user_Launch_ubl_app() throws Throwable {
		Driver=Capabilities();
		lp= new LoginPage(Driver,Driver);
	}
	
	@Then("^User click on dialouge box yes button$")
	public void user_click_on_dialouge_box_yes_button() throws Throwable {
		lp.dialougeBox();
	}
	
	@Given("^User click on allow button$")
	public void user_click_on_allow_button() throws Throwable {
		lp.clickAllow();
	}

	@Then("^Verify that the username and password fields are functional$")
	public void verify_that_the_username_and_password_fields_are_functional() throws Throwable {
		 lp.userNameAndpasswordEnable();
	}

	@Then("^Verify that all the buttons on login page are functional \"([^\"]*)\"$")
	public void verify_that_all_the_buttons_on_login_page_are_functional(String btnName) throws Throwable {
		 lp.buttonEnableOnLoginPage(btnName);
	}

	@Then("^Verify that forgot password link is functional$")
	public void verify_that_forgot_password_link_is_functional() throws Throwable {
		lp.forgetPasswordClickable();
	}

	@Then("^User enters Email as\"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String username, String password) throws Throwable {
		lp.setUserName(username);
		lp.setPassword(password);
	}

	@Then("^User should unable to login into account$")
	public void user_should_unable_to_login_into_account() throws Throwable {
	   lp.invalidCredentials();
	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		 lp.clickLogin();
	}

	@Then("^User enter OTP as \"([^\"]*)\"$")
	public void user_enter_OTP_as(String otp) throws Throwable {
		lp.setOTP(otp);
	}
	@Then("^User enter nick name for user \"([^\"]*)\"$")
	public void user_enter_nick_name_for_user(String name) throws Throwable {
		 lp.enterNickName(name);
		
	}

	@Then("User click on hamburger button")
	public void user_click_on_home_button() throws Exception {
	    lp.clickHomebtn();
	}
	
	@Then("User click on button \"([^\"]*)\"$")
	public void user_click_on_feedback_button(String btnName) throws Exception {
	    lp.clickFeedbackBtn(btnName);
	}

	@Then("verify text field is empty")
	public void verify_message_when_text_field_is_empty() {
	   lp.verifyTextFieldEmpty();
	}
	
	@Then("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
	   lp.clickSubmitBtn();
	}
	@Then("User verify Feedback field message \"([^\"]*)\"$")
	public void user_verify_Feedback_field_message(String msg) {
	    lp.verifyMesage(msg);
	}

	@Then("User click on Ok button")
	public void user_click_on_Ok_button() throws Exception {
	    lp.clickOKBtn();
	}

	@Then("User enter feedback in text field")
	public void user_enter_feedback_in_text_field() {
	    lp.enterFeedback();
	}

	@Then("User moves to scroll down")
	public void user_moves_to_scroll_down() {
	    lp.scrollDown();
	}
	@Then("verify that terms & conditions page should be accessible")
	public void verify_that_terms_conditions_page_should_be_accessible() throws InterruptedException {
	    lp.verifyTermsConditionsPage();
	}
	@Then("verify that all the button on terms & conditions page are functional")
	public void verify_that_all_the_button_on_terms_conditions_page_are_functional() {
	   lp.verifyTermsConditionPageButton();
	}
	@Then("verify that logout should be accessible")
	public void verify_that_logout_should_be_accessible() {
	    lp.verifyLogout();
	}

	@Then("verify that all the button logout popup are functional \"([^\"]*)\"$")
	public void verify_that_all_the_button_logout_popup_are_functional(String btnLogout) throws InterruptedException {
	    lp.verifyLogoutButtonFunctional(btnLogout);
	}
	@Then("User should logout successfully")
	public void user_should_logout_successfully() {
	    lp.forgetPasswordClickable();
	}

	@Then("^Verify that buttons on dashboard should be functional$")
	public void verify_that_buttons_on_dashboard_should_be_functional() throws Throwable {
	    lp.dashboardBtn();
	}
	@Then("^Click on show balance button \"([^\"]*)\"$")
	public void click_on_show_balance_button(String balance) throws Throwable {
	   lp.verifyBalance(balance);
	}
	@Then("^Verify that profile screen should be visible$")
	public void Verify_that_profile_screen_should_be_visible() throws Throwable {
	    lp.profileScreen();
	}
	@Then("^Click on profile persnal detail page$")
	public void click_on_profile_persnal_detail_page() throws Throwable {
	    lp.clickPersnalDetailPage();
	}
	@Then("^Click on edit button$")
	public void click_on_edit_button() throws Throwable {
	   lp.clickEditBtn();
	}	
	@Then("^User should change the profile nick name \"([^\"]*)\"$")
	public void user_should_change_the_profile_nick_name(String nickName) throws Throwable {
	 lp.changeProfileNickName(nickName);
	}	
	@Then("^Click on done button$")
	public void click_on_done_button() throws Throwable {
	    lp.clickDoneBtn();
	}
	@Then("^Click on bank detail button$")
	public void click_on_bank_detail_button() throws Throwable {
	   lp.clickBankDetailBtn();
	}

	@Then("^Verify bank detail page$")
	public void verify_bank_detail_page() throws Throwable {
	    lp.verifyBankDetailPage();
	}
	@Then("^Verify that setting screen should be visible \"([^\"]*)\"$")
	public void verify_that_setting_screen_should_be_visible(String transaction) throws Throwable {
	   lp.verifyDailyTransaction(transaction);
	}
	
	@Then("^Click on account list$")
	public void click_on_account_list() throws Throwable {
	    lp.clickOnAccount();
	}
	
	@Then("^User should be able to Set Default QR Account successfully \"([^\"]*)\"$")
	public void user_should_be_able_to_Set_Default_QR_Account_successfully(String text) throws Throwable {
	   lp.verifyDailyTransaction(text);
	}
	
	@Then("^Click on back button$")
	public void click_on_back_button() throws Throwable {
		lp.clickBackBtn();
	}
	@Then("^Verify that payee management is accessible \"([^\"]*)\"$")
	public void verify_that_payee_management_is_accessible(String text) throws Throwable {
		lp.verifyDailyTransaction(text);
	}
	@Then("^User search for the bank \"([^\"]*)\"$")
	public void user_search_for_the_bank(String text) throws Throwable {
	   lp.searchBankBranch(text);
	}
	@Then("^User click on checkbox \"([^\"]*)\"$")
	public void user_click_on_checkbox(String name) throws Throwable {
	    lp.clickCheckBox(name);
	}

	@Then("^User enters reciever Name \"([^\"]*)\"$")
	public void user_enters_reciever_Name(String recieverName) throws Throwable {
	    lp.recieverName(recieverName);
	}

	@Then("^User enters reciever CNIC \"([^\"]*)\"$")
	public void user_enters_reciever_CNIC(String CNIC) throws Throwable {
	    lp.recieverCNIC(CNIC);
	}

	@Then("^User enters reciever mobile number \"([^\"]*)\"$")
	public void user_enters_reciever_mobile_number(String number) throws Throwable {
		lp.recieverNumber(number);
	}
	@Then("^User enters reciever email \"([^\"]*)\"$")
	public void user_enters_reciever_email(String email) throws Throwable {
	    lp.recieverEmail(email);
	}
	@Then("^Click on next button$")
	public void click_on_next_button() throws Throwable {
	    lp.clickNextBtn();
	}
	@Then("^Click on payee from payee list$")
	public void click_on_payee_from_payee_list() throws Throwable {
	  lp.clickOnPayee();
	}
	@Then("^User selects the start date month \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_the_start_date_month(String month1, String month2) throws Throwable {
	   lp.selectsStartDateMonth(month1,month2);
	}
	@Then("^User selects the end date month \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_selects_the_end_date_month(String month1, String month2) throws Throwable {
	   lp.selectsEndDateMonth(month1,month2);
	}
	@Then("^Verify that user should be on payee management screen$")
	public void verify_that_user_should_be_on_payee_management_screen() throws Throwable {
	    lp.verifyUserPayeeManagement();
	}
	@Then("^Click on payee management button \"([^\"]*)\"$")
	public void click_on_payee_management_button(String arg1) throws Throwable {
	    lp.payeeManagementButton();
	}
	@Then("^verify that user should navigate to forget password screen \"([^\"]*)\"$")
	public void verify_that_user_should_navigate_to_forget_password_screen(String forgetPass) throws Throwable {
	    lp.clickFeedbackBtn(forgetPass);
	}
	@Then("^User click on back button from ad screen$")
	public void user_click_on_back_button_from_ad_screen() throws Throwable {
	    lp.adScreenBack();
	}
	@Then("^Tap on app screen$")
	public void tap_on_app_screen() throws Throwable {
	 lp.tapOnScreen();
	}
	
	@Then("^User set day \"([^\"]*)\" and year \"([^\"]*)\"$")
	public void user_set_day_and_year(String index, String year) throws Throwable {
		
		 lp.setDayAndYear(index,year);
	}

	
	
//	@Then("^Verify all the list of accounts$")
//	public void verify_all_the_list_of_accounts() throws Throwable {
//		lp.getList();
//	}

}
