/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author TraOLong
 * This class will store all the locator and method of login page
 *
 */
public class LoginPage {
	WebDriver driver;
	By username = By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]");
	By password = By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]");
	By loginButton = By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)");
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void LoginToWordPress(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
//	public void typeUserName() {
//		driver.findElement(username).sendKeys("admin");
//		
//	}
//	public void typePassWord() {
//		driver.findElement(password).sendKeys("1234");
//	}
//	public void clickOnLoginButton() {
//		driver.findElement(loginButton).click();
//	}
}
