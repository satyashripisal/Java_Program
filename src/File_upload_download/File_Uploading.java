package File_upload_download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement uploadElement = driver.findElement(By.className("upload_txt"));
		
		uploadElement.sendKeys("C:/Users/dell/DNYANESHWAR/Desktop/software testing/4.Change position of browser.docx");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.name("send")).click();
		

	}

}
