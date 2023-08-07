import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Event {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		WebElement cruises=driver.findElement(By.linkText("Cruises"));
		Actions builder=new Actions(driver);
		Action movetohome=builder.moveToElement(home).build();
		movetohome.perform();
		Thread.sleep(2000);
		Action movetocruises=builder.moveToElement(cruises).build();
		movetocruises.perform();
		Thread.sleep(2000);
		Action movetohotels=builder.moveToElement(hotels).build();
		movetohotels.perform();
		Thread.sleep(2000);
		driver.close();
}
}
