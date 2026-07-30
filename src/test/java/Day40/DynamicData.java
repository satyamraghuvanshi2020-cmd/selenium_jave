package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicData {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/TestData/myfile_Dynamic.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter columns number");
		int Rows=sc.nextInt();
		
		System.out.println("Enter rows number");
		int Columns=sc.nextInt();
		
		for(int r=0;r<=Rows;r++)
		{
			XSSFRow currentRows=sheet.createRow(r);
			for(int c=0;c<=Columns;c++) 
			{
				XSSFCell cell=currentRows.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
			workbook.write(file); //attach workbook to the file
			workbook.close();
			file.close();			
			System.out.println("File is created........");
			

	}

}
