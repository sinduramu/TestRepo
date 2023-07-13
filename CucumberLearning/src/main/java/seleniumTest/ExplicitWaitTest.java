package seleniumTest;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/waits");
		driver.findElement(By.id("accept")).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert until = webdwait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();

	}

}
