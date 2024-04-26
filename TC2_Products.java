package resume_testAutomationEW.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2_Products {
			static Page_Login login;
			static WebDriver driver;
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
		//Verify Products text
				String ExpProdText="Products";
				String ActProdText=login.capture_Producttxt();
				Assert.assertEquals(ActProdText, ExpProdText);
		//Click on Addtocart button
				login.click_AddToCart();
		//Click on Cart Icon
				login.click_CartMenu();
		//Verify your cart text 
				String ExpCartText="Your Cart";
				String ActCartText=login.capture_text_Cart();
				Assert.assertEquals(ActCartText, ExpCartText);
				Thread.sleep(5000);
		//Close the Browser
				driver.close();
				
	  }
  }

