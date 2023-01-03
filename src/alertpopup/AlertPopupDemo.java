package alertpopup;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("53290");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
//		driver.switchTo().alert();
//		Thread.sleep(2000);
		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		
		alt.dismiss();
		alt.accept();
		Thread.sleep(4000);
		
		alt.accept();
		
		

	}
}