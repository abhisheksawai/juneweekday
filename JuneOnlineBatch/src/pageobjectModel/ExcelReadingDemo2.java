package pageobjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDemo2 {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\June Batch 19\\weekdayonline.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFSheet shh = wb.getSheet("sheet1");
		
		System.out.println("----------");
	    //System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
	  //  System.out.println("printing 0 row and 1 colum");
	   // System.out.println(sh.getRow(0).getCell(1).getStringCellValue());

		// i row hai
		// aur j col hai
	int lastrow=	sh.getLastRowNum();
	System.out.println(lastrow);
		
	    for(int i =0; i <=lastrow; i ++)
	    {
	    	for(int j=0 ;j <=1;j++)
	    	{
	    		System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
	    	}
	    }
	    
	}

}
