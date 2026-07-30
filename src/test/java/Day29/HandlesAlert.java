package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal Alert with ok button
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//1) Method - only if you want to accept
		//driver.switchTo().alert().accept();
		
		//1.1) Method - if you want to accept the method
		//Alert myalert=driver.switchTo().alert();
		
		//Thread.sleep(5000);
		//System.out.println(myalert.getText());
		
		//Thread.sleep(5000);
		//myalert.accept();
		
		// 2) confirmation Alert with - ok and cancel
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); //close - Alert by ok button
		//Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();  //close - Alert by cancel button
		*/
		
		
		// 3) Prompt Alert - Input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert malert=driver.switchTo().alert();
		malert.sendKeys("Welcome");
		//malert.accept();  // close alert by ok. 
		malert.dismiss(); // close by dismiss.
		
		
		
	}

}
