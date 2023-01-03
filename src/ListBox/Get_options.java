package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_options {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://Users//dell//DNYANESHWAR//Desktop//software//chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement a = driver.findElement(By.name("States"));
		
		Select s = new Select(a);
		
		List<WebElement>b = s.getOptions();
		int c = b.size();
		System.out.println(c);
		
		for(int i= 0; i<=c-1;i++) {
			String d = b.get(i).getText();
			System.out.println(d);
			Thread.sleep(2000);
			
		}
		

	}

}
