package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKysDemo1 {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions actions = new Actions(driver);
		
		actions.click(gmail).build().perform();
		
		
		

	}

}
