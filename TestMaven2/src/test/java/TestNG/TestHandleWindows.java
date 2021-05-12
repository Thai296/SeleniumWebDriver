package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHandleWindows {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws InterruptedException {
//		// Open new child window within the main window
//		driver.findElement(By.cssSelector("#text-10 > div > div > a > img")).click();
//
//		// Get handles of the windows
//		String mainWindowHandle = driver.getWindowHandle();
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		Iterator<String> iterator = allWindowHandles.iterator();
//
//		// Here we will check if child window has other child windows and will fetch the
//		// heading of the child window
//		while (iterator.hasNext()) {
//			String ChildWindow = iterator.next();
//			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//				driver.switchTo().window(ChildWindow);
//				WebElement text = driver.findElement(By.cssSelector("#include-whitepaper_new_landing_page > div > div.section_header > div.container_fluid > div.include_info_landing_page.col-xs-12.col-md-6 > a > div"));
//				text.click();
//				System.out.println("Heading of child window is " + text.getText());
//				driver.findElement(By.cssSelector("#signup-btn")).click();
//			}
//		}
//		


        driver.findElement(By.id("windowButton")).click();
        String mainwindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
                if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
                Thread.sleep(5000);
                driver.close();
                System.out.println("Child window closed");
            }
        }    
  
        //  Switch back to the main window which is the parent window.
        driver.switchTo().window(mainwindow);	
	     
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
