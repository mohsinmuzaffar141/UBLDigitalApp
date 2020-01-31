package pages.actions;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.locators.LoginPageLocators;
import pages.locators.PayeeManagementPageLocators;
import pages.locators.SettingPageLocators;
import utils.CellValues;
import utils.WaitHelper;

public class PayeeManagementPage extends CellValues {

	public WebDriver driver;
	SettingPageLocators settingPageLocator=new SettingPageLocators();
	LoginPageLocators loginPageLocator=new LoginPageLocators();
	PayeeManagementPageLocators payementManagementLocator=new PayeeManagementPageLocators();
	WaitHelper helper=new WaitHelper();
	public static AndroidDriver<AndroidElement> Driver;

	public PayeeManagementPage(WebDriver rdriver,AndroidDriver<AndroidElement> Driver1)  {
		Driver=Driver1;
		driver= rdriver;
		PageFactory.initElements(rdriver, loginPageLocator);
		PageFactory.initElements(rdriver, settingPageLocator);
		PageFactory.initElements(rdriver, payementManagementLocator);
	}



	public void enterBankAccount(String account) {
		settingPageLocator.reEnterSixDigitPin.sendKeys(account);
	}


	public void clickCancelBtn() throws Exception {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cancel\"));");
		Thread.sleep(10000);
		loginPageLocator.cancelBtn.click();
	}

	public void scrollKamranMirza(String textABC) {
		Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"app.com.brd.dev:id/expandable_list\")).scrollIntoView(new UiSelector().text(\""+ textABC+ "\"));");
//		WebElement ele=driver.findElement(By.xpath("//android.widget.LinearLayout[8]/android.widget.LinearLayout/android.widget.ImageView[1]"));\
		WebElement ele=driver.findElement(By.xpath("//*[@text =\""+textABC+"\"]/following-sibling::android.widget.ImageView[1]"));
		ele.click();
	}
	
	public void clickPayementBtn() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("app.com.brd.dev:id/pay_button")).click();
	}

	public void clickDeletePayeeBtn() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		payementManagementLocator.deletePayeeBtn.click();
	}
	
	public void verifyTitlePage() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		payementManagementLocator.verifyTitle.click();
		
	}
	
	


}
