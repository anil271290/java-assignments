package Project;

import java.awt.Button;
import java.awt.event.MouseWheelEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Formfilling {

	
	

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		
		actions.keyDown(Keys.CONTROL).sendKeys("-").keyUp(Keys.CONTROL).build().perform();
			
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("anil.patel2790@gmail.com");
		Thread.sleep(1000);	
		
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9429239040");
		Thread.sleep(1000);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(500);
		Select month=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("December");
		Select year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, December 27th, 1990']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(1000);
	
		//WebElement upload=driver.findElement(By.id("uploadPicture"));
		WebElement upload=driver.findElement(By.xpath("//input[@id='uploadPicture']"));

		upload.sendKeys("C:\\Users\\ANIL PATEL\\Pictures\\Saved Pictures");
		Thread.sleep(2000);
		
		String s=new String();
		s="M-404,Shantipujya homes, Ahmedabad";
		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(s);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@id='state']")).click();
		
//		Select state=new Select(driver.findElement(By.xpath("//div[@id='state']")));
//		state.selectByValue("NCR");

		Screenshot screenshot = new AShot().takeScreenshot(driver);
		
		 Screenshot s1=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	        ImageIO.write(s1.getImage(),"PNG",new File("C:\\Users\\ANIL PATEL\\OneDrive\\Pictures\\fullPageScreenshot.png"));
	        
		
	driver.findElement(By.id("submit")).click();
	
		driver.close();
	
		
		
		
		
	}
	
}
