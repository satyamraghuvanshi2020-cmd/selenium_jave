package Day23;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id  or #id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iphone");
		
		//tag class  tag.classname .classname
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		//tag attribute  input[attribute]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("clothes");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("clothes");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("phone");
		
	}

}
