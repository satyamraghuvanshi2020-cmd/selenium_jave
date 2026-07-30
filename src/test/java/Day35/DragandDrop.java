package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement source_code=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target_code=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//drag and drop2
		Actions acteis=new Actions(driver);
		acteis.dragAndDrop(source_code, target_code).perform();
	}

}
