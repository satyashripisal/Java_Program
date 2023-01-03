package window_popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW97/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.linkText("Click Here")).click();
	    
	    Thread.sleep(2000);
	    
	    Set<String> s = driver.getWindowHandles();
	    System.out.println(s);
	    Iterator<String> it = s.iterator();//windows in sequentially work
	    it.next();
	    String w2nd = it.next();
	    driver.switchTo().window(w2nd);
	    Thread.sleep(2000);
	    driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("btnLogin")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Click Here")).click();
	    
	    //driver.close();
	    driver.quit();
	    
	    
	    
	    

	}

}
