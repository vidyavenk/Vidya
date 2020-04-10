package com.jsp.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	File file = new File("C:\\Users\\vidyvenk\\Desktop\\Apache poi\\mysheet.xlsx");
	FileInputStream fi = new FileInputStream(file);
	
	
	Workbook workbook = WorkbookFactory.create(fi);
	
	Sheet sheet = workbook.getSheetAt(0);
	
	
	
	
	for(int i=0;i<2;i++)
	{Row row = sheet.getRow(i);
		for(int j=0;j<2;j++)
		{
			Cell cell = row.getCell(j);
			System.out.println(cell.getNumericCellValue());
		}
		System.out.println();
	}
fi.close();	
	
	
}
}
