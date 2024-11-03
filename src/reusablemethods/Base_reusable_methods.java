package reusablemethods;

import java.io.File;
import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import browser_setup.Browser_Setup;

public class Base_reusable_methods extends Browser_Setup {

	 public static	Actions Act=new Actions(driver);
	 public static Random ran2=new  Random();
	  public static JavascriptExecutor js=(JavascriptExecutor)driver;
	  public static Locale local=new Locale(null);
	  public static TakesScreenshot shot=(TakesScreenshot)driver;
	  public static File source=shot.getScreenshotAs(OutputType.FILE);
	
}
