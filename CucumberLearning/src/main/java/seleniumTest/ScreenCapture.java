package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		//take screen shot of the page
		File src=driver.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./screen/page.png");
		FileHandler.copy(src, destination);
		
		
		//take screen shot of element
		WebElement ele = driver.findElement(By.id("home"));
		File eleSrc=ele.getScreenshotAs(OutputType.FILE);
		File eleDest=new File("./screen/ele.png");
		FileHandler.copy(eleSrc, eleDest);
		
		//take screen shot of section level
		WebElement sec = driver.findElement(By.xpath("//div[@class='content']"));
		File secSrc=sec.getScreenshotAs(OutputType.FILE);
		File secDest=new File("./screen/sec.png");
		FileHandler.copy(secSrc, secDest);

	}

}
