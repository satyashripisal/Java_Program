package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/students/actions");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.name("dblClick"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(doubleclick).build().perform();
		
		driver.switchTo().alert().accept();
		

	}

}

