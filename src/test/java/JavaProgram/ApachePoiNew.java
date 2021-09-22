package JavaProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ApachePoiNew

{
  @Test
  public void f() throws IOException 
  
  {
	  
	   File src = new File("C:\\Users\\Administrator\\Desktop\\Xssfsheet.xlsx");
       
       FileInputStream fis = new FileInputStream(src);
      
       XSSFWorkbook wb = new XSSFWorkbook(fis);
      
       XSSFSheet sheet = wb.getSheet("Sheet1");
      
       System.out.println(sheet.getLastRowNum());
              
       System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
      
       System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
      
       System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
              
       sheet.getRow(5).createCell(2).setCellValue("FAIL");
      
       FileOutputStream fout = new FileOutputStream(src);
      
       wb.write(fout);
      
       wb.close();
      
   }
	  
  }

