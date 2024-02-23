package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("\"https://demo.automationtesting.in/Alerts.html\"");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\\\"OKTab\\\"]/button")).click(); //new customer
		Alert AT=driver.switchTo().alert();
		Thread.sleep(1000);
		AT.accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();   //new customer
		driver.findElement(By.xpath("//*[@id=\\\"CancelTab\\\"]/button")).click();
		Thread.sleep(1000);
		AT.dismiss();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\\\"Textbox\\\"]/button")).click();
		Thread.sleep(1000);
		AT.sendKeys("mouni");
		AT.accept();
		
	
		
		
		
	}

}
