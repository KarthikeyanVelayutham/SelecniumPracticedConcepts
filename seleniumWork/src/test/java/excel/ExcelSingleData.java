package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSingleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./datas/datas.xlsx");
		   Workbook wb = WorkbookFactory.create(fis);
		
	     	
	       String value = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	       System.out.println(value);

	}

}
