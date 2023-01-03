package FunctionsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_web_Element {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
	     WebElement abc = driver.findElement(By.className("gb_f"));
	     
	     System.out.println(abc.getText());
	     System.out.println(abc.isEnabled());//present  or not
	     System.out.println(abc.isSelected());//for checkbox
	     
	     System.out.println(abc.isDisplayed());//active or not
	     
}
}
