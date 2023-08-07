import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Event1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.name("email"));
		
		Actions builder=new Actions(driver);
		Action actions=builder.moveToElement(uname)
				.click()
				.keyDown(uname,Keys.SHIFT)
				.sendKeys("anil")
				.keyUp(uname, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		actions.perform();
		Thread.sleep(2000);
		driver.close();
}
}
