package TodoMVCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TodoMVCPage {
	
	private WebDriver driver;
	
	//By Locators:

	private By addItem = By.xpath("//input[@class='new-todo']");
	private By todoList = By.xpath("//ul[@class='todo-list']//li//div//label");
	
	//Constructor of the page class:
	

	
	//Page actions: Features (behavior) of the page the form of methods:
	
	public TodoMVCPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void addItem(String item)
	{
		driver.findElement(addItem).sendKeys(item, Keys.ENTER);
	}
	
	public String todoList()
	{
		String actualList = driver.findElement(todoList).getText();
		return actualList;
		
		
	}
	
}
