package resume_testAutomationEW.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Login {
  
  WebDriver driver;
	
	//Specify the Object/Element Locators 
By UsernameFiled=By.xpath("//input[@id='user-name']");
By PasswordField=By.xpath("//input[@id='password']");
By LoginBttn=By.xpath("//input[@name='login-button']");

By text_Products=By.xpath("//span[text()='Products']");
By buttn_AddtoCaart=By.xpath("(//button[text()='Add to cart'])[1]");
By cart_menu=By.xpath("//a[@class='shopping_cart_link']");
By text_Cart=By.xpath("//span[text()='Your Cart']");

public Page_Login(WebDriver driver)
{
	 this.driver=driver;
}

public void type_Username(String uname) throws InterruptedException
{
	//TC:3 Fill Username textbox with input 
			driver.findElement(UsernameFiled).sendKeys(uname);
			Thread.sleep(5000);
}

public void type_Password(String pwd) throws InterruptedException
{

//TC:4 Fill Password textbox with input 
				driver.findElement(PasswordField).sendKeys(pwd);
				Thread.sleep(5000);
}

public void click_Login() throws InterruptedException
{

//TC:5 Click on Login Button
				driver.findElement(LoginBttn).click();
				Thread.sleep(5000);
}
public String capture_Producttxt()
{
	 return driver.findElement(text_Products).getText();
}
public void click_AddToCart() throws InterruptedException
{
	 driver.findElement(buttn_AddtoCaart).click();
	 Thread.sleep(5000);
}

public void click_CartMenu() throws InterruptedException
{
	 driver.findElement(cart_menu).click();
	 Thread.sleep(5000);
}

public String capture_text_Cart()
{
	 return driver.findElement(text_Cart).getText();
}
}
