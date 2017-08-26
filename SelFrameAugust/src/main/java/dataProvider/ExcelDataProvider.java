package dataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import base.TestNGAnnotations;

public class ExcelDataProvider extends AbstractDataProvider{

	public static Object[][] getDataFromExcel(String fileName,String sheetName) throws IOException{
		//String data[][] = null;
	XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
	XSSFSheet sheet=wb.getSheet(sheetName);
	int rowCount = sheet.getLastRowNum();
	int columnCount = sheet.getRow(0).getLastCellNum();
	Object[][] data = new Object[rowCount][columnCount];
	XSSFRow row;
	for(int i=1; i <rowCount+1; i++){
		try {
			row = sheet.getRow(i);
			for(int j=0; j <columnCount; j++){
				try{
				XSSFCell cellValue;
				int cell_type = row.getCell(j).getCellType();
				if(cell_type == 0)
				{
					data[i-1][j]=row.getCell(j).getNumericCellValue();
				}
				else if(cell_type == 1){
					
					data[i-1][j]=row.getCell(j).getStringCellValue();
				}
				
				System.out.println(data[i-1][j]);
				}catch (Exception e) {
					e.printStackTrace();
			}
			}
			}catch (Exception e) {
					e.printStackTrace();
			}			
			}
return data;
	}
}
