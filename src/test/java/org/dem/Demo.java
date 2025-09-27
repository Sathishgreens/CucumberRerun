package org.dem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Lenovo\\eclipse-workspace\\CucumberRerun\\src\\test\\resources\\Excel Files\\Data.xlsx"));
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Login Data");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
	}

}
