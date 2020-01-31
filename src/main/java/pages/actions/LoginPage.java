package pages.actions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import pages.locators.LoginPageLocators;
import utils.CellValues;
import utils.DataRead;
import utils.WaitHelper;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class LoginPage extends CellValues{
	public WebDriver driver;
	LoginPageLocators loginPageLocator=new LoginPageLocators();
	WaitHelper helper=new WaitHelper();
	public static AndroidDriver<AndroidElement> Driver;
	public String FilePath = ".//Resource//TestData//";
	
	public LoginPage(WebDriver rdriver,AndroidDriver<AndroidElement> Driver1)  {
		Driver=Driver1;
		driver= rdriver;
		PageFactory.initElements(rdriver, loginPageLocator);
	}

	
	
	public void clickAllow() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPageLocator.allow.click();
	}
	public void userNameAndpasswordEnable() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.txtEmail.isEnabled());
		Assert.assertTrue(loginPageLocator.txtPassword.isEnabled());
	}
	
	public void forgetPasswordClickable() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.forgetPass.isEnabled());
		Assert.assertTrue(loginPageLocator.forgetPass.isDisplayed());
	}
	
	public void buttonEnableOnLoginPage(String btnName) throws Exception {
		WebElement loginBtn=driver.findElement(By.xpath("//android.widget.TextView[@text='"+btnName+"']"));
		helper.WaitForElement(driver,loginBtn);
		Assert.assertTrue(loginBtn.isEnabled());
		loginBtn.click();
		
//		Assert.assertTrue(openAccount.isEnabled());
//		Assert.assertTrue(loginPageLocator.qrBtn.isEnabled());
//		Assert.assertTrue(loginPageLocator.helpBtn.isEnabled());
	}
	
	public void setUserName(String uname) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				uname = excel.getUserName();
				loginPageLocator.txtEmail.clear();
				loginPageLocator.txtEmail.sendKeys(uname);
		}
	}
}		


	public void setPassword(String pwd) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				pwd = excel.getPassword();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				loginPageLocator.txtPassword.clear();
				loginPageLocator.txtPassword.sendKeys(pwd);
		}
	}
		
	}

	public void clickLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPageLocator.btnLogin.click();
	}

	public void setOTP(String otp) throws InterruptedException {		
		Thread.sleep(20000);
		
//		for (int i=1;i<=6;i++) {
//			System.out.println("Bachna ey haseeno lou mai agaya");
////			Driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
////			 Driver.pressKey(new KeyEvent(AndroidKey.valueOf("DIGIT_" + 1)));
		//Driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		driver.findElement(By.id("app.com.brd.dev:id/e1")).sendKeys("1");
//		driver.findElement(By.id("app.com.brd.dev:id/e2")).sendKeys("1");
//		driver.findElement(By.id("app.com.brd.dev:id/e3")).sendKeys("1");
//		driver.findElement(By.id("app.com.brd.dev:id/e4")).sendKeys("1");
//		driver.findElement(By.id("app.com.brd.dev:id/e5")).sendKeys("1");
//		driver.findElement(By.id("app.com.brd.dev:id/e6")).sendKeys("1");
//		Driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//		 = new TouchAction();
		
//		 TouchAction a2	=new TouchAction(TouchAction<TouchAction<T>>);
//		 .press(x_cord, y_cord).perform();
		for (int i=1;i<=6;i++) {
//		TouchActions a2 = new TouchActions(driver);
//			TouchAction touchAction = new TouchAction(Driver);
			Thread.sleep(1000);
			Driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
//			touchAction.tap(PointOption.point(196,1601)).perform();
			
		}
		
//		txtOTP.(1);
//		txtOTP.click();
//		}
		Thread.sleep(15000);
	}
	
	public void clickHomebtn() throws Exception {
//		helper.WaitForElement(driver,loginPageLocator.homeBtn);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.homeBtn.isDisplayed());
		loginPageLocator.homeBtn.click();
	}
	public void clickFeedbackBtn(String btnName) throws Exception {
		WebElement feedback=driver.findElement(By.xpath("//android.widget.TextView[@text='"+btnName+"']"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(feedback.isDisplayed());
		feedback.click();
		
	}

	public void verifyTextFieldEmpty() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.textFieldFeedback.click();
		loginPageLocator.textFieldFeedback.clear();	
		Driver.hideKeyboard();
	}
	public void clickSubmitBtn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.submitBtn.click();	
		Thread.sleep(5000);
	}
	
	public void verifyMesage(String msg) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertEquals(loginPageLocator.feedbackEmptyMsg.getText(),msg);
			
	}
	
	public void clickOKBtn() throws Exception {
		
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.OKBtn.click();
		Thread.sleep(3000);
	}
	
	public void enterFeedback() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.textFieldFeedback.click();
		loginPageLocator.textFieldFeedback.sendKeys("Excelent");	
		
		Driver.hideKeyboard();
	}
	
	public void enterNickName(String name) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				helper.WaitForElement(driver,loginPageLocator.nickName);
				name = excel.getNickName();
				loginPageLocator.nickName.click();
				loginPageLocator.nickName.sendKeys(name);
				Driver.hideKeyboard();
				loginPageLocator.next.click();
		}
	}
}
	public void scrollDown() {
		Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));");
	}
	public void verifyTermsConditionsPage() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.termsPage.isDisplayed());	
	}
	public void verifyTermsConditionPageButton() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.termsPageBtn.click();
		Assert.assertTrue(loginPageLocator.termsPage.isEnabled());
		loginPageLocator.termsPageBtn.click();
		
	}
	public void verifyLogout() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.logoutPopUp.isDisplayed());
	}
	public void verifyLogoutButtonFunctional(String logout) throws InterruptedException {
		WebElement logoutBtn=driver.findElement(By.xpath("//android.widget.Button[@text='"+logout+"']"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		logoutBtn.click();
		Thread.sleep(5000);		
	}

	public void dashboardBtn() {
		boolean account=loginPageLocator.accountBtn.getAttribute("clickable").equals("true");
		boolean payment=loginPageLocator.payment.getAttribute("clickable").equals("true");
		if(account||payment) {
			Assert.assertTrue(true);
		}	
	}
	public void verifyBalance(String totalBalance) throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.showBalance.click();
		
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				totalBalance = excel.getBalance();
				WebElement balance=driver.findElement(By.xpath("//android.widget.TextView[@text='"+totalBalance+"']"));
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				Assert.assertTrue(balance.isDisplayed());
				int i=Integer.parseInt(totalBalance); 
				if(i<1000000) {
					balance.click();
				}
				
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				Assert.assertTrue(loginPageLocator.showBalance.isDisplayed());
		}
	}
}
	public void profileScreen() throws InterruptedException {
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.profilePage.isDisplayed());
	}

	public void clickPersnalDetailPage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.profilePersnalDetail.isDisplayed());
		loginPageLocator.profilePersnalDetail.click();
	}

	public void clickEditBtn() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(loginPageLocator.editBtn.isDisplayed());
		loginPageLocator.editBtn.click();	
	}
	public void changeProfileNickName(String nickName) throws InterruptedException {
		Thread.sleep(3000);
//		Assert.assertTrue(loginPageLocator.editText.isEnabled());
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.editText.clear();
		loginPageLocator.editText.sendKeys(nickName);
	}
	public void clickDoneBtn() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.doneBtn.click();
	}
	public void clickBankDetailBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		loginPageLocator.bankAccountDetailPage.click();
		Thread.sleep(3000);
		
	}
	public void verifyBankDetailPage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		String bankDetail=loginPageLocator.bankAccountDetailPage.getText();
		Assert.assertTrue(loginPageLocator.bankAccountDetailPage.isDisplayed());		
	}

	public void verifyDailyTransaction(String text) throws Exception {
		Thread.sleep(3000);
		WebElement verifyText=driver.findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
		Assert.assertTrue(verifyText.isDisplayed());	
		verifyText.click();
		
	}
	
	public void clickOnAccount() {
		loginPageLocator.accountList.click();
	}
	public void clickBackBtn() throws Exception {		
		helper.WaitForElement(driver,loginPageLocator.backBtn);
		loginPageLocator.backBtn.click();
		
	}
	public void searchBankBranch(String bankName) throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		helper.WaitForElement(driver,loginPageLocator.search);
		loginPageLocator.search.click();
		loginPageLocator.search.sendKeys(bankName);	
	}
	
	public void clickCheckBox(String btnName) throws Exception {
		WebElement checkbox=driver.findElement(By.xpath("//android.widget.CheckBox[@text='"+btnName+"']"));
		helper.WaitForElement(driver,checkbox);
		checkbox.click();
		Thread.sleep(5000);
	}
	public void dialougeBox() throws Exception {
	if(loginPageLocator.dialougeBox.isDisplayed()) {
		helper.WaitForElement(driver,loginPageLocator.dialougeBox);
		loginPageLocator.yesBtn.click();
	   }
	}
	public void recieverName(String recievername) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				helper.WaitForElement(driver,loginPageLocator.recieveName);
				recievername = excel.getNickName();
				loginPageLocator.recieveName.clear();
				loginPageLocator.recieveName.sendKeys(recievername);
		}
	}
		
	}
	public void recieverCNIC(String cnic) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				cnic = excel.getCNIC();
				loginPageLocator.CNIC.clear();
				loginPageLocator.CNIC.sendKeys(cnic);
				loginPageLocator.ConfirmCNIC.clear();
				loginPageLocator.ConfirmCNIC.sendKeys(cnic);
		}
	}
		
	}
	public void recieverNumber(String number) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				number = excel.getNumber();
				loginPageLocator.mobileNumber.clear();
				loginPageLocator.mobileNumber.sendKeys(number);
		}
	}
}
	public void recieverEmail(String email) throws Exception {
		List<DataRead> DataList = LoginData(FilePath+"UblDataSheet.xlsx","Credentials");
		if (DataList.size()==0){
			System.out.println("No data found in excel");
		}
		else
		{
			for (DataRead excel : DataList){
				email = excel.getEmail();
				loginPageLocator.recieverEmail.clear();
				loginPageLocator.recieverEmail.sendKeys(email);
		}
	}
		
}
	public void clickNextBtn() throws Exception {
		Driver.hideKeyboard();
		helper.WaitForElement(driver,loginPageLocator.nextBtn);
		loginPageLocator.nextBtn.click();
	}
	public void clickOnPayee() {
		loginPageLocator.transactionHistory.click();
	}


	public void selectsStartDateMonth(String startMonth1, String startMonth2) throws Exception {
		TouchAction press = new TouchAction(Driver);
		WebElement first=driver.findElement(By.xpath("//android.widget.TextView[@text='"+startMonth1+"']"));
		WebElement second=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@index='3']/android.widget.RelativeLayout/android.widget.TextView[@text='"+startMonth2+"']"));	
		helper.WaitForElement(driver,second);
		press.longPress(longPressOptions().withElement(element(second)).withDuration(ofSeconds(3))).moveTo(element(first)).release().perform();
		second.click();
	}
	public void selectsEndDateMonth(String startMonth1, String startMonth2) throws Exception {
		TouchAction press = new TouchAction(Driver);
		WebElement first=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@index='2']/android.widget.LinearLayout/android.widget.TextView[@text='"+startMonth1+"']"));
		WebElement second=driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@index='2']/android.widget.LinearLayout/android.widget.TextView[@text='"+startMonth2+"']"));	
//		helper.WaitForElement(driver,second);
		press.longPress(longPressOptions().withElement(element(second)).withDuration(ofSeconds(3))).moveTo(element(first)).release().perform();
		second.click();
	}
	public void verifyUserPayeeManagement() throws Exception {
		helper.WaitForElement(driver,loginPageLocator.userPayeeManagement);
		Assert.assertTrue(loginPageLocator.userPayeeManagement.isDisplayed());
		
	}
	public void payeeManagementButton() throws Exception {
		for(int i=1; i<=3;i++)
		{
			WebElement btn=driver.findElement(By.xpath("//android.view.View[@index='"+i+"']"));
			helper.WaitForElement(driver,btn);
			Assert.assertTrue(btn.isDisplayed());
			btn.click();
		}
	}
	public void invalidCredentials() throws Exception {
		Thread.sleep(2000);
		WebElement alert=driver.findElement(By.xpath("//android.widget.RelativeLayout[@index=0]"));
		alert.click();
		helper.WaitForElement(driver,loginPageLocator.alertIcon);
		Assert.assertTrue(loginPageLocator.alertIcon.isDisplayed());
		
	}
	public void adScreenBack() throws Exception {
		helper.WaitForElement(driver,loginPageLocator.adScreenBackBtn);
		loginPageLocator.adScreenBackBtn.click();
	}
	public void tapOnScreen() throws InterruptedException {
		TouchAction action = new TouchAction(Driver);
		Thread.sleep(3000);
		action.tap(PointOption.point(369,296)).perform();
		
	}



	public void setDayAndYear(String index,String year) {
		WebElement day=driver.findElement(By.xpath("//android.widget.NumberPicker[2]/android.widget.EditText"));
		String day1=day.getText();
		int i=Integer.parseInt(day1);
		int j=Integer.parseInt(year);
		if(i>j) {
		 Driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().index("+index+").clickable(false).className(\"android.widget.NumberPicker\")).flingBackward().scrollIntoView(new UiSelector().text(\""+year+"\"));"));
		}else {
			Driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().index("+index+").clickable(false).className(\"android.widget.NumberPicker\")).flingForward().scrollIntoView(new UiSelector().text(\""+year+"\"));"));
		}
		
//		Driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"app.com.brd.dev:id/ll_hor2\")).getChildByText(new UISelector().index(2).clickable(false).className(\"android.widget.NumberPicker\"), \"20\")"));
//		new UiScrollable(new UiSelector().scrollable(false).instance(0)).getChildByText(new UiSelector().className("android.widget.TextView"), "Tabs")
	}


//
//	public void getList() {
//		System.out.println("Hellooooooooooooooooooooooooooooooooooooooooooo");
//		WebElement elem=driver.findElement(By.id("app.com.brd.dev:id/option_name"));
//		elem.click();
//		List<WebElement> listElements = driver.findElements(By.id("app.com.brd.dev:id/SectionedRecyclerview"));
//
//		for(WebElement el : listElements){
//		   System.out.println(el.getText());
//		}
		
//	}

}
