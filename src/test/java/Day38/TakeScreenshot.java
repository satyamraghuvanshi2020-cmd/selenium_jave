package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//How to capture screenshots
//1) Full page
//2) Specific area of the page
//3) Web Element 

public class TakeScreenshot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//1) FullPage Screenshot
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//		File targetfile=new File(System.getProperty("user.dir")+"/Screenshot/fullpage.png");
//		sourcefile.renameTo(targetfile); //copy sourcefile to targetfile
//		
		//2) Sepecific Screeshot
//		WebElement specifiscreen=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		File sourcefile1=specifiscreen.getScreenshotAs(OutputType.FILE);
//		File targetfile1=new File(System.getProperty("user.dir")+"/Screenshot/fullpage1.png");
//		sourcefile1.renameTo(targetfile1);
//		
		//capture the screenshot of Webelement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile001=logo.getScreenshotAs(OutputType.FILE);
		File targetfile001=new File(System.getProperty("user.dir")+"/Screenshot/log001.png");
		sourcefile001.renameTo(targetfile001);
		
	}

}
