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

public class RightVClick {
	
	
WebDriver driver;


@Before

public void setUp() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	
}

@Test

public void setup() {
	
	WebElement RightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions dum = new Actions(driver);
	
	dum.contextClick(RightClickButton).build().perform();
	
	
	
	
}	
	
@After
public void teardown() {
	
	driver.quit();
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



