package session1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	WebDriver driver;
	
	@Before
	public void SetUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
	}
	@Test
	public void setup() throws InterruptedException {
		
	WebElement CreatNewAcntbutton= driver.findElement(By.xpath(("//a[@role='button'and text()='Create New Account']"	)));
	CreatNewAcntbutton.click();
	
	WebElement birthDay=driver.findElement(By.id("day"));
	WebElement birthMonth=driver.findElement(By.id("month"));
	WebElement birthyear=driver.findElement(By.id("year"));
	
		
	Select dayselect= new Select(birthDay);
	dayselect.selectByVisibleText("3");
	
	Thread.sleep(4000);
	
	Select monthselect= new Select(birthMonth);
	monthselect.selectByVisibleText("Dec");
	
		
	Select yearselect= new Select(birthyear);
	yearselect.selectByVisibleText("1995");
		
	}
	
	@After
	public void teardown() {
		
		driver.quit();
		
		
		
		
	}
	

}
