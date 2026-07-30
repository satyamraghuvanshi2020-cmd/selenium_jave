package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver; 

/*
 * Test Case
 * 
 * 1) Launch Browser(chrome)
 * 2) Open URL Https://demo.opencart.com/
 * 3) Validate title should be "OpenCart"
 * 4) Close Browser
 */



public class FirstTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) Launch Browser(chrome)
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2) Open URL Https://demo.opencart.com/
		driver.get("https://demo.opencart.com.gr/");
		
		//3) Validate title should be "OpenCart"
		
		String act_title=driver.getTitle();
		
		if(act_title.equals("Your Store")){
			System.out.println("Test case is passed");
		}
		else {
			System.out.print("Test case is failed");
		}
		
		
		//4) Close Browser
		driver.close();
	}

}
