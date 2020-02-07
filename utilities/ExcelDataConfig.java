package com.clinicianPortal.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelpath) throws Exception {
		FileInputStream fs = new FileInputStream(excelpath);
		wb = new XSSFWorkbook(fs);
		
		// sheet1 = wb.getSheetAt(0);
		// this is modified
	}

	public int getData(int sheetnumber, int row, int column) {
		sheet1 = wb.getSheetAt(0);
		int data = (int) sheet1.getRow(row).getCell(column).getNumericCellValue();
		return data;
	}

	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row + 1;
		return row;
	}

	public int getColCount(int sheetIndex) {
		sheet1 = wb.getSheetAt(sheetIndex);
		int col = sheet1.getRow(0).getLastCellNum();
		return col;
	}

}
