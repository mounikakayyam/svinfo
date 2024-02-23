package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//By index starts with zero //By visible text  //By value
public class dropdown{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		WebElement titleDD= driver.findElement(By.xpath("//*[@id=\"user_title\"]"));
		WebElement Year=driver.findElement(By.name("year"));
		
		Select Title=new Select(titleDD);
		//Title.selectByIndex(5);
		//Title.selectByValue("Doctor");
		Title.selectByVisibleText("Duke");
		
		
		
		
		
		
		
		
		
		
	}
}