package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHandle_IFrames {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TraOLong\\git\\course-selenium-webdriver-api\\TestMaven2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
/*
	@Test(priority = 1, description = "handle with one iframe")
	public void f() throws InterruptedException {
// switch to frame using index 0
		driver.switchTo().frame(0);
// switch to frame using id or name 
		driver.switchTo().frame("frame1");
//Locating frame1 using its id
WebElement frame1=driver.findElement(By.id("frame1"));
//Switching the WebDriver context to frame1
driver.switchTo().frame(frame1);
		// Locate the frame1 heading
		WebElement frame1Heading = driver.findElement(By.id("sampleHeading"));
		// Finding the text of the frame1 heading
		String frame1Text = frame1Heading.getText();
		// Print the heading
		System.out.println("Text of the frame1 heading is:" + frame1Text);
		// closing the driver
		Thread.sleep(5000);
		driver.close();

	}
	*/
	@Test(priority = 1, description = "handle a lot of iframes")
	public void f1() {
		//Number of Frames on a Page
        int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);
        
        //Locate the frame1 on the webPage
        WebElement frame1=driver.findElement(By.id("frame1"));
        
        //Switch to Frame1
        driver.switchTo().frame(frame1);
        
        //Locate the Element inside the Frame1
        WebElement frame1Element= driver.findElement(By.tagName("body"));
        
        //Get the text for frame1 element
        String frame1Text=frame1Element.getText();
        System.out.println("Frame1 is :"+frame1Text);
        
        //Number of Frames on a Frame1
        int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
        
        //switch to child frame
        driver.switchTo().frame(0);
        
        int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
		
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
