package page;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MY_contact_sendkeys {
	@FindBy(xpath = "//label[text()='Subject: ']//following::input[@id='subject']")
	public static WebElement subject;
	@FindBy(xpath = "//label[text()='E-mail Address: ']//following::input[@id='email']")
	public static WebElement emailbox;
	@FindBy(xpath = "//label[text()='E-mail Address: ']//following::input[@id='q1']")
public static WebElement textbox;
	@FindBy(xpath = "//textarea[@id='q2']")
	public static WebElement textboxmultiline;
	
}
 