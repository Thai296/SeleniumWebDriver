package TestNG;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestUploadFile {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws InterruptedException {
		WebElement upload1 = driver.findElement(By.cssSelector("#file-upload"));
		Thread.sleep(7000);
		upload1.sendKeys("C:\\Users\\TraOLong\\Desktop\\NguyenQuocThai\\TestWeb\\XPath.docx");
		driver.findElement(By.cssSelector("#file-submit")).click();

		
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
