package window_popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup2{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		it.next();
		String wn2d = it.next();
		driver.switchTo().window(wn2d);
		Thread.sleep(2000);
		
		driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("btnLogin")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
	}
	
}