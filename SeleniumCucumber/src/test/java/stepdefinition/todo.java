package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class todo {

	public static WebDriver driver;
	public static String expectedTodoList1 = "Buy Milk";


	@Test
	public static void m1()
	{
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://todomvc.com/examples/vue/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@class='new-todo']"));
		ele.sendKeys(expectedTodoList1, Keys.ENTER);
		String ActualTodoList1 = driver.findElement(By.xpath("//ul[@class='todo-list']//li//div//label")).getText();
		Assert.assertEquals(expectedTodoList1, ActualTodoList1);
		String text2 = driver.findElement(By.xpath("//span[@class='todo-count']")).getText();
		Assert.assertEquals(text2, "1 item left");

		WebElement all = driver.findElement(By.xpath("//a[@href='#/all']"));
		String allSelected = all.getAttribute("class");
		System.out.println(allSelected);
		
		if(allSelected.equals("selected"))
		{
			System.out.println("All is selected");
		}

		WebElement active = driver.findElement(By.xpath("//a[@href='#/active']"));
		String activeSelected = active.getAttribute("class");
		System.out.println(activeSelected);
		
		if(activeSelected.equals(""))
		{
			System.out.println("Active is unset");
		}
		else
		{
			System.out.println("Active is set");
		}


		WebElement completed = driver.findElement(By.xpath("//a[@href='#/completed']"));
		String completedSelected = completed.getAttribute("class");
		System.out.println(completedSelected);
		
		if(completedSelected.equals(""))
		{
			System.out.println("Completed is unset");
		}
		else
		{
			System.out.println("completed is set");
		}
		
		boolean displayed = driver.findElement(By.xpath("//button[@class='clear-completed']")).isDisplayed();
		System.out.println(displayed);
		
		driver.findElement(By.xpath("//label[@for='toggle-all']")).click();
		

		boolean displayed1 = driver.findElement(By.xpath("//button[@class='clear-completed']")).isDisplayed();
		System.out.println(displayed1);
		
	



	}


}
