package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(id = "app.com.brd.dev:id/dialog_root")
	@CacheLookup
	public
	WebElement dialougeBox;
	
	@FindBy(id = "app.com.brd.dev:id/btn_enable")
	@CacheLookup
	public
	WebElement yesBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions']")
	@CacheLookup
	public
	WebElement termsPage;

	@FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
	@CacheLookup
	public
	WebElement allow;

	@FindBy(xpath = "//android.widget.EditText[@text='Username']")
	@CacheLookup
	public
	WebElement txtEmail;

	@FindBy(xpath = "//android.widget.EditText[@text='Password']")
	@CacheLookup
	public
	WebElement txtPassword;

	@FindBy(id = "app.com.brd.dev:id/btn_login")
	@CacheLookup
	public
	WebElement btnLogin;

//	@FindBy(id = "android.widget.EditText")
//	@CacheLookup
//	WebElement txtOTP;
	
	@FindBy(id = "app.com.brd.dev:id/tv_forgotpassword")
	@CacheLookup
	public
	WebElement forgetPass;
	
	@FindBy(xpath = "//android.widget.Button[@text='Open a UBL Bank Account']")
	@CacheLookup
	public
	WebElement openAccount;
	
	@FindBy(id = "app.com.brd.dev:id/qr")
	@CacheLookup
	public
	WebElement qrBtn;
	
	@FindBy(id = "app.com.brd.dev:id/help")
	@CacheLookup
	public
	WebElement helpBtn;
	
//	@FindBy(id = "app.com.brd.dev:id/tv_forgotpassword")
//	@CacheLookup
//	WebElement nickName;
	
	@FindBy(id = "app.com.brd.dev:id/btn_home") 
	@CacheLookup
	public
	WebElement homeBtn;		
	
	@FindBy(className = "android.widget.ScrollView")
	@CacheLookup
	public
	WebElement scroll;
	
	@FindBy(xpath = "//android.widget.EditText[@text='Enter your Feedback']")
	@CacheLookup
	public
	WebElement textFieldFeedback;
	
	@FindBy(id = "app.com.brd.dev:id/imageButton4")
	@CacheLookup
	public
	WebElement submitBtn;
	
	@FindBy(id = "app.com.brd.dev:id/tv_msg")
	@CacheLookup
	public
	WebElement feedbackEmptyMsg;
	
//	@FindBy(id = "app.com.brd.dev:id/btn_close")
//	@CacheLookup
//	WebElement NoBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	@CacheLookup
	public
	WebElement OKBtn;
	
	@FindBy(id = "app.com.brd.dev:id/input_text")
	@CacheLookup
	public
	WebElement nickName;
	
	@FindBy(id = "app.com.brd.dev:id/ll_nick")
	@CacheLookup
	public
	WebElement next;
	
	@FindBy(xpath = "//android.view.View[@text='Instructions']")
	@CacheLookup
	public
	WebElement termsPageBtn;
	
	@FindBy(id = "app.com.brd.dev:id/dialog_root")
	@CacheLookup
	public
	WebElement logoutPopUp;
	
	@FindBy(id = "app.com.brd.dev:id/Account_button")
	@CacheLookup
	public
	WebElement accountBtn;
	
	@FindBy(id = "app.com.brd.dev:id/pay_button")
	@CacheLookup
	public
	WebElement payment;
	
	@FindBy(id = "app.com.brd.dev:id/show_balance")
	@CacheLookup
	public
	WebElement showBalance;
	
//	@FindBy(id = "app.com.brd.dev:id/tv_balance_label")
//	@CacheLookup
//	public
//	WebElement balance;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Profile']")
	@CacheLookup
	public
	WebElement profilePage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Personal Details']")
	@CacheLookup
	public
	WebElement profilePersnalDetail;
	
	@FindBy(id = "app.com.brd.dev:id/tv_edit")
	@CacheLookup
	public
	WebElement editBtn;
	
	@FindBy(id = "app.com.brd.dev:id/new_nick_name")
	@CacheLookup
	public
	WebElement editText;
	
	@FindBy(id = "app.com.brd.dev:id/done")
	@CacheLookup
	public
	WebElement doneBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Bank Account Details']")
	@CacheLookup
	public
	WebElement bankAccountDetailPage;
	
	@FindBy(id = "app.com.brd.dev:id/account")
	@CacheLookup
	public
	WebElement accountList;
	
	@FindBy(id = "app.com.brd.dev:id/iv_arrow_back")
	@CacheLookup
	public
	WebElement backBtn;
	
	@FindBy(id = "app.com.brd.dev:id/search")
	@CacheLookup
	public
	WebElement search;
	
	@FindBy(id = "app.com.brd.dev:id/imageButton2")
	@CacheLookup
	public
	WebElement cancelBtn;
	
	@FindBy(id = "app.com.brd.dev:id/input_name")
	@CacheLookup
	public
	WebElement recieveName;
	
	@FindBy(id = "app.com.brd.dev:id/input_cnic")
	@CacheLookup
	public
	WebElement CNIC;
	
	@FindBy(id = "app.com.brd.dev:id/input_cnic_confirm")
	@CacheLookup
	public
	WebElement ConfirmCNIC;
	
	@FindBy(id = "app.com.brd.dev:id/input_mobile")
	@CacheLookup
	public
	WebElement mobileNumber;
	
	@FindBy(id = "app.com.brd.dev:id/input_email")
	@CacheLookup
	public
	WebElement recieverEmail;
	
	@FindBy(id = "app.com.brd.dev:id/imageButton4")
	@CacheLookup
	public
	WebElement nextBtn;
	
	@FindBy(id = "app.com.brd.dev:id/open_transaction")
	@CacheLookup
	public
	WebElement transactionHistory;
	
	@FindBy(id = "app.com.brd.dev:id/ll2")
	@CacheLookup
	public
	WebElement userPayeeManagement;
	
	@FindBy(id = "app.com.brd.dev:id/iv_alert")
	@CacheLookup
	public
	WebElement alertIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@index='3']")
	@CacheLookup
	public
	WebElement adScreenBackBtn;
	
	
}
