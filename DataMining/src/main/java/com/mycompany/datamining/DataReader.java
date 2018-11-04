/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datamining;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ali Mohamed
 */
public class DataReader {

    public DataReader() {
          try { Class.forName("org.apache.poi.UnsupportedFileFormatException"); }
        catch (ClassNotFoundException e){}
        
    }
    
 
    public  ArrayList<Element> readXLSXFile() throws IOException
	{
		InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\Ali Mohamed\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		
		XSSFWorkbook test = new XSSFWorkbook(); 
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();
                ArrayList<Element> elements= new ArrayList<Element>();

		while (rows.hasNext())
		{
			row=(XSSFRow) rows.next();
                        ArrayList<String> data = new ArrayList<String>();
                        data.add(row.getCell(1).getStringCellValue());
                        data.add(row.getCell(2).getStringCellValue());
                        data.add(row.getCell(3).getStringCellValue());
                        int id =(int)row.getCell(0).getNumericCellValue();
                        Element temp= new Element(id, data);
                        elements.add(temp);
		}
	return elements;
	}
}
