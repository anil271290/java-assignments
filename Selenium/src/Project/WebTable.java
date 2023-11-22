package Project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable {
	
	
	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        // Find the second table on the page
        WebElement table2 = driver.findElement(By.className("tsc_table_s13"));
        

        // Find all rows in the table
        java.util.List<WebElement> rows = table2.findElements(By.tagName("tr"));

        // Count the number of rows that have structure values
        int structureCount = 0;
        for (WebElement row : rows) {
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                if (cellText.equals("Structure")) {
                    structureCount++;
                   
                   
                }
              
            }
        }

        // Verify that there are only 4 structure values present in the table
        
        
      
       assert structureCount == 4;
       
        
        WebElement burjKhalifaRow = driver.findElement(By.xpath("//tr[contains(.,'Burj Khalifa')]"));
        String burjKhalifaHeight = burjKhalifaRow.findElement(By.xpath(".//td[3]")).getText();
        System.out.println(burjKhalifaHeight);

        // Verify that the height of Burj Khalifa is 829m
     //   assert burjKhalifaHeight.equals("829m");
        
        

        // Find the last row in the table
       
        WebElement lastRow=table2.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tfoot"));
        

        // Find all columns in the last row
        java.util.List<WebElement> columns = lastRow.findElements(By.tagName("td"));

        // Verify that there are only two columns in the last row
       assert columns.size() == 2;
       System.out.println(+columns.size());
       

      
      

        // Close the browser
        driver.quit();
    }


}
