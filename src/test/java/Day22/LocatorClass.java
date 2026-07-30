package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("newsletter")).sendKeys("satyam@sequifi.com");
		
		//id
		//boolean logodisplay=driver.findElement(By.id("navbar-collapse-header")).isDisplayed();
		//System.out.println(logodisplay);
		
		//linkText and PartiallinkText
		//driver.findElement(By.linkText("Features")).click();
		//driver.findElement(By.partialLinkText("Featu")).click();
		
		//classname elements
		//List<WebElement> Header=driver.findElements(By.className("list-inline"));
		//System.out.println(Header.size());
		
		//tagname
		
		List<WebElement> linkslist=driver.findElements(By.tagName("div"));
		System.out.println(linkslist.size());
		
		List<WebElement> Imagelist=driver.findElements(By.tagName("img"));
		System.out.println(Imagelist.size());
		
	}

}
