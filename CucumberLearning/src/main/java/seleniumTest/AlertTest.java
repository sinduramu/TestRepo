package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");

		//Simple Alert
		driver.findElement(By.id("accept")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		//Confirmation Alert
		driver.findElement(By.id("confirm")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.dismiss();
		
		//Prompt alert
		
		driver.findElement(By.id("prompt")).click();
		Alert alert2=driver.switchTo().alert();
		
		alert2.sendKeys("Passing some text in the prompth alert");
		Thread.sleep(2000);
		System.out.println(alert2.getText());
		alert2.accept();
		driver.switchTo().alert().accept();
	}

}
