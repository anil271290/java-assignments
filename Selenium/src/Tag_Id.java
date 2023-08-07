import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Id {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("anil");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Anil");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name=login]")).click();
		System.out.println("Button clicked");
		Thread.sleep(5000);
		driver.close();
	}
}
