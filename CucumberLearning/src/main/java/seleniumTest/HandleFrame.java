package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("sindu");
		driver.findElement(By.name("lname")).sendKeys("kalidas");
		WebElement ele=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.name("email")).sendKeys("sinduramu@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("gurusamy");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();
		
		

	}

}
