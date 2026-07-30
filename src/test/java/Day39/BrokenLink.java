package Day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		//capture all the link from Website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+links.size());
		int noofbrokenlink=0;
		
		for(WebElement linkElement:links)
		{
			String hrefValue=linkElement.getAttribute("href");
			
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("Href value has no value . so not  possible to check");
				continue;
			}
			
			//hit url to the server
			
			try
			{
				URL linkURL=new URL(hrefValue); //convert href value from string to URL format
				HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); //open connection to the server
				conn.connect(); //connect to server and send request the server
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefValue+"=======> Broken link");
					noofbrokenlink++;
				}
				
				else 
				{
					System.out.println(hrefValue+"======> Not a broken link");
				}
				}	
			
			catch(Exception e)
			
			{
				
			}
		}
		System.out.println("Number of broken link "+noofbrokenlink);
	}

}
