package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		driver.get("https://www.bjs.com/");
		
		
		
		driver.findElement(By.xpath("//div[@class='search-input-group']//input")).sendKeys("water");
		
		
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='col-6 col-md-4']//div"));
		System.out.println(list.size());
		for(int i=0; i<list.size();i++) {
			list.get(i).getText();
			
			if (list.get(i).getText().equals("spring water")) {
				list.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
