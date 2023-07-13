package runnersteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
	//WebDriverManager wd;
	ChromeDriver driver;
	
	
	/*@Given("Open Testleaf CRM Application and Login should success")
	public void openTestleafCRMApplicationAndLoginShouldSuccess() {
	    //System.out.println("3");
	  // WebDriverManager.chromedriver().setup();
	   /* driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");*/
	   /* System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	    
	}*/
/*
	@Given("Enter Username as CRMSFA")
	public void enterUsernameAsCRMSFA() {
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
	}

	@Given("Enter Password as")
	public void enterPasswordAs() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
*/
	
	@Given("Open Testleaf CRM Application and Login")
	public void openTestleafCRMApplicationAndLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	}

	@Then("Login should not Success and get error message")
	public void loginShouldNotSuccessAndGetErrorMessage() {
		String sMsg = driver.findElement(By.xpath("//div[@id='errorDiv']/p[2]")).getText();
		System.out.println(sMsg);
	}
	
	/*@Given("Open Testleaf CRM Application and Login should not Success")
	public void openTestleafCRMApplicationAndLoginShouldNotSuccess() {
		String sMsg = driver.findElement(By.xpath("//div[@id='errorDiv']/p[2]")).getText();
		System.out.println(sMsg);
	}*/

	@Given("Enter Username as {string}")
	public void enterUsernameAs(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter Password as {string}")
	public void enterPasswordAs(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@Given("Click Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Login Success and Navigate to Go Homepage")
	public void loginSuccessAndNavigateToGoHomepage() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.quit();
		}

}
