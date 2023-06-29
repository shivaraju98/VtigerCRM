package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organization_information_page {
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement orgnametxt;
	
	public organization_information_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getOrgnametxt() {
		return orgnametxt;
	}

}
