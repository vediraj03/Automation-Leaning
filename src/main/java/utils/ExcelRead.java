package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static String[][] readExcelData(String excelFileName, String sheetName) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wBook = new XSSFWorkbook("./datas/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = wBook.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				 data[i-1][j] = cell.getStringCellValue();
				System.out.println(data[i-1][j]);
			}
			
		}
		wBook.close();
		return data;
		

	}

}
