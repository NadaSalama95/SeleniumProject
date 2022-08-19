package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public FileInputStream fis ;
	
	public FileInputStream getFileInputStream()
	{
		String filepath = System.getProperty("user.dir")+"/src/test/java/TestData/LoginTestData.xlsx";
		File srcFile= new File(filepath);
		try {
			fis=new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
		return fis;
	}
	public Object [][] getExcelData() throws IOException
	{
		fis= getFileInputStream();
		
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet= wb.getSheet("sheet1");
		int TotalNumberOfRows= sheet.getLastRowNum()+1;
		int TotalNumberOfcol=2;
		
		String[][] arrayExcelData=new String[TotalNumberOfRows][TotalNumberOfcol];
		
		for (int i = 0; i < TotalNumberOfRows; i++) {
			for (int j = 0; j < TotalNumberOfcol; j++) {
				XSSFRow row=sheet.getRow(i);
				arrayExcelData[i][j]=row.getCell(j).toString();
			}
			
		}
		wb.close();
		return arrayExcelData;
		
	}
	
	
	
	
	

}
