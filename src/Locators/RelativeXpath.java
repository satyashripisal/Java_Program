package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//dell//DNYANESHWAR//Desktop//software//chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		
		
		
		
		
		

	}

}
