package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		
		/*
		 * driver.switchTo.frame(name)
		 * driver.switchTo.frame(id)
		 * driver.switchTo.frame(WebWebElement)
		 * driver.switchTo.frame(index)
		 */
		/*
		 * 3 type of switch commands
		 * 1) browser windows
		 * driver.switchTo.window(windowID/window handle)
		 * 
		 * 2) alerts
		 * 
		 * 3) frame
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		//Frame1
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); //pass frame as a webelement //switch to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		//move to default frame
		driver.switchTo().defaultContent();
		
		//Frame2
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Satyam");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframe);
		
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;",rdbutton);
		
		driver.switchTo().defaultContent();
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		boolean logo=driver.findElement(By.xpath("//img[@class='responsive-img' and @src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
		if(logo=true) {
			System.out.println("Logo is displaying");
		}
		
	}

}
