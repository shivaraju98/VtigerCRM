package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creating_New_Contact_page {
	@FindBy(xpath = "//select[@name='salutationtype']") private WebElement FNdPdwn;
	@FindBy(xpath = "//input[@name='lastname']") private WebElement LNtxt;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement savebtn;
	
	
	public Creating_New_Contact_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getFNdPdwn() {
		return FNdPdwn;
	}


	public WebElement getLNtxt() {
		return LNtxt;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	
	

}
