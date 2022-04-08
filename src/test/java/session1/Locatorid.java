package session1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorid {
	
	public static void main(String[] args) {
		
		//set the bbrowser path
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		
		//topcasting
		
		WebDriver driver = new ChromeDriver();
		
		//basic fuctinalities of browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//invocking the browser with given uurl
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("landing page title:"+driver.getTitle());
		
		//finding the webelemnt of search box for username fiels
		
		WebElement userNameFiled=driver.findElement(By.name("q"));
		
		//entering the text
		userNameFiled.sendKeys("prajakata");
		
		//clicking in the proceed button
		
		WebElement proceedButton=driver.findElement(By.name("btnK"));
		proceedButton.click();
		
		//fetching the next page title
		
		String nextPageTitle=driver.getTitle()
				;
		//printing the next next page title
		
		System.out.println("nextPageTitle");
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
