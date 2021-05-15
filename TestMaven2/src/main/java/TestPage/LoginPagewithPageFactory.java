/**
 * 
 */
package TestPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.LoginPage;

/**
 * @author TraOLong
 *
 */
public class LoginPagewithPageFactory {
	WebDriver driver;
	LoginPage objLogin;
	String url ="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void testCreateAccount() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.setnewEmail("huan123@gmail.com");
		objLogin.submitCreate();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		objLogin.setalreadyEmail("Thai@gmail.com");
		objLogin.setPasswd("124");
		objLogin.setsubmitLogin();
		Thread.sleep(2000);
		driver.navigate().to(url);;
	}
	
	
	
	
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
