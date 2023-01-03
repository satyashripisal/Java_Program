package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW97/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		gmail.click();
		

	}

}
