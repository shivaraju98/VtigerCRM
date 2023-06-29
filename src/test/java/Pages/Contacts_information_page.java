package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_information_page {
	@FindBy(xpath = "//span[@class='dvHeaderText']") private WebElement contactinfotext;
	
	public Contacts_information_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getContactinfotext() {
		return contactinfotext;
	}
	

}
