package SeleniumCucumber.SeleniumCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.ReadData;

public class LoginTest extends ReadData{
	

	
@Test(dataProvider = "login")	
public  void meth(String email, String pass)
{
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/");
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(pass);
	
}

}
