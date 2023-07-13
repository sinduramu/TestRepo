package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		String buttonURL = driver.getCurrentUrl();
		System.out.println(buttonURL);
		driver.navigate().forward();
		String homeURL = driver.getCurrentUrl();
		System.out.println(homeURL);
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/edit");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
