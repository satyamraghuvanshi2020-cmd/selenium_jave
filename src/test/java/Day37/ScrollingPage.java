package Day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,1500)","");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		System.out.println(js.executeScript("return document.body.scrollHeight;"));
//		
		//2) Scroll down page by selecting element 
		
//		WebElement testelement=driver.findElement(By.xpath("//strong[text()='News']"));		
//		js.executeScript("arguments[0].scrollIntoView(true);", testelement);
//		js.executeScript("window.scrollBy(0,1500)","");		
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		
		//2 scroll up to down page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		//3 scroll back to intial postion
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	}

}
