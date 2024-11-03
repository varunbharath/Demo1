package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;
import reusablemethods.Base_reusable_methods;

public class Countries_page extends Base_reusable_methods {
	
//public static 	Random ran=new Random();
	@FindBy(xpath = "//select[@id='q9']")
	public static WebElement countriesdropdown;
	@FindBy (xpath = "//select[@id='q9']//option")
	public static List<WebElement> listofcountriesdropdown;
	
	public void coundriesdrop() {
	int a	=listofcountriesdropdown.size();
		int b=ran2.nextInt(a);
		listofcountriesdropdown.get(b).click();
		Reporter.log("dropdownfetched the value for countries");
	}
	

}
