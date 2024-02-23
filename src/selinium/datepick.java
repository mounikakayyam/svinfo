package selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker");
		
		String date="22";
		String Month="December";
		String Year="2022";
		
		//WebElement Frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
	String MN=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	String YR=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			
			if(MN.equals(Month)&& YR.equals(Year)) {
				break;
			}	
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		
	List<WebElement> DS=driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//td"));	
		for(WebElement DT:DS) {
			if(DT.getText().equals(date)) {
			DT.click();
			}
		}


	}

}
