package Day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws MalformedURLException {
		
		//navigate().to(url)
		//navigate().back()
		//navigate().forward()
		//navigate().refresh()
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo-opencart.com/"); //accepts URL only in the String Format.
		
		//driver.navigate().to("https://demo-opencart.com/");
		//URL myurl=new URL("https://demo-opencart.com/");
		//driver.navigate().to(myurl);    //accept URl in string format and object Format.
		
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://demo-opencart.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(" Back to URL "+driver.getCurrentUrl()); //https://demo-opencart.com/
		
		driver.navigate().forward();
		System.out.println(" Forward to URL " + driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.navigate().refresh();
		
	}

}
