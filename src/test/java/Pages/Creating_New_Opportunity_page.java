package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creating_New_Opportunity_page {
	@FindBy(xpath = "//input[@name='potentialname']")private WebElement OPPnametx;
	@FindBy(xpath = "//input[@name='related_to_display']")private WebElement Relatestotxt;
	@FindBy(xpath = "//select[@name='assigned_user_id']")private WebElement AssignedtoDPdwn;
	@FindBy(xpath = "//input[@id='jscal_field_closingdate']")private WebElement ClosedateDPdwn;
	@FindBy(xpath = "//select[@name='sales_stage']")private WebElement SalesStage;
	
	

}
