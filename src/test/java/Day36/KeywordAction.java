package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywordAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://platform.text.com/tools/diff-checker");	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='text-editor_editor__pymkg' and @rows='1']")).sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		
		//Ctrl +A
		act.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).perform();
		
		//ctrl +C
		act.keyDown(Keys.COMMAND).sendKeys("C").keyUp(Keys.COMMAND).perform();
		
		//tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//ctrl V
		act.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.COMMAND).perform();
		
	}

}
