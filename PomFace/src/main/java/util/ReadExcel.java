package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static Sheet excelSheet;
	
	public static Object[][] dataprovider(String filePath, String sheetname) throws IOException {

	
		Object[][] tabArray;
		//String filePath = "data/TestI.xlsx";
		FileInputStream excelFileRead = new FileInputStream(filePath);
		Workbook excelWBook = new XSSFWorkbook(excelFileRead);
		excelSheet = excelWBook.getSheet(sheetname);

		int totalRows = excelSheet.getPhysicalNumberOfRows();
		int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();

		// t[row][col]
		// deduct one row because of header row
		tabArray = new Object[totalRows - 1][totalCols];

		for (int row = 1; row < totalRows; row++) {
			for (int col = 0; col < totalCols; col++) {
				// add row+1 to get data after header row
				tabArray[row - 1][col] = getCellData(row, col);
			}
		}
		return tabArray;

	}

	public static String getCellData(int row, int col) {
		Cell cell = excelSheet.getRow(row).getCell(col);
		String cellData="";
		if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			int i =(int)cell.getNumericCellValue();
			cellData= ""+i;
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_STRING){
		cellData = cell.getStringCellValue().trim(); 
		}
		
		return cellData;

	}


}
