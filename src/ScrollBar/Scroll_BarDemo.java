package ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_BarDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		  //driver.get("https://www.javatpoint.com/control-flow-in-java");
	        
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			JavascriptExecutor   j  =  (JavascriptExecutor)driver;
			
			j.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(2000);
			j.executeScript("window.scrollBy(0,-1000)");
		
		

	}

}
