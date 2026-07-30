package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessage {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://demo.nopcommerce.com//");
		
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store")){
			System.out.println("Test case is passed");
		}
		else {
			System.out.print("Test case is failed");
		}
		
		driver.close();

	}

}
