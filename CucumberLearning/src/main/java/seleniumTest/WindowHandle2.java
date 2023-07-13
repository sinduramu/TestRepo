package seleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(windowHandles);
		
		for(int i=0;i<ls.size();i++)
		{
			driver.switchTo().window(ls.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
	/*	driver.switchTo().window(ls.get(1));
		
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		
		driver.switchTo().window(ls.get(0));
		
		driver.close();
		driver.switchTo().window(ls.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	*/	
		
		
	}

}
