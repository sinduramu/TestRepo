package seleniumTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		String main = it.next();
		
		driver.switchTo().window(main);
		
		System.out.println(driver.getCurrentUrl());
		String child = it.next();

		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(main);
		driver.close();
		
		
		driver.switchTo().window(child);
		driver.close();
		
		
		
		
		
	}

}
