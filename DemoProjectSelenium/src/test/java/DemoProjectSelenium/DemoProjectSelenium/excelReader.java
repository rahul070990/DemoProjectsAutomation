package DemoProjectSelenium.DemoProjectSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {
	static String SheetPath="C:\\Users\\rahul-shar\\Documents\\SeleniumCourse\\Automation\\fileRead\\excelData.xlsx";
	static String SheetName="Sheet1"; 
	FileInputStream fis;
	static XSSFWorkbook wb;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//uncomment line no.24 to run getCellData
		//getCellData(SheetPath,SheetName,1,1);
		
		getAllCellData(SheetPath,SheetName);
	}
	
	
	public static void getCellData(String SPath, String SheetName, int row, int col) throws IOException {
		String cellValue;
		FileInputStream fis=new FileInputStream(SPath);
		wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet(SheetName);		
		cellValue=sheet.getRow(row).getCell(col).getStringCellValue();
		
		
		System.out.println(cellValue);
		
		
	}
	
	public static void getAllCellData(String SPath, String SheetName) throws IOException {
		
		Cell cell=null;
		FileInputStream fis=new FileInputStream(SPath);
		wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet(SheetName);
		
		Iterator<Row> row_iterator= sheet.rowIterator();
		while(row_iterator.hasNext()) {
			Row row=row_iterator.next();
			
			Iterator<Cell> cell_iterator= row.cellIterator();
			while(cell_iterator.hasNext()) {
				cell= cell_iterator.next();
				CellType type= cell.getCellType();
				
				if(type==CellType.STRING) {
					 
					  System.out.println(cell.getStringCellValue());
					
				}
				else if(type==CellType.NUMERIC) {
					
					System.out.println(cell.getNumericCellValue());
					
				}
				
				else if(type==CellType.BOOLEAN) {
					
					System.out.println(cell.getBooleanCellValue());
					
				}
				else if(type==CellType.BLANK) {
					
					System.out.println("Cell is blank");;
					
				}
				
			}
		}
		
		 
	}
	
	
}
