package Day37;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		//single file upload
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/satyam/Downloads//08-20-25 SE.xlsx");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("08-20-25 SE.xlsx")) 
//		{
//			System.out.println("File upload");
//		}
//		else
//		{
//		System.out.println("Upload Failed");	
//		}
//		
		//Multiple file upload
		String file1="/Users/satyam/Downloads//08-20-25 SE.xlsx";
		String file2="/Users/satyam/Downloads//Payroll Reports - 21 Aug 25 01_20.xlsx";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 +"\n"+ file2);	
		
		List<WebElement> filesname=driver.findElements(By.xpath("//ul[@id='fileList']//li"));
		if(filesname.get(0).equals("08-20-25_SE.xlsx") && filesname.get(1).equals("Payroll_Date_2025-08-10_to_2025-08-16_Records.xlsx")) 
		{
			System.out.println("File uploaded");
		}
		else 
		{
			System.out.println("Failed to uploaded");
		}
	}

}
