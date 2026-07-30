package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10)); //Duration
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement Username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		Username.sendKeys("Admin");
		WebElement Passwords=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		Passwords.sendKeys("admin123");
		WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
		
		loginbutton.click();
		/*
		 * 1) Conditional based, it will work more effectively.
		 * 2) finding element is inclusive(for some condition).
		 * 3) it will for condition to be true, then consider the time.
		 * 4) we need to write multiple statements for multiple elements.
		 */
		
	}

}
