package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Radio_buttonPage {
	// my contactform check box
	 @FindBy(xpath = "(//input[@id='q4'])[1]")
	 public static WebElement firstoption;
	 @FindBy(xpath = "//input[@value='Second Option']")
	 public static WebElement secondoption;
	 @FindBy(xpath = "//input[@value='Third Option']")
	 public static WebElement thirdoption;
	 @FindBy(xpath="//input[@value='Fourth Option']")
	 public static WebElement fourthoption;
	 @FindBy(xpath = "//input[@value='Fifth Option']")
	 public static WebElement fifthoption;
	 

}
