package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenthelinkinNewtab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");	
		driver.manage().window().maximize();
		
		WebElement Register=driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.COMMAND).click(Register).keyUp(Keys.COMMAND).perform();
		
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Satyam");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Raghuvanshi");
		
		driver.switchTo().window(ids.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirt");
		
		
	}

}
