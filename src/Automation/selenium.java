package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class selenium {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/New folder/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.findElement(By.className("_4jy2")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("satyashri");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Pisal");
	Thread.sleep(2000);
	
	driver.findElement(By.name("reg_email__")).sendKeys("8830916936");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("satya@2209");
	
	WebElement a = driver.findElement(By.id("day"));
	Select s = new Select(a);
	s.selectByValue("8");
	
	WebElement b = driver.findElement(By.id("month"));
	Select s1 = new Select(b);
	s1.selectByValue("2");
	
	WebElement c = driver.findElement(By.id("year"));
	Select s2 = new Select(c);
	s2.selectByValue("1991");
	
	driver.findElement(By.xpath("//input[@value='1']")).click();//female radio 
//	driver.findElement(By.xpath("//input[@value='2']")).click();//male radio
//	driver.findElement(By.xpath("//input[@value='-1']")).click();//other radio
//	Thread.sleep(2000);
	 
	driver.findElement(By.name("websubmit")).click();
	
	}

}
