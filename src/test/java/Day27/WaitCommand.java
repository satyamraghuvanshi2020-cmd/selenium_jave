package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitCommand {

	public static void main(String[] args) throws InterruptedException {
		//Wait Command
		//Two type of wait command
		//1). Implicit Wait
		//2). Explicit Wait/fluent wait
		
		/*
		 * NoSuchElementException - Element is not present on the page. Synchroization.
		 * ElementNotfoundException - Location is incorrect
		 * 
		 */
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000); //pause the execution
		//sleep()
		//Advantage
		//1) Easy to use
		
		//Disadvantage
		//1) If time is not sufficient then you will get the exeception
		//2) It will wait for maximum time out. this will reduce the performance script.
		//3) Mutiple time
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
	}

}
