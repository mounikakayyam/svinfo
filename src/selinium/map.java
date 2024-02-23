package selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class map {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://petdiseasealerts.org/forecast-map");
        String state = "florida";
        driver.switchTo().frame(0);
        Thread.sleep(10000);
        String requiredString = "";
        for (int i = 1; i <= 51; i++) {
            WebElement resultedString = driver.findElement(By.xpath("//*[@id='region-" + i + "']"));
            requiredString = resultedString.getAttribute("name");
            if (requiredString.equalsIgnoreCase(state)) {
                System.out.println("Required state : "+requiredString);
                driver.findElement(By.xpath("//*[@id='region-" + i + "']")).click();
                break;
            }
        }
    }
}

  ANOTHER METHOD =2
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://petdiseasealerts.org/forecast-map");

driver.switchTo().frame(0);
String state = "california";

List<WebElement>AllStates=driver.findElements(By.xpath("//*[@class='region']"));

for(WebElement ST:AllStates)
{
	if(ST.getAttribute("id").equals(state))
		ST.click();







