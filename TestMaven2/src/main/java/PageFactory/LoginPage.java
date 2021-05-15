/**
 * 
 */
package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TraOLong
 *
 */
public class LoginPage {
	WebDriver driver;
	//create new account with email 
	@FindBy(css = "#email_create")
	WebElement createEmail;
	@FindBy(css = "#SubmitCreate")
	WebElement submitCreate;
	// Log in already account
	@FindBy(css = "#email")
	@CacheLookup
	WebElement email;
	@FindBy (css ="#passwd")
	@CacheLookup
	WebElement password;
	@FindBy(css ="#login_form > div > p.lost_password.form-group > a")
	WebElement forgotpass;
	@FindBy (css = "#SubmitLogin")
	WebElement submitLogin;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setnewEmail(String strnewEmail) {
		createEmail.sendKeys(strnewEmail);
	}

	public void submitCreate() {
		submitCreate.click();
	}
	public void setalreadyEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	public void setPasswd(String strPass) {
		password.sendKeys(strPass);
	}
	public void setForgotPass() {
		forgotpass.click();
	}
	public void setsubmitLogin() {
		submitCreate.click();
	}
}
