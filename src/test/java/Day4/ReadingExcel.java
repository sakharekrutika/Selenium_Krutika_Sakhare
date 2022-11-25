package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel {
	
	@Test
	public void testData() {
//		File src= new File();
		
		try {
//			FileInputStream fis = new FileInputStream(src) ;
			
//			XSSFWorkbook wb=new XSSFWorkbook(fis);
//			
//			XSSFSheet sh1=wb.getSheet("sheet1 ");
//			
//			XSSFRow r1=sh1.getRow(0);
//			
//			XSSFCell c1=r1.getCell(0);
//			
//			String username=c1.getStringCellValue();
			
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\krusakha1\\Desktop\\New folder (2)\\SapientTestData.xlsx")));
			String username=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
			System.out.println(username);
			
			wb.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Please check data file path"+e.getMessage());
		}catch(IOException e) {
			System.out.println("Something went Wrong IO"+e.getMessage());
		}
	}

}
