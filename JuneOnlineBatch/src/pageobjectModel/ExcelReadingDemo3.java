package pageobjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo3 {

	public static void main(String[] args) throws Exception {				
		File src = new File("C:\\Users\\lenovo\\Desktop\\June Batch 19\\weekdayonline.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFSheet shh = wb.getSheet("sheet1");
		
	int lastrowkumar=	sh.getLastRowNum();
	sh.getLastRowNum();
	
	int lastcol = sh.getRow(12).getLastCellNum();
	System.out.println("last col of excel");
	System.out.println(lastcol);
	
	System.out.println("last row of excel");
	System.out.println(lastrowkumar);		
	
	
//	    for(int i =0; i <=lastrowkumar; i ++)
//	    {
//	  	    		System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
//	     }
	    
	}

}
