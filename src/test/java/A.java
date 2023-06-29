import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericUtilities.PropertFileFetching;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://localhost:8888/");
driver.manage().window().maximize();
Random ran=new Random();
int r =ran.nextInt(500);
//create object of PropertyFileFetching class
PropertFileFetching p=new PropertFileFetching();
String USERNAME = p.readDataFromPrpertyFile("username");
String PASSWORD = p.readDataFromPrpertyFile("password");
driver.findElement(By.xpath("")).sendKeys(USERNAME);
driver.findElement(By.xpath("")).sendKeys(PASSWORD);
driver.findElement(By.xpath("//input[@id='submitButton']")).click();
driver.findElement(By.xpath("//a[text()='Organizations']")).click();
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("infosys"+r);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
Thread.sleep(3000);
//comparison
String orgname=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

if(orgname.contains("infosys")) {
	System.out.println("TC is passed");
}
else {
	System.out.println("TC is Failed");
}
//logout mouse action


driver.findElement(By.xpath("//a[text()='Sign Out']")).click();


WebElement  ele=driver.findElement(By.xpath("(//select[@class='small'])[2]"));

Select st=new Select(ele); 
st.selectByValue("Chemicals");
Thread.sleep(3000);

WebElement logout= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

Actions as=new Actions(driver);
as.moveToElement(logout).perform();
systemm.out.println("Hi ra gundu This is Your boss")
Thread.sleep(3000);
	
}





}

