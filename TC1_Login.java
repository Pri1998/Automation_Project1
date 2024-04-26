package resume_testAutomationEW.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_Login {
	static Page_Login login;
	static WebDriver driver;
	//These variables are likely meant to be used across multiple instances of the class where they are declared.
  @Test
  public void verifySDLogin() throws InterruptedException {

		//TC:1 Launch Chrome Browser 
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
	//TC:2 Goto Test URL https://www.saucedemo.com/
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(5000);
			login=new Page_Login(driver);
	//Fill Username textbox with input
			login.type_Username("standard_user");
	//Fill Password textbox with input 
			login.type_Password("secret_sauce");
	//Click on Login Button
			login.click_Login();
			//TC:6 Verify Login
			String ExpectedURL="https://www.saucedemo.com/inventory.html";
			String ActualURL=driver.getCurrentUrl();
			Assert.assertEquals(ActualURL, ExpectedURL);
			Thread.sleep(5000);
			driver.close();
			
  }
}

 
