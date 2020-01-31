package steps;

import java.io.File;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.actions.LoginPage;

public class BaseClass {

	public static WebDriver driver1;
//	public static LoginPage lp;
	public static AndroidDriver<AndroidElement> Driver;
	public static Logger logger;
	public Properties configProp;
	
	
public AndroidDriver<AndroidElement> Capabilities() throws Exception  {
		
		File f=new File("src");
		File fs=new File(f, "UBL Digital_app.com.brd.dev.apk");		
		
		// Real Device
		DesiredCapabilities cap=new DesiredCapabilities();	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo2");
		cap.setCapability(MobileCapabilityType.UDID, "ZY223X2LS4");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
//		cap.setCapability("appPackage", "com.wunderkinder.wunderlistandroid");
//		cap.setCapability("appActivity","com.wunderkinder.wunderlistandroid.activity.WLStartViewFragmentActivity");
		Driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return Driver;
		
	}
	
	//Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
}
