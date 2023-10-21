package com.Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.orangehrmlive.base.BaceClass;



public class ExcelUtilities extends BaceClass {
	
	public Sheet read_Excel(String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Santosh\\eclipse-workspace\\Assignment1\\test-data\\Book1.xlsx");
		
		Sheet sh=WorkbookFactory.create(fis).getSheet(sheetName);
		
		return sh;
	}
	
	public Object getSingleStringData(int rowNum ,int cellNum,Sheet sh)
	{
		if(sh.getRow(rowNum).getCell(cellNum).getCellType().toString().equalsIgnoreCase("String"))
			
		return sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		else
			return sh.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
			
	}
	
	public Map<String, Object> getAllEcelData(Sheet sh)
	{
		Map<String,Object> map=new HashMap<String,Object>();
	   for(int i=0;i<=sh.getLastRowNum();i++) {
		   int cellNum=sh.getRow(i).getFirstCellNum();
		   for(int j=0;j<cellNum;j++){
			 
		  String key = sh.getRow(i).getCell(j).getStringCellValue();
		  String value=sh.getRow(i).getCell(++j).getStringCellValue();
		  
		  map.put(key, value);
		   }
	   }
	   for(Map.Entry<String , Object> hm: map.entrySet()){
		   System.out.println(hm.getKey()+" -- "+hm.getValue());
		   
	   }
	   
	  return map;
	   
	}
}
	
	

