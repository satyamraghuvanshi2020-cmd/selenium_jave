package Day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authenticaiton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait
		//https://username:Password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.manage().window().maximize();
		
	}

}
