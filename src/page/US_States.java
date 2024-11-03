package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import reusablemethods.Base_reusable_methods;

public class US_States extends Base_reusable_methods {
	Random ran1=new Random();
	@FindBy(xpath = "//select[@id='q8']")
	public static WebElement USstates;
	@FindBy(xpath="//select[@id='q8']//option")
  public static List<WebElement> listusstates;
	
	public void usstatesdrop() {
	int sizeofusstatesdrop	=listusstates.size();
	int valuestored=ran1.nextInt(sizeofusstatesdrop);
	listusstates.get(valuestored).click();
	
	}
}
