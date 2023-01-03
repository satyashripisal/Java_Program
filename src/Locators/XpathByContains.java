package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users//dell//DNYANESHWAR//Desktop//software//NEW//chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Gm')]")).click();
		
		
		
		
	}

}
