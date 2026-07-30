package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleDropDown {

	public static void main(String[] args) {
		
		/*
		 * 1) Select DropDown
		 * 2) BootStrapDropdown
		 * 3) Hidden Dropdown
		 */
		// 1) Select DropDown
		// Select class
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdowncountry=driver.findElement(By.xpath("//select[@id='country' and @class='form-control']"));
		Select drpcountry=new Select(dropdowncountry);
		
		//three method to find drop down
		// 1) SelectByVisibleText()
		// 2) SelectByvalue();
		// 3) SelectByindex();
		
		drpcountry.selectByVisibleText("United Kingdom");
		drpcountry.selectByValue("germany");
		drpcountry.selectByIndex(5);
		
		//capture the option from dropdown
		
		List<WebElement> options=drpcountry.getOptions();
		System.out.println(options.size());
		
		//print the options
		//for(int i=0;i<options.size();i++) {
		//System.out.println(options.get(i).getText());
		//}
		
		for(WebElement ops:options) {
			System.out.println(ops.getText());
		}
		//bootstrap 
	
	}

}
