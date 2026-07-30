package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true); //accepts SSL Certificate
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com/"); 
		
		System.out.println("Title of the page= "+driver.getTitle()); //privacy error
																	//expired.badssl.com

		
	}
}
