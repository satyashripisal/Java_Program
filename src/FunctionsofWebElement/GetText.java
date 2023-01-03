package FunctionsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		String abc = driver.findElement(By.tagName("a")).getText();
		System.out.println(abc);
		
		String abc1 = driver.findElement(By.xpath("//a[@class='gb_f'][2]")).getText();
		System.out.println(abc1);
		
		

	}

}
