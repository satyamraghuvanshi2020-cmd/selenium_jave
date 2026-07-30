package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//slider dragAndDropBy(Element, x, y)
public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");	
		driver.manage().window().maximize();
		
		WebElement min_button=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']"));
		
		System.out.println("Default location fro min location "+ min_button.getLocation()); //(59, 257) (x, y)
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_button, 100, 257).perform();
		
		System.out.println("After drap min price button "+ min_button.getLocation()); //(162, 257)
		
		WebElement max_button=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 100%;']"));
		System.out.println("Location of max_button"+max_button.getLocation()); //(665, 257)
		
		act.dragAndDropBy(max_button, -65, 257).perform();
		System.out.println("Location of max_button after relocate"+max_button.getLocation()); //(598, 257)
		
	
	
	}

}
