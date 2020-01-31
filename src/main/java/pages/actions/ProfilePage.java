package pages.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.locators.LoginPageLocators;
import utils.WaitHelper;

public class ProfilePage {

	public WebDriver driver;
	LoginPageLocators loginPageLocator=new LoginPageLocators();
	WaitHelper helper=new WaitHelper();
	public static AndroidDriver<AndroidElement> Driver;
	public String FilePath = ".//Resource//TestData//";
	
	public ProfilePage(WebDriver rdriver,AndroidDriver<AndroidElement> Driver1)  {
		Driver=Driver1;
		driver= rdriver;
		PageFactory.initElements(rdriver, loginPageLocator);
	}

	public void clickIBANNumber() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.CheckBox")).click();
		
		
	}

}
