package Methodof_WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class change_Position_of_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//dell//DNYANESHWAR//Desktop//software//NEW96//chromedriver.exe/");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		Point p = new Point(100,100);//set Position
		
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		Dimension d = new Dimension(300,700);//set dimension (width,height)
		
		driver.manage().window().setSize(d);
		
	}

}
