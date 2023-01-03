package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyClassTABDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("email")).sendKeys("satyashripisal91@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("7350346689");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		//actions.sendKeys(driver.findElement(By.id("email")), Keys.TAB).build().perform();
		
		//actions.sendKeys(driver.findElement(By.id("pass")), Keys.TAB).build().perform();

	}

}
