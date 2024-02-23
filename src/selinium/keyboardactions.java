package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.name("text1")).sendKeys("i love my dad");
		
		Actions ACT= new Actions(driver);
		ACT.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ACT.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		ACT.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		ACT.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


	}

}
