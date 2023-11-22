package automationFramework;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Textbox_Tools {
public static void main(String[] args) throws InterruptedException {
		
        // Initialize ChromeDriver
		// Here we assume that the ChromeDriver path has been set in the System Global variables
       
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
        
        
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        //Create object of the Actions class
        Actions actions = new Actions(driver);
       
        
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        Thread.sleep(2000);
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        Thread.sleep(2000);
        
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        Thread.sleep(2000);
        
        
        // Select the Current Address
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
        // Copy the Current Address
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB).build().perform();
        
        //Paste the Address in the Permanent Address field
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
        
        //Compare Text of current Address and Permanent Address
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        Thread.sleep(2000);
        
        
        driver.close();
}
}
