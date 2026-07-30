package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		boolean linkid=driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).isEnabled();
		if(linkid=true) {
			driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		}
		
		Set<String> windowsIDs=driver.getWindowHandles();
		
		//Approch 1
		//List<String> windowList=new ArrayList(windowsIDs);
		
		//String parentID=windowList.get(0);
		//String childID=windowList.get(1);
		
		//switch to child window
		//driver.switchTo().window(childID);
		//System.out.println(driver.getTitle());
		
		//switch to parent window
		//driver.switchTo().window(parentID);
		//System.out.println(driver.getTitle());
		
		for(String winIds:windowsIDs) {
			
			String Title=driver.switchTo().window(winIds).getTitle();
			if(Title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}

		}
				
	}

}
