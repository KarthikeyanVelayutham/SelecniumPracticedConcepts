package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultiData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./datas/datas.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		
     	Sheet sheet = wb.getSheet("Sheet1");
     	
     	int row = sheet.getPhysicalNumberOfRows();
     	
     	int cell = sheet.getRow(0).getPhysicalNumberOfCells();
     	
     	for (int i = 1; i < row; i++) {
     		
     		for (int j = 0; j < cell; j++) {
				try {
					String value = sheet.getRow(1).getCell(0).getStringCellValue();
			     	System.out.println(value);
				} catch (Exception e) {
					
				}
			}
			
		}

	}

}
