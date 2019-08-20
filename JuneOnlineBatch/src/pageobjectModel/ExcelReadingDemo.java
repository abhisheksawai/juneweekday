package pageobjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\June Batch 19\\weekdayonline.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFSheet shh = wb.getSheet("sheet1");
		
		System.out.println("printing 0 row and 0 colum");
	    System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
	    System.out.println("printing 0 row and 1 colum");
	    System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
	    System.out.println("printing shh 0 row and 0 colum");
	    System.out.println(shh.getRow(0).getCell(0).getStringCellValue());
		
	    System.out.println("printing shh 0 row and 1 colum");
	    System.out.println(shh.getRow(0).getCell(1).getStringCellValue());
	}

}
