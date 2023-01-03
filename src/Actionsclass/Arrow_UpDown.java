package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Arrow_UpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).click();
		   Thread.sleep(2000);
		Actions a = new Actions(driver);
		for(int i=0;i<=7;i++) {
			a.sendKeys(Keys.ARROW_DOWN).build();
			Thread.sleep(2000);
			
		}
		for(int i=0;i<=6;i++) {
			a.sendKeys(Keys.ARROW_UP).build();		
			Thread.sleep(2000);
			
		}
		Action act = (Action)driver;
		act.perform();
		

	}

}
