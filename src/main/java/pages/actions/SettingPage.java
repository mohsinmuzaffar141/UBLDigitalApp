package pages.actions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import pages.locators.SettingPageLocators;
import utils.CellValues;
import utils.WaitHelper;

public class SettingPage extends CellValues{

	public WebDriver driver;
	SettingPageLocators settingPageLocator=new SettingPageLocators();
	WaitHelper helper=new WaitHelper();
	public static AndroidDriver<AndroidElement> Driver;

	public SettingPage(WebDriver rdriver,AndroidDriver<AndroidElement> Driver1)  {
		Driver=Driver1;
		driver= rdriver;
		PageFactory.initElements(rdriver, settingPageLocator);
	}

	public void enterQRLimitAmount() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Assert.assertTrue(settingPageLocator.transactionAmount.isEnabled());
		settingPageLocator.transactionAmount.sendKeys("100");	
	}

	public void enterDebitCardNumber() throws Exception {
		helper.WaitForElement(driver,settingPageLocator.debitCardNumber);
		settingPageLocator.debitCardNumber.clear();
		settingPageLocator.debitCardNumber.sendKeys("1234567897891011123");
	}

	public void enterATMPin() throws Exception {
		helper.WaitForElement(driver,settingPageLocator.atmPin);
		settingPageLocator.atmPin.clear();
		settingPageLocator.atmPin.sendKeys("1478");
		Driver.hideKeyboard();
	}


	public void verifyPassHiddenQRTrancsactionLimit() {
		Boolean ele=settingPageLocator.atmPin.getAttribute("password") !=null;
		if(ele) {
			System.out.println("Password is hidden in QR Transaction");
		}
	}

	public void verifyPassHiddenQRPin() {
		Boolean ele=settingPageLocator.sixDigitPin.getAttribute("password") !=null;
		if(ele) {
			System.out.println("Password is hidden in QR Pin");
		}
	}

	public void entersSixDigitPin() {
		settingPageLocator.sixDigitPin.sendKeys("147258");
		settingPageLocator.reEnterSixDigitPin.sendKeys("174238");
	}

}
