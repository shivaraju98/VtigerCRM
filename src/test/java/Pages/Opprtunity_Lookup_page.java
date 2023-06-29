package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opprtunity_Lookup_page {
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement opprtunitylookupimg;
	
public Opprtunity_Lookup_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
	
	
}

public WebElement getOpprtunitylookupimg() {
	return opprtunitylookupimg;
}
}
