package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
			//1). Implicit Wait
			/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
			 * Adv
			 * 1) single time one statement
			 * 2) it will not wait till maximum time if element is available
			 * 3) Applicable for all the elements
			 * 4) Easy to use
			 * 
			 * Disadvantage
			 * 1) if the time is not sufficient then you will getexception
			 * 
			 */
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.quit();
	}

}
