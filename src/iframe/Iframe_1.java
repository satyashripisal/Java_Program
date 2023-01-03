package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();//AbstractDriverOptions
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("AbstractDriverOptions")).click();//org.openqa.selenium.chrome
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("By.Remotable")).click();
		
		
		

	}

}
