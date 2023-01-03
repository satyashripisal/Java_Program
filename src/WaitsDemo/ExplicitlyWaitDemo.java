package WaitsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		searchbox.sendKeys("selenium");
		
		

	}

}
