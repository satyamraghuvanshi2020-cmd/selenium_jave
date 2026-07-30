package Day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	
	    // User-defined method to convert month String to Month object
	    public static Month convertMonth(String month) {
	        HashMap<String, Month> monthMap = new HashMap<>();

	        monthMap.put("January", Month.JANUARY);
	        monthMap.put("February", Month.FEBRUARY);
	        monthMap.put("March", Month.MARCH);
	        monthMap.put("April", Month.APRIL);
	        monthMap.put("May", Month.MAY);
	        monthMap.put("June", Month.JUNE);
	        monthMap.put("July", Month.JULY);
	        monthMap.put("August", Month.AUGUST);
	        monthMap.put("September", Month.SEPTEMBER);
	        monthMap.put("October", Month.OCTOBER);
	        monthMap.put("November", Month.NOVEMBER);
	        monthMap.put("December", Month.DECEMBER);

	        // Get value from map
	        Month vmonth = monthMap.get(month);

	        if (vmonth == null) {
	            System.out.println("Invalid Month...");
	        }

	        return vmonth;
	    }

	public static void datepicker(WebDriver driver,String Date) {
		List<WebElement> alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldate) {
			if(dt.getText().equals(Date)) {
				dt.click();
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input DOB
		String requiredYear="2015";
		String requiredMonth="July";
		String requiredDay="27";
		
		driver.findElement(By.id("datepicker")).click();
		
		//Select year
//		WebElement yeardropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
//		Select selectyear=new Select(yeardropdown);
//		selectyear.selectByVisibleText(requiredYear);
//		
		while(true) {
		//select month
		String displayMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert requiredMonth and displayMonth  in to Month objects
		Month exceptedMonth=convertMonth(requiredMonth);
		Month currentMonth=convertMonth(displayMonth);
		
		//compare
		int result=exceptedMonth.compareTo(currentMonth);
		
		//0
		
		if(result>0) {
		//>0
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		else if(result<0) {
		//<0
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		else {
			
			break;
		}
		
		}
		
		datepicker(driver,requiredDay);
	}

}
