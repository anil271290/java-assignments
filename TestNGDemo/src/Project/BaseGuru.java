package Project;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseGuru {
	
	public static WebDriver driver;
	public static String screenshotsSubFolderName;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
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

	@AfterMethod
	public void screenshotCapture(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
			
		}
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	public void captureScreenshot(String fileName) {
		if(screenshotsSubFolderName == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		    screenshotsSubFolderName = myDateObj.format(myFormatObj);
		}
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+ screenshotsSubFolderName+"/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
}


