package seleniumTest;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.id("fullName")).sendKeys("Sindu Ramachandran");
		driver.findElement(By.id("join")).sendKeys(" Person");
		String attribute = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.id("getMe")).getAttribute("value");
		driver.findElement(By.id("clearMe")).clear();
		boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		if(enabled==true)
		{
			System.out.println("That field is enabled");
		}
		else
		{
			System.out.println("Field is disabled");
		}
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		
	}

}
