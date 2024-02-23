package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		
		option2.click();
		option3.click();
		option1.click();
		Thread.sleep(1000);
		option2.click();

	}

}
