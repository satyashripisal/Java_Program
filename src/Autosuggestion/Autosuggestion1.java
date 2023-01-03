package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	    List<WebElement> a = driver.findElements(By.tagName("li"));
	    int num = a.size();
	    System.out.println(num);
	    
	   // System.out.println(a.get(num-8).getText());
	    for(int i=0;i<=num-1;i++) {
	    	String s = a.get(i).getText();
	    	System.out.println(s);
	    }
		

	}

}
