package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("sinduramu@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Kalidas.87");
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		driver.quit();
		
		
	}

}
