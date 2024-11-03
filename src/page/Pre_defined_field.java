package page;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import browser_setup.Browser_Setup;
import reusablemethods.Base_reusable_methods;

public class Pre_defined_field  extends Base_reusable_methods{
//public class Pre_defined_field extends Base_reusable_methods{

	@FindBy(xpath="//select[@name='q11_title']")
	public static WebElement pre;
	@FindBy(xpath = "//select[@name='q11_title']//option")
	public static WebElement listpre;
	@FindBy(xpath = "//input[@name='q11_first']")
	public static WebElement Firstname;
	@FindBy(xpath = "//input[@name='q11_last']")
	public static WebElement lastname;
	public void fake() {
	List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob", "Charlie");
	
     String randomName = names.get(ran2.nextInt(names.size()));

     // Locate the input field
  //   WebElement inputField = driver.findElement(By.xpath(Firstname))); // Use correct locator for the field

     // Clear any existing text in the field
     Firstname.clear();

     // Enter the random name into the input field
     Firstname.sendKeys(randomName);

     // Add any further interactions if needed, such as submitting the form
     // WebElement submitButton = driver.findElement(By.id("submitButtonId"));
     // submitButton.click();

 }
	public static void  lastname_method() {
		List<String> lastname1=Arrays.asList("singh","reddy","nayar","sheddy");
	String randomlastname	=lastname1.get(ran2.nextInt(lastname1.size()));
	lastname.clear();
	lastname.sendKeys(randomlastname);
	
	}
	

}
