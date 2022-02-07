package org.meta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ReadExcelSheet {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\pre\\OneDrive\\Desktop\\AkashMaven\\FacebookLogin\\Excel\\Akash.xlsx");
	
		FileInputStream stream = new FileInputStream(file);
	
	Workbook worbook= new XSSFWorkbook(stream);
	
	Sheet sheet = worbook.getSheet("Sheet1");
	
	Row row = sheet.getRow(1);
	
	Cell cell = row.getCell(0);
	
	
	System.out.println(cell);
	
	
	
		
	}
	
	
}

	


