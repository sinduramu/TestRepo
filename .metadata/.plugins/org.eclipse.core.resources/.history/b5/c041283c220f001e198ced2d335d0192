package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class HomePage {
	
	private TestBase testbase = new TestBase();
	private WebDriver driver;
	private By BusTicketLink = By.id("bus_tickets_vertical");
	
	
	public void openURL()
	{
		driver = testbase.intialization();
		System.out.println("Open the URL");
	}
	
	public void verifyHomePageloaded()
	{
		driver.get("https://www.redbus.in");
		System.out.println("User landed on the Homepage");
	}
	
	public void getPageTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void isBusLinkVisible()
	{
		if(driver.findElement(BusTicketLink).isDisplayed())
			System.out.println("Bus Ticket Link is visible");
		else
			System.out.println("Bus Ticket Link is not visible");
	}

}
