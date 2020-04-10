package com.jsp.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel
{
public static void main(String[] args) throws IOException 

{
	
XSSFWorkbook workbook = new XSSFWorkbook();
XSSFSheet sheet = workbook.createSheet("1st");

double d= Math.random();
for(int i=0;i<3;i++)
{
	Row row = sheet.createRow(i);
	for (int j=0;j<3;j++)
	{
		Cell cell = row.createCell(j);
		cell.setCellValue(d);
	}
}
File file = new File("C:\\Users\\vidyvenk\\Desktop\\Apache poi\\mysheet.xlsx");
FileOutputStream out = new FileOutputStream(file);
workbook.write(out);

out.close();
System.out.println("completed");



}
}
