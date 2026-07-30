package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/TestData/myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("Book");
			row1.createCell(1).setCellValue("Name");
			row1.createCell(2).setCellValue("Amount");
			row1.createCell(3).setCellValue("Location");
			
			XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("Java");
			row2.createCell(1).setCellValue("Automation");
			row2.createCell(2).setCellValue("300");
			row2.createCell(3).setCellValue("A");	
			
			XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("Python");
			row3.createCell(1).setCellValue("Automation");
			row3.createCell(2).setCellValue("30");
			row3.createCell(3).setCellValue("B");
			
			
			XSSFRow row4=sheet.createRow(4);
			row4.createCell(0).setCellValue("C##");
			row4.createCell(1).setCellValue("Automation");
			row4.createCell(2).setCellValue("10");
			row4.createCell(3).setCellValue("D");
			
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("File is created........");
			
	}

}
