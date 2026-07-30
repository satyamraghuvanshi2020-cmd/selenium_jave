package Day36;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		System.out.println(ids);
		
		driver.switchTo().window(ids.get(0));
		
		Thread.sleep(2000);
		driver.switchTo().window(ids.get(1));
		
		
		
	}

}
