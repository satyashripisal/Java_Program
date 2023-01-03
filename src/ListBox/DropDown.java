package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	
	WebElement a = driver.findElement(By.id("select-demo"));
	a.click();
	
	Select s = new Select(a);
	
	s.selectByIndex(5);
	

	}

}
