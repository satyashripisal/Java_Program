package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		String url = driver.getPageSource();//the source of current page
		System.out.println(url);
		String url1 = driver.getCurrentUrl(); //means print in output url like https://www.facebook.com/
		System.out.println(url1);
		driver.close();
		

	}

}
