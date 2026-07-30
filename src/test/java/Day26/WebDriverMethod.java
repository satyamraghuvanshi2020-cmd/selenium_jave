package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * 1) get methods
		 * 2) conditional methods
		 * 3) browser methods
		 * 4) navigational methods
		 * 5) wait methods
		 * 
		 * get methods - we can access these methods through webdriver instance
		 * 
		 * get(url) -- open the url on the browser
		 * getTitle() -- return the title of the page
		 * getCurrentUrl() -- return the Url of the page
		 * getPageSource() -- return the source code of the page.
		 * getWindowHandle() -- return the ID of the single Browser window
		 * getWindowsHandles() -- return Id's of multiple Browser window
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		// 1) get methods
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// 2) getTitle()
		System.out.println(driver.getTitle());
		
		//  3) getCurrentUrl()
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		// 4) getPageSource()
		
		//System.out.println(driver.getPageSource());
		
		// 5) getWindowHandle()
		
		//System.out.println(driver.getWindowHandle()); //1170C6B07FB492C5BE9121C2620EB410
		
		// 6) getWindowsHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowsid= driver.getWindowHandles();
		System.out.println(windowsid);
		
		//conditional methods - access these commands through WebElement
		// return boolean value
		
		//isDisplayed()
		//isEnabled()
		//isSelected()
		
	}

}
