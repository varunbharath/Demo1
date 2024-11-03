package page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Datepicker {
	
	@FindBy(xpath = "//input[@id='q7']")
	public static WebElement date;
	@FindBy(xpath = "")
	public static WebElement currrentdate;
	
	public static void current_date() {
		date.click();
		
		Date currentdate=new Date();
		SimpleDateFormat stored=new SimpleDateFormat("dd-MM-YYYY");
		String datevalue=stored.format(currentdate);
		//System.out.println(datevalue);
		Reporter.log(datevalue);
	}

}
