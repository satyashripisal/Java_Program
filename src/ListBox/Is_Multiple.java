package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C:/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement a = driver.findElement(By.id("multi-select"));
		
		Select s = new Select(a);
		
		s.selectByIndex(2);
//		s.selectByValue("Ohio");
//		s.selectByVisibleText("Texas");
		boolean sm = s.isMultiple();
		System.out.println(sm);
		
		
		
	}

}
