/**
 * 
 */
package com.wordpress.TestcasesLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPageNew;

import Hepler.BrowserFactory;

/**
 * @author TraOLong
 *
 */
public class VerifyWordpressLoginPagenew {

	@Test
	public void checkValidUser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/V4/");
		// create page object using page factory
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		// call the method
		login_page.login_wordpress("admin", "demo123");

	}

}
