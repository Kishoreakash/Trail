package org.meta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelCreation {
	public static void main(String[] args) throws IOException {
		
		File file=new  File("C:\\Users\\pre\\OneDrive\\Desktop\\AkashMaven\\FacebookLogin\\Excel\\akash.xlsx");
		Workbook workbook= new XSSFWorkbook();
	org.apache.poi.ss.usermodel.Sheet createSheet = workbook.createSheet("text");		
		
	FileOutputStream stream =new FileOutputStream(file);
	workbook.write(stream);
	
	
	
	
			}

}
