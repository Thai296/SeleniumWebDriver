/**
 * 
 */
package com.wordpress.TestcasesLoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author TraOLong
 *
 */
public class VerifyWordpressLogin {
	@Test
	public void verifyValidLogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage login = new LoginPage(driver);
		login.LoginToWordPress("admin","1234");
		Thread.sleep(3000);
		driver.quit();
	
	}

}
