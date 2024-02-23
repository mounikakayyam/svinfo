package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.htm");
		List<WebElement>CHK=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<3;i+=2)
		{
			CHK.get(i).click();
		}
		
			
		

	}

}
