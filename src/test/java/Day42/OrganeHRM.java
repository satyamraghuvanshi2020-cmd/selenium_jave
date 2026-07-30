package Day42;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 1)open application
 2)test logo presence
 3)login
 4)close
 */
public class OrganeHRM 
{
	WebDriver driver;
	@Test(priority=1)
	void OpenApp() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void Logopresence() throws InterruptedException 
	{
		//Thread.sleep(3000);
		boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println(logo);
	}
	
	@Test(priority=3)
	void login() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test(priority=4)
	void logout() 
	{
		driver.quit();
	}
	
}
