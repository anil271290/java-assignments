package com.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenFW {
	@Test
	public String[][] readExcel() throws Exception, Exception {
		String[][] data = null;
		String filepath = "C:\\Users\\ANIL PATEL\\Videos\\Tops technology\\DataDriven.xlsx";
        FileInputStream file=new FileInputStream(new File(filepath));

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows= " + rows);
		data = new String[rows][];
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			int cols = row.getPhysicalNumberOfCells();
			System.out.println("Total Columns : " + cols);
			data[i] = new String[cols];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;

}

    WebDriver driver=null;

@Test
public void test() throws Exception, Exception
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
String[][] data=readExcel();
for(int i=0;i<data.length;i++)
{
driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.name("user-name")).sendKeys(data[i][0]);
Thread.sleep(2000);
driver.findElement(By.name("password")).sendKeys(data[i][1]);
Thread.sleep(2000);
driver.findElement(By.name("login-button")).click();
Thread.sleep(2000);
String url=driver.getCurrentUrl();
if(url.equals("https://www.saucedemo.com/inventory.html"))
{
	System.out.println("Test Successful");
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	Thread.sleep(4000);
	
}
else {
	System.out.println("Test Failed");
}
driver.close();}
}
}
