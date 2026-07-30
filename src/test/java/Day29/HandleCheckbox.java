package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) select specific checkbox
		/*boolean checkbox=driver.findElement(By.xpath("//input[@id='sunday']")).isEnabled();
		if(checkbox=true) {
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		}
		*/
		
		//2) select multiple checkbox
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		
		*/
		//for(WebElement checkboxs:checkbox) {
			//checkboxs.click();
		//}
		
		// 3) select last 3 checkboxes
		
		/*
		 * total number of checkboxes - how many checkboxes you want to select= stating index 
		 * e.g:- 7-3=4 (starting index)
		 */
		
		/*for(int i=4;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}*/
		
		// 4) select starting 3 checkbox
		/*for(int i=0;i<3;i++) {
			checkbox.get(i).click();
		}
		*/
		//unselect checkboxes if they are selected
		
		for(int i=0;i<3;i++) {
			checkbox.get(i).click();
		}
		Thread.sleep(5000);
		
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isSelected()) {
				checkbox.get(i).click();
			}
		}
	}

}
