package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		boolean linkid=driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).isEnabled();
		if(linkid=true) {
			driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		}
		else {
			System.out.println("Element not present");
		}
		
		Set<String> windowlist=driver.getWindowHandles();
		
		for(String winlist:windowlist) {
			
			String Title=driver.switchTo().window(winlist).getTitle();
			System.out.println(Title);
			
			if(Title.equals("OrangeHRM")) {
				driver.close();
				break;
			}
		}
	}

}

//https://testautomationpractice.blogspot.com/
/*
 * 1) Provide some string on this search box
 * 2) count number of links
 * 3) click on each link using loop.
 * 4) get windowIDs for every browser window.
 * 5) close specific browser window.
*/