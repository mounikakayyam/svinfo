package oops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
ChromeOptions co=new ChromeOptions();
System.setProperty("webdriver.chromedriver","C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		
WebDriver driver=new ChromeDriver(co);
driver.get("https://demo.guru99.com/v4");
driver.findElement(By.name("uid")).sendKeys("mngr549057");
driver.findElement(By.name("password")).sendKeys("AtUjAje");
driver.findElement(By.name("btnLogin")).click();

	
		
		
		
	}

}
