package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 public WebDriver driver;
	 
	 By Name        = By.name("uid");
	 By Password    = By.name("password");
	 By Button      = By.name("btnLogin");
	 
	 public LoginPage(WebDriver d)
	 {
		this.driver = d;
	 }
	 
	 public void setName(String nm)
	 {
		 driver.findElement(Name).sendKeys(nm);
	 }

	 public void setPassword(String pwd)
	 {
		 driver.findElement(Password).sendKeys(pwd);
	 }
	 
	 public void clickLogin()
	 {
		 driver.findElement(Button).click();
	 }

}
