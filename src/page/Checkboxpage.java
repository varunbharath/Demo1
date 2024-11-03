package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkboxpage {
	
	@FindBy(xpath = "//input[@name='email_to[]'][1]")
	public static WebElement marketingdept;
 @FindBy(xpath = "//input[@name='email_to[]'][2]")
  public static WebElement sales;
  @FindBy (xpath = "//input[@name='email_to[]'][3]")
  public static WebElement customerservice;

}
