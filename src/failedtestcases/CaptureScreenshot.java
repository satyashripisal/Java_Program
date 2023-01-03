package failedtestcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenshot extends MainTest{

	@Test
	public  void captureScreenshot() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		Assert.assertEquals("Facebook – log in or sign up", title);
		
		driver.close();
		}
}
