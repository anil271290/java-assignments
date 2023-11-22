package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Guru99_project2 extends BaseGuru{			
	
	
		@Test
		public void test() throws Exception, Exception
		{
			String actualUrl = driver.getCurrentUrl();

			String[][] data=readExcel();
			for(int i = 0;i<data.length;i++)
			{
			driver.get("https://www.demo.guru99.com/V4/");
			driver.findElement(By.name("uid")).sendKeys(data[i][0]);
			driver.findElement(By.name("password")).sendKeys(data[i][1]);
			driver.findElement(By.name("btnLogin")).click();
			
			SoftAssert softassert=new SoftAssert();
			String expectedUrl = "https://www.demo.guru99.com/v5";
			softassert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");
			
			}
			System.out.println(actualUrl);

			
		}
	}


