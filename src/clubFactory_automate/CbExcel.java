package clubFactory_automate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CbExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a, i=0;
		
		for(a=0; a<=10; a++) {
			
			
        File src= new File("G:\\cb\\cbdata.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0); 
		
		sheet1.getRow(i).createCell(0).setCellValue("gmagffilcv");
		
		sheet1.getRow(i).createCell(1).setCellValue("Mahipal5167");
		
		FileOutputStream fos = new FileOutputStream(src);
		
		wb.write(fos);
		
		i++;
		
		wb.close();
		}
	}

}
