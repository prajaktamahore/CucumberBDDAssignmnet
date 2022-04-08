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

public class DragAndDrop {
	
	WebDriver driver;
	
	
	@Before
	
	public void setUp() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		
		
	}
	@Test
	public void dropdown() {
		
		WebElement ele= driver.findElement(By.id("draggable"));
		
		WebElement dropArea = driver.findElement(By.id("droppable"));
		
		Actions dare= new Actions(driver);
		
		//dare.clickAndHold(ele).moveToElement(dropArea).build().perform();
		dare.dragAndDrop(ele, dropArea).build().perform();
		
	}
		
		
	@After
	public void teardown() {
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
