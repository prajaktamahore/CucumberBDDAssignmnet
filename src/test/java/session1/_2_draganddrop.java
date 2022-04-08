package session1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_draganddrop {
	
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		
	}
	@Test
	public void DropDown() throws InterruptedException{
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement fare = driver.findElement(By.id("draggable"));
		WebElement dare = driver.findElement(By.id("droppable"));
		
		Actions get = new Actions(driver);
		Thread.sleep(4000);
		
		
	//	get.clickAndHold(fare).moveToElement(dare).build().perform();
		
	get.dragAndDrop(fare, dare).build().perform();	
		
	}
	@After
	public void tearDown(){
		
		driver.quit();
		
		
		
		
		
		
		
		
		
				
		
		
		
	}
	
	

}
