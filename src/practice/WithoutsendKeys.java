package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutsendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		WebElement wb = driver.findElement(By.name("email"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='satyashripisal91@gmail.com';", wb);
		
//		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40'");
//		 Thread.sleep(2000);
//		 ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100'");
		

	}

}
