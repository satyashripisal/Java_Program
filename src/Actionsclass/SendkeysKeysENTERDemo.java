package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysKeysENTERDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("satyashripisal91@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("7350346689");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
//		action.sendKeys(Keys.TAB).build().perform();
//		Thread.sleep(2000);
//		action.sendKeys("735034668").build().perform();
		
		
	}

}
