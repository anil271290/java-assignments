import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
}
