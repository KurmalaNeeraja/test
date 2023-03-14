package pageImplementationTestNG;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageModels.LoginPage;
import pageModels.NewCustomer;

public class LogicImplementationTestNG {
	String Acc_id ;
	String Cx_id ;
	WebDriver driver;
	WebElement element;
	
	LoginPage lp;
	NewCustomer newCust;
	
	// @BeforeClass
  @Test(priority=0)
	public void beforeClass() throws InterruptedException 
  {
		 System.setProperty("webdriver.chrome.driver", "C:\\AT tools\\Selenium Java Drivers\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File("C:\\AT tools\\extension_5_4_1_0.crx")); 
			options.addArguments("--remote-allow-origins=*");//to resolve "Invalid Status code=403 text=Forbidden"
			options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
			/*DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);*/
			WebDriver driver = new ChromeDriver(options);
		 //WebDriver driver = new ChromeDriver();
		
		 newCust = new NewCustomer(driver); // creating object 
		 lp = new LoginPage(driver);	  
		 driver.navigate().to("https://demo.guru99.com/V4/index.php");
		 driver.manage().window().maximize();
		       
  }
	 @Test(priority = 1)
	 public void Login() throws InterruptedException
	 {
		 lp.setName("mngr482783");
		 lp.setPassword("A@1235");
		 System.out.println(lp.driver.getCurrentUrl());
		 lp.clickLogin();
		 System.out.println(lp.driver.getCurrentUrl());
	
		 lp.driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click(); 	
	
		 // lm.driver.navigate().refresh();
	 
	  //lm.driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
	 	 
	 }
	
  @Test(priority =2)
  public void AddNewCustomer() throws InterruptedException 
  {
	  
	  newCust.setName("Preeti");
	  newCust.setGender();
	  newCust.setdate("01-03-2001");
	  newCust.setaddress("Kukdel123");	 
	  newCust.setcity("Mumbai");
	  newCust.setstate("Maharashtra");
	  newCust.setpin("332211");
	  newCust.setMobileNo("987654321");
	  
	  //driver.findElement(By.name("emailid")).clear();
	  newCust.setemail("Pr986@mail.com");
	  
	 // driver.findElement(By.name("password")).clear();
	  newCust.setpassword("P@986");
	  Thread.sleep(3000);
	  newCust.clickSubmit();
  }
 
}
