package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Multicheckbox {
@FindBy(xpath = "//input[@value='First Check Box']")
public static WebElement firstcheckbox;
@FindBy(xpath = "//input[@value='Second Check Box']")
public static WebElement secondcheckbox;
@FindBy(xpath = "//input[@value='Third Check Box']")
public static WebElement thirdcheckbox;
@FindBy(xpath = "//input[@value='Fourth Check Box']")
public static WebElement  fourthcheckbox;
@FindBy (xpath = "//input[@value='Fifth Check Box']")
public static WebElement fifthcheckbox;
}
