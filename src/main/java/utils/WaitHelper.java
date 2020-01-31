package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	/*
	 * private WebDriver _driver;
	 */	
	public void WaitForElement(WebDriver d,WebElement element) throws Exception{
		WebDriverWait wait = new WebDriverWait(d, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
}
