package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_create_page {
	@FindBy(xpath = "//input[@name='accountname']") private WebElement orgnametxt;
	@FindBy(xpath = "(//select[@name='industry'])") private WebElement industryDpdwn;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']") private WebElement savebtn;
	
	public Organization_create_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgnametxt() {
		return orgnametxt;
	}

	public WebElement getIndustryDpdwn() {
		
		return industryDpdwn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	

}
