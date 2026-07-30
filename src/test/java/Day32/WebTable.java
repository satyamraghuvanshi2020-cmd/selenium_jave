package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Web Table
		 * 
		 * 1. Static Web Table
		 * 2. Dynamic web Table
		 * 3. table with pagnation 
		 *
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) find total number of row in a table
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
		System.out.println("Number of rows"+ rows.size());
		
		//find total number of columns
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th"));
		System.out.println("Number of columns"+ columns.size());
		
		//Read data from specific row and columns (ex:- 4th row and 1st colums)
		WebElement bookdata=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[1]"));
		System.out.println(bookdata.getText());
		
		//read the all data from rows and columns
		Thread.sleep(5000);
		
		for(int r=2;r<rows.size();r++) {
			for(int c=1;c<columns.size();c++) {
				
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		//print book name using author
			
		for(r=2;r<rows.size();r++) {
			String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(Author.equals("Mukesh")) {
				String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println("Book Name "+ Bookname);
			}
		}
		
		}
		//total price of all price
		int total=0;
		for(int r=2;r<rows.size();r++) {
			String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(Price);
			
			System.out.println(total);
			
		}
	
	}

}
