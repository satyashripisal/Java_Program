package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//dell//DNYANESHWAR//Desktop//software//chromedriver.exe/");
		
		WebDriver driver= new ChromeDriver();
	   driver.get("https://www.google.com/");
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.className("gb_f")).click();
	
	//Thread.sleep(2000);
//		driver.findElement(By.name("login"));// name locatorcha use kay ahe 
		
		//driver.get("https://www.google.com/");
		
		
		
		
		
		
	}

}
