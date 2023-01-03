package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.tagName("li"));
		
		int num = a.size();//length start from 1
		System.out.println(num);
		
		for(int i=0;i<=num-1;i++) {//index start from 0
			String abc = a.get(i).getText();
		
			System.out.println(abc);
			//String selenium;
			/*String xyz = "selenium ide";
			if(abc==xyz) {
				break;
			}*/
			
			//Thread.sleep(-1000);java.lang.illegalException because of negative value
			//Thread.sleep(1000);
		}
//		System.out.println();
		

	}

}
