package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement element;

	public static String selectMethod(WebElement element, String a ) {
		Select sel = new Select(element);
		sel.selectByValue(a);
		return a;
	}

	public static void click(WebElement element) {
		element.click();
		
	}
	public static void delay() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static String readExcelData(int i ,int j)  {
		String value = null;
		try {
			File file = new File("E:\\PSK_Project\\Datasheet\\Registration data.xlsx");
			FileInputStream fi = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sheet = wb.getSheet("Registration");
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfCells = sheet.getRow(0).getLastCellNum();
			//		for( int i=0;i<noOfRows;i++) {
			//			for(int j=0;j<noOfCells;j++) {
			Cell cell = sheet.getRow(i).getCell(j);
			DataFormatter df = new DataFormatter();
			value = df.formatCellValue(cell);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static String sendKeysMethod(WebElement element,String x) {
		element.sendKeys(x);
		return x;
	}








	public static void main(String[] args) {

	}
}
