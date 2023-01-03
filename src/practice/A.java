package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A { 
public static void main(String[] args) throws InterruptedException { 
System.setProperty("webdriver.chrome.driver", "C:/Users/dell/DNYANESHWAR/Desktop/software/NEW/chromedriver.exe"); 
 WebDriver driver = new ChromeDriver(); 
 driver.get("hp://localhost:8080/login.do"); 
  driver.findElement(By.id("username")).sendKeys("admin"); 
driver.findElement(By.name("pwd")).sendKeys("manager"); 
driver.findElement(By.xpath("//div[.='Login ']")).click(); 
Thread.sleep(3000); 
String expectedTitle = "Enter Time"; 
String actualTitle = driver.getTitle(); 
//If actual tle contains "Enter Time" text then home page is displayed. 
if (actualTitle.contains(expectedTitle)) { 
System.out.println("Home page is displayed"); 
} else{ 
System.out.println("Home page is NOT displayed"); 
} 
} 
} 
