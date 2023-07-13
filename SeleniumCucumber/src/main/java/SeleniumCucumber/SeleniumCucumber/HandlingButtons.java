package SeleniumCucumber.SeleniumCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingButtons {

	@Test(invocationCount=3, invocationTimeOut=20000)
	public void handleButton() {

		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		
		
		//get the X and Y co-ordinates
		WebElement ele = driver.findElement(By.id("position"));
		Point point=ele.getLocation();
		int x = point.getX();
		int y=point.getY();
		System.out.println("x = "+x +" y = "+y);
		
		
		//Find the color of the button
		WebElement color = driver.findElement(By.id("color"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);
		
		//Find the Height and Width of the button
		
		WebElement but = driver.findElement(By.id("property"));
		Rectangle rect = but.getRect();
		Dimension dime=rect.getDimension();
		int width = rect.getWidth();
		int height = rect.getHeight();
		
		System.out.println("width "+width +" height "+height);
		driver.close();
		
	}

}
