package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		
		 Boolean abc = ele.isDisplayed();
		 Boolean xyz = ele.isEnabled();
		 Boolean pqr = ele.isSelected();
		 System.out.println(abc);
		 System.out.println(xyz);
		 System.out.println(pqr);
		
		 
		
		
		
	}

}
