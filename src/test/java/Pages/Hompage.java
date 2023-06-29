package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hompage {
	//declaration
	@FindBy(xpath = "//a[text()='Organizations']")private WebElement orglink;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement conlink;
	@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opplink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement adminimg;
	@FindBy(xpath = "//a[text()='Sign Out']")private WebElement signoutlink;
	//intialisation
public Hompage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	//utilization
	
	
}
public WebElement getOrglink() {
	return orglink;
}
public WebElement getConlink() {
	return conlink;
}
public WebElement getOpplink() {
	return opplink;
}
public WebElement getAdminimg() {
	return adminimg;
}
public WebElement getSignoutlink() {
	return signoutlink;
}
}
