package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/TestData/Test Data.xlsx");
		//FileInputStream file=new FileInputStream("/Users/satyam/eclipse-workspace/SeliniumProject/TestData/Test Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //workbook.getSheetAt(0);
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcoums=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows"+totalrows); //5
		System.out.println("Total number of columns"+totalcoums); //4
		
		for(int c=0;c<=totalrows;c++) 
		{
			XSSFRow currentrow=sheet.getRow(c);
			
			for(int r=0;r<totalcoums;r++) 
			{
			
				XSSFCell currentcell=currentrow.getCell(r);
				System.out.print(currentcell.toString()+"\t");
			}		
			System.out.println();
	
				
		}
		
		workbook.close();
		file.close();
	
	}

}
