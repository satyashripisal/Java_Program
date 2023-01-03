package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW97/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		FluentWait<WebDriver>wait2 = new FluentWait<WebDriver>(driver);
		
		wait2.withTimeout(20, TimeUnit.SECONDS);
		wait2.pollingEvery(5, TimeUnit.SECONDS);
		wait2.ignoring(NoSuchElementException.class);
		

	}

}
