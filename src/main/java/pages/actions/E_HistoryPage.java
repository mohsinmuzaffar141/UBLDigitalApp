package pages.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.locators.E_HistoryLocators;
import pages.locators.LoginPageLocators;
import pages.locators.PayeeManagementPageLocators;
import pages.locators.SettingPageLocators;
import utils.WaitHelper;

public class E_HistoryPage {
	public WebDriver driver;
	SettingPageLocators settingPageLocator=new SettingPageLocators();
	LoginPageLocators loginPageLocator=new LoginPageLocators();
	PayeeManagementPageLocators payementManagementLocator=new PayeeManagementPageLocators();
	E_HistoryLocators eHistoryLocators=new E_HistoryLocators();
	WaitHelper helper=new WaitHelper();
	public static AndroidDriver<AndroidElement> Driver;

	public E_HistoryPage(WebDriver rdriver,AndroidDriver<AndroidElement> Driver1)  {
		Driver=Driver1;
		driver= rdriver;
		PageFactory.initElements(rdriver, loginPageLocator);
		PageFactory.initElements(rdriver, settingPageLocator);
		PageFactory.initElements(rdriver, payementManagementLocator);
		PageFactory.initElements(rdriver, eHistoryLocators);
	}

	public void verifyEHistoryPage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(eHistoryLocators.transactionID.isDisplayed());
		
	}

	public void verifyBankNameEHistoryPage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(eHistoryLocators.bankNameEHistory.isDisplayed());
		
	}
	
	public void verifyAccountNoEHistoryPage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(eHistoryLocators.e_HistoryAcct.isDisplayed());
	}
	
	public void transferListScroll(String transaction) {
		Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"app.com.brd.dev:id/tranhist_recycler_view\")).scrollIntoView(new UiSelector().text(\""+ transaction+ "\"));");
	}

	public void listScrollUp() {
		Driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"app.com.brd.dev:id/tranhist_recycler_view\")).flingBackward()"));
		
	}
	
	
}
