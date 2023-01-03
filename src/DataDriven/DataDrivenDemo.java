package DataDriven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		FileInputStream excel = new FileInputStream("C:/Users/dell/DNYANESHWAR/Desktop/pqr.xlsx");
		
		Sheet a = WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b = a.getRow(3).getCell(0).getStringCellValue();
		long c = (long) a.getRow(5).getCell(0).getNumericCellValue();
		
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(b);
		driver.findElement(By.name("pass")).sendKeys(""+c);
		driver.findElement(By.name("login")).click();
		
		
		
		

	}

}
