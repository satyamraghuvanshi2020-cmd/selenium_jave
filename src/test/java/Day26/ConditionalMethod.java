package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		WebElement LOGO=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(LOGO.isDisplayed());
		System.out.println(LOGO.isEnabled());
		System.out.println(LOGO.isSelected());
		*/
		//isEnabled
		boolean Status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display Status "+Status);
		
		//isSelected
		WebElement Male_id=driver.findElement(By.id("gender-male"));
		WebElement Female_id=driver.findElement(By.id("gender-female"));
		
		System.out.println("Before Radio Button Click ...............");
		System.out.println(Male_id.isSelected()); //False
		System.out.println(Female_id.isSelected()); //False
		
		System.out.println("After Radio Button Click ...............");
		Male_id.click();
		System.out.println(Male_id.isSelected()); //True
		System.out.println(Female_id.isSelected()); //False
		
		//browser methods
		//-----------------------------
		//close()-close single browser
		//quit()- close multiple browser
		
		
	}

}
