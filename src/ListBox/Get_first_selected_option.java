package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_first_selected_option {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW96/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//select[@id='multi-select']"));
		Select s = new Select(a);
		s.selectByIndex(4);
		s.selectByValue("Texas");
		s.selectByVisibleText("Florida");
		s.selectByIndex(0);
		
		WebElement b = s.getFirstSelectedOption();
		b.getText();
		System.out.println(b.getText());
		
		a.getText();
		System.out.println(a.getText());
		

	}

}
