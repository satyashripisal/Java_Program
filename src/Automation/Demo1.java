package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/dell/DNYANESHWAR/Desktop/software/New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		driver.getTitle();
//		String title1 = driver.getTitle();
//		System.out.println(title1);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
		driver.getCurrentUrl();
		String currentUrl =driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.close();
		
		
		
		
		
		
		
	}

}
