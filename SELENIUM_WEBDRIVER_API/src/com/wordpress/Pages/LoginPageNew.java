/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
/**
 * @author TraOLong
 *
 */
public class LoginPageNew {
	WebDriver driver;
	@FindBy (css = "body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]") 
	@CacheLookup
	WebElement username;
	@FindBy (css = "body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]") 
	@CacheLookup
	WebElement password;
	@FindBy (css = "body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)") 
	@CacheLookup
	WebElement loginbutton;
	public LoginPageNew(WebDriver driver) {
		this.driver = driver;
	}
	public void login_wordpress(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
	}

}
