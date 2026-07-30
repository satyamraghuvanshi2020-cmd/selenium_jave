package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	//future Date Picker
	static void SelectFutureDate(WebDriver driver,String Year, String Month ,String Date) {
		
		
				while(true) 
				{
				String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
				String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //actual year
				
				if(currentmonth.equals(Month) && currentyear.equals(Year) ) 
				{
					
					break;
				}
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();//next button
				}
				
				//select the date
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement dt:alldates) {
					if(dt.getText().equals(Date)) {
						dt.click();
					}
				}
			}
		
	
	//Past Date Picker
	
	static void SelectPastDate(WebDriver driver, String Year , String Month , String Date) {
		
		
		while(true) 
		{
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();  //actual month
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  //actual year
		
		if(currentmonth.equals(Month) && currentyear.equals(Year) ) 
		{
			
			break;
		}
		
		driver.findElement(By.xpath("//span[text()='Prev']")).click();//previous button
		
		}
		//select the date
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:alldates) {
			if(dt.getText().equals(Date)) {
				dt.click();
			}
		}
	}
		



	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Switch to iframe
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		//Method 1: using sendkeys()
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("09/15/2025");
		
		//Method 2: Excepted data or Using Date Pickers
		String Year="2026";
		String Month="July";
		String Date="27";
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click(); //open date picker
		
		String presentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //present year
		
		if(Integer.parseInt(presentyear)<=Integer.parseInt(Year)) {
			SelectFutureDate(driver,Year,Month,Date);	
		}
		
		else if(Integer.parseInt(presentyear)>Integer.parseInt(Year)) {
			SelectPastDate(driver,Year,Month,Date);
		}
		else {
			System.out.println("The value is incorrect");
		}
	
		//SelectFutureDate(driver,Year,Month,Date);	
		//SelectPastDate(driver,Year,Month,Date);
	}
		
	}
	

