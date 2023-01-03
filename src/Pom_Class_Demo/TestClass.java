package Pom_Class_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		PomDemo1 pom1 = new PomDemo1(driver);
		pom1.search();
		Thread.sleep(2000);
		
		PomDemo2 pom2 = new PomDemo2(driver);
		pom2.gmail();
		

	}

}
