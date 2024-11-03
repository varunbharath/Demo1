package exeution;

import java.awt.Checkbox;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Source;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser_setup.Browser_Setup;
import page.CanadianProvince;
import page.Checkboxpage;
import page.Countries_page;
import page.Datepicker;
import page.MY_contact_sendkeys;
import page.Multicheckbox;
import page.Pre_defined_field;
import page.Radio_buttonPage;
import page.contact_login;

public class Test_execution extends Browser_Setup {
	private static final File Source = null;
	//TakesScreenshot shot=(TakesScreenshot)driver;
	//File source=shot.getScreenshotAs(OutputType.FILE);
//	@BeforeTest
//	public static void connection() {
//	System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe")	;
//	
//	
//	}
	@BeforeTest
	@Parameters("browser")
	
	public void setupbrowsers(String browser) {
		switch (browser) {
		case "chrome":{
			  System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
              driver = new ChromeDriver();
              Reporter.log("Chrome browser launched");
		}
			
			break;
		case "Edge":
		{ 
		    System.setProperty("webdriver.edge.driver", "C:\\Qtree_Selenium\\EdgeDriver\\edgedriver_win64 (1)\\msedgedriver.exe");
			 // System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
              driver = new EdgeDriver();
              Reporter.log("edge browser launched");
		}
			
			
		
		}
		
	}
	@Test (groups="Sanity")
	public static void Sendkeys() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver,MY_contact_sendkeys.class);
		MY_contact_sendkeys.subject.sendKeys("pass the value");
		Thread.sleep(5000);
		//File dest=new File("C:\\Users\\kumar\\Downloads\\Resume\\screen\\image1\\imagess0.png");
		//FileUtils.copyFile(Source, dest);
		
		MY_contact_sendkeys.emailbox.sendKeys("123456782@GMAIL.COM");
	//	File dest1=new File("C:\\Users\\kumar\\Downloads\\Resume\\screen\\image1\\imagess1.png");
		//FileUtils.copyFile(Source, dest1);
		
		MY_contact_sendkeys.textbox.sendKeys("PASS");
		//File dest2=new File("C:\\Users\\kumar\\Downloads\\Resume\\screen\\image1\\imagess2.png");
		//FileUtils.copyFile(Source, dest2);
		
		MY_contact_sendkeys.textboxmultiline.sendKeys("SAY HI");
	 // File dest3=new File("C:\\Users\\kumar\\Downloads\\Resume\\screen\\image1\\imagess3.png");
	 // FileUtils.copyFile(Source, dest3);
		
		 
	}
	@Test (groups = "Smoke")
	public static void userloginscenario() {
//		PageFactory.initElements(driver,contact_login.class);
//		contact_login.username.sendKeys("user11");
//		contact_login.password.sendKeys("123456@gm");
		if (driver != null) {
		    PageFactory.initElements(driver, contact_login.class);
		    if (contact_login.username != null && contact_login.password != null) {
		        contact_login.username.sendKeys("user11");
		        contact_login.password.sendKeys("123456@gm");
		    } else {
		        Reporter.log("Page elements not initialized correctly.");
		    }
		} else {
		    Reporter.log("Driver not initialized.");
		}

	}
@Test (groups="Sanity")
public static void checkbox1() {
	PageFactory.initElements(driver, Checkboxpage.class);
	Checkboxpage.marketingdept.click();
	Checkboxpage.customerservice.click();
	Checkboxpage.sales.click();
}
@Test(groups = "Smoke")
public static void radiobutton() throws InterruptedException {
	PageFactory.initElements(driver,Radio_buttonPage.class);
	Radio_buttonPage.firstoption.click();
	Thread.sleep(1000);
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@value='Second Option']")));
	//Radio_buttonPage.secondoption.click();
	Radio_buttonPage.secondoption.click();
	//driver.manage().timeouts().implicitlyWait(TimeUnit.toSeconds(10),);
	Thread.sleep(1000);
	Radio_buttonPage.thirdoption.click();
	Thread.sleep(1000);
	Radio_buttonPage.fourthoption.click();
	Thread.sleep(1000);
	Radio_buttonPage.fifthoption.click();
	Reporter.log("Radio button clicked successfully");
}
@Test(groups="Sanity")
public static void multicheckbox() throws InterruptedException {
	PageFactory.initElements(driver, Multicheckbox.class);
	Multicheckbox.firstcheckbox.click();
	Multicheckbox.secondcheckbox.click();
	Multicheckbox.thirdcheckbox.click();
	Multicheckbox.fourthcheckbox.click();
	
	Multicheckbox.fifthcheckbox.click();
	 Reporter.log("Multicheckbox clicked sucessfully");
}
@Test
public static void prenamed() {
	
	PageFactory.initElements(driver, Pre_defined_field.class);
Pre_defined_field obj=new Pre_defined_field();
obj.fake();
Reporter.log("enter the random name");
}
@Test
public static void drop() {
	PageFactory.initElements(driver, CanadianProvince.class);
	CanadianProvince obj=new CanadianProvince();
	obj.canadiandrop();
	Reporter.log("Canadian drop succesfully");
}
@Test
public static void countrydrop() {
	PageFactory.initElements(driver, Countries_page.class);
	Countries_page obj=new Countries_page();
	obj.coundriesdrop();
	Reporter.log("country drop down sucessfully");
}
@Test
public void dateconcept() {
	PageFactory.initElements(driver,Datepicker.class);
	Datepicker obj=new Datepicker();
	obj.current_date();
	Reporter.log("date enter successfully");
}
}
