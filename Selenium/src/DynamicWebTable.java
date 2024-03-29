import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ANIL PATEL\\Automation Library\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Number of Elements : "+cols.size());
		
		Thread.sleep(2000);
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("Number of Elements : "+rows.size());
		
		for(WebElement we:rows)
		{
			System.out.println(we.getText());
			Thread.sleep(200);
		}
	
		
		driver.close();	
			
		
	}
		
}
