package Project;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Guru99_project {
	
		@Test

		public String[][] readExcel() throws Exception, IOException {
			String[][] data = null;

			String filepath = "C:\\Users\\ANIL PATEL\\Videos\\Tops technology\\Guru99.xlsx";
			File file = new File(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println("Total Rows : " + rows);
			data = new String[rows][];
			for (int i = 0; i < data.length; i++) {
				Row row = sheet.getRow(i);
				int cols = row.getPhysicalNumberOfCells();
				System.out.println("Total Cols : " + cols);
				data[i] = new String[cols];
				for (int j = 0; j < data[i].length; j++) {
					Cell cell = row.getCell(j);
					cell.setCellType(CellType.STRING);
					data[i][j] = cell.getStringCellValue();
				}
			}
			return data;
		}

		WebDriver driver = null;
		@Test
		public void test() throws Exception, Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
			String[][] data=readExcel();
			for(int i = 0;i<data.length;i++)
			{
			driver=new ChromeDriver();
			driver.get("https://www.demo.guru99.com/V4/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.name("uid")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(data[i][1]);
			Thread.sleep(2000);
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			if(url.equals("https://www.demo.guru99.com"))
			{
				System.out.println("Test Successfully");
				driver.findElement(By.name("uid")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("password")).click();
				Thread.sleep(2000);
			}
			else
			{
				System.out.println("Test Fail");
				TakesScreenshot ts= (TakesScreenshot)driver;
			File file= ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./screenshots/image1.jpeg"));
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(url, "https://www.demo.guru99.com");
			
			}
			
			driver.close();
			}
		}
	}


