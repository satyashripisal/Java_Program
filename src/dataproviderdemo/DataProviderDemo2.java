package dataproviderdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {

	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:/shree/chromedriver.exe/");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@DataProvider(name = "TestData")
	public Object[][] getData1() {
		
	Object[][] data = new Object[1][2];
	data[0][0] = "s ";
	data[0][1] = " t";
	return data;
	}
	@Test(dataProvider = "TestData")
	public void login(String Username, String Password) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satyashripisal91@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("7350346689");
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
	}
}