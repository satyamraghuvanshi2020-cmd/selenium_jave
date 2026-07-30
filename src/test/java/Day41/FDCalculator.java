package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"/TestData/Data_Principle.xlsx";
		
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		System.out.println(rows);
		
		for(int i=1;i<=5;i++) 
		{
			//read data from excel
			String Principle=ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String RateofInterest=ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String Period=ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String Per2=ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String Frequency=ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String MaturityValue=ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//pass above data into application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(RateofInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(Per2);
		
			Select Freq=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			Freq.selectByVisibleText(Frequency);
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]//img")).click(); //click on submit button
			
			
			
			//validation
			String act_value=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(act_value)==Double.parseDouble(MaturityValue)) 
			{
				
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed");
				ExcelUtils.fillGreenColor(filePath,"Sheet1",i, 7);
				
			}
			else 
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed");	
				ExcelUtils.fillRedColor(filePath, "Sheet1",i,7);
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]//img")).click(); //click on clear button
			
		} //ending of loop
		
		driver.quit();
	}

}
