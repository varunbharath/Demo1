package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import browser_setup.Browser_Setup;
import reusablemethods.Base_reusable_methods;

public class CanadianProvince extends Base_reusable_methods {
	
	@FindBy(xpath = "//select[@id='q10']")
	public static WebElement Canadian;
	@FindBy(xpath = "//select[@id='q10']//option")
	public static List<WebElement> canadian_province;
	
	public void canadiandrop() {
	int sizecanadian	=canadian_province.size();
	int Storedcanadian=ran2.nextInt(sizecanadian);
	canadian_province.get(Storedcanadian).click();
	
	}
	
	

}
