package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// /html/body/header/div/div/div[3]/div/input  -- Absolute Xpath (full Xpath)
		// //*[@id="search"]/input    -- Relative Xpath (partial path
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo-opencart.com/");
		
		driver.manage().window().maximize();
		
		//single xpath
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("T-shirt");
		
		//multiple xpath
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Clothes");
		
		//And Operator -- > //input[@name='search' and @placeholder='Search']
		//Or Operotor  -->  //input[@name='search' or @placeholder='Search']
		
		//xpath with 'and' 'or' operator
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Iphone");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Google");

		//Xpath with Inner text()- //a[text()='Desktops']
		
		//boolean text=driver.findElement(By.xpath("//a[text()='Featured']")).isDisplayed();
		
		//System.out.println(text);
		
		//xpath with contains
		//driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("men");
		
		//xpath with starts-with()
		//driver.findElement(By.xpath("//*[starts-with(@name,'sea')]")).sendKeys("tshirt");
		
		//handling dynamic attributes
		
		//   //*[@id='Start' or @id='Stop']
		// //*[contains(@id,'st')]
		// //*[starts-with(@id,'st')]
		
		// name=xyz001   xyz002   xyz003  xyz004  xyz005 xyz006 xyz007		
		
		// //*[contains(@name,'xyz')]
		// //*[contains(@name,'00')]
		// //*[start-with(@name,'xyz')]
		
		//chained xpath
		
		//  //div[@class='image']/a/img
		
		//--------------------------------------
		//child xpath
		boolean img=driver.findElement(By.xpath("//div[@class='image']/a/img")).isDisplayed();
		System.out.println(img);
		
		// <div></div>
		
		// div[contains(text(),'')]
		// div[contains(.,'')]
	}

}
