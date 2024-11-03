package browser_setup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Browser_Setup {
	public static Random ran2=new Random();
	
	Locale local=new Locale(null);
	
	
	String url="https://www.mycontactform.com/samples.php";
 public static RemoteWebDriver driver;
  @BeforeClass
  public void beforeClass() {
	 // driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }

  @AfterClass
  public void afterClass() {
//	  driver.close();
  }

}
