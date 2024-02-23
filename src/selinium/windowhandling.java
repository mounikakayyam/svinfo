package selinium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium"+Keys.ENTER);
		driver.findElement(By.linkText("Selenium")).click();//selenium wikipedia
        driver.findElement(By.linkText("Selenium in biology")).click();
        driver.findElement(By.linkText("Selenium (software)\"")).click();
        
        
        
        Set<String>wind=driver.getWindowHandles();
		
		
        for(String MOUNI:wind)
        	
        {
        	String Titles=driver.switchTo().window(MOUNI).getTitle();
        	
        	if(Titles.equals("Selenium in biology - Wikipedia"))  {
        		
        	driver.findElement(By.xpath("//*[@id=\"toc-Human_health\"]/a/div")).click();
        	}
        	if(Titles.equals("Selenium - Wikipedia")) {
        		driver.findElement(By.xpath("//*[@id=\"ca-talk\"]/a/span")).click();
       	}
        if(Titles.equals("Selenium (software) - Wikipedia")) {
        	driver.findElement(By.xpath("")).click();
        	
        }
        }
	}

}
