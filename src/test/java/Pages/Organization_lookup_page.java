package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_lookup_page {
	// Declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement lookupclick;
	//intialisation
	public Organization_lookup_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
  //utlisation
	public WebElement getLookupclick() {
		return lookupclick;
	}

}
