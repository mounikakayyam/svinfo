package selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mapsmethod1 {

	public static void main(String[] args) {
		Method 3;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://petdiseasealerts.org/forecast-map");
       
        driver.switchTo().frame(0);
        //region
        
        String state = "california";
        WebElement ST=driver.findElement(By.id("state"));
        
        ST.click();
		
        }
        	

	

}

