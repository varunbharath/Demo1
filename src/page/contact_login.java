package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contact_login {
@FindBy(xpath = "(//input[@id='user'])[1]")
public static WebElement username;
@FindBy(xpath = "(//input[@id='pass'])[1]")
public static WebElement password;


}
