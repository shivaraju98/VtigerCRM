package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	//Declaration
	@FindBy(xpath="//input[@name='user_name']") private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']") private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='submitButton']") private WebElement loginbtn;
	
//intialization
	public Loginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//utilization
	
}
