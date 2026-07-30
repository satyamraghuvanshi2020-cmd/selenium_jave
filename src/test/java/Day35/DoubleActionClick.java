package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleActionClick {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			WebElement Field1=driver.findElement(By.xpath("//input[@id='field1']"));
			WebElement Field2=driver.findElement(By.xpath("//input[@id='field2']"));
			WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
			
			//Clear Field1
			Field1.clear();
			//send text
			Field1.sendKeys("Satyam");
			//double click on button
			Actions actes=new Actions(driver);
			actes.doubleClick(button).perform();
			
			String text2=Field2.getText();
			System.out.println(text2);
			String text1=Field1.getText();
			System.out.println(text1);
			
			if(text2.equals(text1)) {
				System.out.println("QA passed");
			}
			
	}

}
