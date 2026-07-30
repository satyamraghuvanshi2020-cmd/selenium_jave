package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouse hover  -- moveToElement(element)
//right click  -- contextClick(element)
//double click -- doubleClick(element)
//drag and drop -- dragAndDrop(source , target)

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement Desktoplink=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Maclink=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);  //Actions pre-defined class provided in selenium
		
		//Mouse hover
		act.moveToElement(Desktoplink).moveToElement(Maclink).click().build().perform();
		//build()- create an action
		//perform()- complete an
		
		//act.moveToElement(Desktoplink).moveToElement(Maclink).click().perform();
		
		
	}

}
