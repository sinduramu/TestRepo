package stepdefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class todoOne {

	public static WebDriver driver;
	static ArrayList<String> l1=new ArrayList<String>(Arrays.asList("Buy Milk", "Buy Sugar", "Buy Coffee powder"));
	static ArrayList<String> l2=new ArrayList<String>();
	

	@Test
	public static void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://todomvc.com/examples/vue/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@class='new-todo']"));
		for(String list:l1)
		{
			ele.sendKeys(list, Keys.ENTER);
		}

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='todo-list']//li//div//label"));
		for(WebElement ele1:elements)
		{
			String text = ele1.getText();
			System.out.println(text);
			l2.add(text);
			
		}
		System.out.println(l1.containsAll(l2));
		String text2 = driver.findElement(By.xpath("//span[@class='todo-count']")).getText();
		String text3 = driver.findElement(By.xpath("//span[@class='todo-count']//strong")).getText();
		Integer size=Integer.parseInt(text3);
		System.out.println(size);
		System.out.println(l1.size());
		
		

	}



}
