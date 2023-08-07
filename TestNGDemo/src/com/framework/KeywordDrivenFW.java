package com.framework;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDrivenFW
{
	@DataProvider(name = "Anil")
	public Object[][] readExcel() throws Exception, Exception {
		Object[][] data = null;
		String filepath = "C:\\Users\\ANIL PATEL\\Videos\\Tops technology\\DataDriven.xlsx";
		File file = new File(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet2");
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows= " + rows);
		data = new Object[rows][];
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.getRow(i);
			int cols = row.getPhysicalNumberOfCells();
			System.out.println("Total Columns : " + cols);
			data[i] = new Object[cols];
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;

}

    WebDriver driver=null;

@Test(dataProvider = "Anil")
public void test(String keyword) throws Exception, Exception
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
	
	
	if(keyword.equals("open browser"))
	{
		driver=new ChromeDriver();
		Thread.sleep(2000);
	}
	else if (keyword.equals("enter url")) {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	else if (keyword.equals("enter username")) {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	else if (keyword.equals("enter password")) {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	else if (keyword.equals("click login")) {
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	}
else if (keyword.equals("close browser")) {
		driver.close();
	}
}
}
	
	
	
