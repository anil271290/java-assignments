import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTesting2 {

	static ChromeDriver driver;
	String url;

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("1");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Before
	public void before() throws Exception {
		System.out.println("2");
		driver.findElement(By.name("username")).sendKeys("anil2317");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class=button]")).click();
		Thread.sleep(4000);
	}

	@Test
	public void test3() throws Throwable {
		System.out.println("Test3");
		url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://parabank.parasoft.com/parabank/overview.htm")) 
		{
			System.out.println("Test Successful");
		}	
		else
		{
			System.out.println("Test Failed");
			Thread.sleep(3000);
		}

	}

	@After
	public void after() throws Exception 
	{
		System.out.println("3");
		
			driver.findElement(By.linkText("Bill Pay")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Log Out")).click();
			Thread.sleep(5000);


	} 
	

	@AfterClass
	public static void afterClass() 
	{
		System.out.println("4");
		driver.close();
	}
}
