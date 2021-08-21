package com.adidas.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetUtility {
	
	XSSFWorkbook workbook = null;
	XSSFSheet sheet = null;
	FileInputStream inFile = null;
	FileOutputStream outFile = null;
	String excelFilePath;

	public static void main(String[] args) {
		String testXls = "\\testdata\\basedata.xlsx";
		ExcelSheetUtility xls = new ExcelSheetUtility(testXls);
		xls.setCellData("page_loadtime", "page_loadtime Test", 5, 5); // 0,0
		System.out.println(xls.getCellData("page_loadtime", 5, 5));

	}

	public ExcelSheetUtility(String excelSheetPath) {
		try {
			excelFilePath = System.getProperty("user.dir") + excelSheetPath;
			inFile = new FileInputStream(new File(excelFilePath));

			// Get the workbook instance for XLS file
			workbook = new XSSFWorkbook(inFile);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void setCellData(String strSheetName, String strValue, int intRowNum, int intColNum) {
		try {
			// Get the sheet from the workbook
			sheet = workbook.getSheet(strSheetName);
			Cell cell = null;
			Row row = null;
			row = sheet.getRow(intRowNum);
			if (row == null) {
				sheet.createRow(intRowNum);
			}
			cell = sheet.getRow(intRowNum).getCell(intColNum);
			if (cell == null) {
				sheet.getRow(intRowNum).createCell(intColNum).setCellValue(strValue);
			} else if (sheet.getRow(intRowNum).getCell(intColNum) == null) {
				sheet.getRow(intRowNum).createCell(intColNum).setCellValue(strValue);
			} else if (cell.getCellTypeEnum() == CellType.STRING) {
				cell.setCellValue(strValue);

			} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
				cell.setCellValue(Double.valueOf(strValue));

			} else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {

				cell.setCellValue(Boolean.valueOf(strValue));
			} else if (cell.getCellTypeEnum() == CellType.BLANK) {
				cell.setBlank();

			}

			inFile.close();
			outFile = new FileOutputStream(new File(excelFilePath));
			workbook.write(outFile);
			outFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getCellData(String sheetName,  int intRow,int intCol) {
		String strCellValue = null;
		try {
			// Get the sheet from the workbook
			sheet = workbook.getSheet(sheetName);
			Cell cell = null;
			// Update the value of cell
			cell = sheet.getRow(intRow).getCell(intCol);
			// Update the value of cell

			if (cell.getCellTypeEnum() == CellType.STRING) {
				strCellValue = cell.getStringCellValue();

			} else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
				strCellValue = cell.getNumericCellValue() + "";

			} else if (cell.getCellTypeEnum() == CellType.BOOLEAN) {

				strCellValue = cell.getBooleanCellValue() + "";
			} else if (cell.getCellTypeEnum() == CellType._NONE) {
				strCellValue = "";

			} else if (cell.getCellTypeEnum() == CellType.BLANK) {
				strCellValue = "";

			} else {
				strCellValue = "";

			}

			inFile.close();
			return strCellValue;
		} catch (IOException e) {
			return strCellValue;
		}

	}

	public int getRowCount(String sheetName) {
		int intRowCount = 0;
		try {
			sheet = workbook.getSheet(sheetName);
			intRowCount = (sheet.getLastRowNum() - sheet.getFirstRowNum());
			return intRowCount;
		} catch (Exception e) {
			return intRowCount;
		}
	}

	public int getColCount(String sheetName) {
		int intColCount = 0;
		try {
			sheet = workbook.getSheet(sheetName);
			intColCount = (sheet.getRow(0).getLastCellNum() - sheet.getRow(0).getFirstCellNum());
			return intColCount;
		} catch (Exception e) {
			return intColCount;
		}
	}


}
