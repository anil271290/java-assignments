package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edit_Delet {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		
		 driver.findElement(By.id("edit-record-1")).click();
		 Thread.sleep(1000);
		 
	     driver.findElement(By.xpath("//input[@value='10000']")).click();
		 
		 actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 driver.findElement(By.xpath("//input[@value='10000']")).sendKeys("20000");
		 driver.findElement(By.id("submit")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[@id='delete-record-2']")).click();
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anil");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patel");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anil271290@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='age']")).sendKeys("33");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("900000");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='department']")).sendKeys("IT");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@id='submit']")).click();
		 Thread.sleep(1000);
		 
		 driver.close();
		 

		
		 
		 
		 
		
	}

}
