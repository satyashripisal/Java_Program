package checkboxradiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/shree/chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.name("webform"));
		
		int num = a.size();
		System.out.println(num);
		
		for(int i=0;i<num;i++) {
			a.get(i).click();
			
			Thread.sleep(2000);
		}
		
		

	}

}
