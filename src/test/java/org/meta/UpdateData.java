package org.meta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateData {
	
	public void updateExcel(int rowNo, int cellNo, String oldData,String newData) throws Exception {
		
		File file= new File("C:\\Users\\pre\\OneDrive\\Desktop\\AkashMaven\\FacebookLogin\\Excel\\Akash.xlsx");
		
		FileInputStream stream= new FileInputStream(file);
		
		Workbook workbook= new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		
		String cellValue = cell.getStringCellValue();
		
		if(cellValue.equals(oldData)) {
			cell.setCellValue(newData);
	}else {
		System.out.println("valid data");
	}
		FileOutputStream out= new FileOutputStream(file);
		workbook.write(out);
	}

public static void main(String[] args) throws Exception {
	UpdateData obj1 = new UpdateData();
	obj1.updateExcel(0, 0, "mango", "Fullname");
}
}




		

