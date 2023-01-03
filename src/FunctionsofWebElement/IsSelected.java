package FunctionsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).click();
		
		boolean abc = driver.findElement(By.tagName("input")).isSelected();
		System.out.println(abc);
		
		
		
		
		

	}

}
