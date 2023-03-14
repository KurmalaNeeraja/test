package pageImplementation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageModels.*;
public class LogicImplementation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AT tools\\Selenium Java Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginPage lm=new LoginPage(driver);
		NewCustomer bp=new NewCustomer(driver);
		String Acc_id ;
		String Cx_id ;
		WebElement element;
		 driver.navigate().to("https://demo.guru99.com/V4/index.php");
		 driver.manage().window().maximize();
		 lm.setName("mngr482783");
		 lm.setPassword("A@1235");
		 lm.clickLogin();
		 driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click(); 	
		  driver.navigate().refresh();
		
		  driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		  bp.setName("Preeti");
		  bp.setGender();
		  bp.setdate("01-03-2001");
		  bp.setaddress("Kukdel123");	 
		  bp.setcity("Mumbai");
		  bp.setstate("Maharashtra");
		  bp.setpin("332211");
		  bp.setMobileNo("987654321");
		  
		  //driver.findElement(By.name("emailid")).clear();
		  bp.setemail("Pr986@mail.com");
		  
		 // driver.findElement(By.name("password")).clear();
		  bp.setpassword("P@986");
		  Thread.sleep(3000);
		  bp.clickSubmit();	 
	}

}
