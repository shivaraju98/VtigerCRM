package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_lookup_page {
	@FindBy(xpath = "")private WebElement lookupimg;
	
	public Contact_lookup_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}

	public WebElement getLookupimg() {
		return lookupimg;
	}

}
