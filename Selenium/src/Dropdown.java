import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ANIL PATEL\\Automation Library\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		
		country.selectByValue("ITALY");
		Thread.sleep(2000);
		driver.close();
		
	}
}
