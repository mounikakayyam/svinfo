package selinium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver","C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
	//mouse hovers
    driver.get("https://demo.opencart.com/index.php?route=account/login");
    WebElement Desktop=driver.findElement(By.xpath("//*[@id=\\\"narbar-menu\\\"]/ul/li[1]/a"));
    WebElement Mac=driver.findElement(By.xpath("//*[@id=\\\"narbar-menu\\\"]/ul/li[1]/div/div/ul/li[2]/a\""));
    Actions ACT=new Actions(driver);
	
	ACT.moveToElement(Desktop).moveToElement(Mac).click().perform();
	
    
    //Right click
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement Right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions ACT1=new Actions(driver);
	ACT1.contextClick(Right).perform();
	
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span")).click();
	driver.switchTo().alert().accept();
    //double click
    WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	ACT.doubleClick(Double).perform();
	driver.switchTo().alert().accept();
	driver.close();
	//drag and drop
	
	WebDriver driver1 =new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver1.get("https://demo.guru99.com/test/drag_drop.html");
	
	Actions ACT2=new Actions(driver1);
	WebElement From_Bank=driver1.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	
	WebElement To_Place1=driver1.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	
	ACT2.dragAndDrop(From_Bank, To_Place1).perform();
    
}
}
