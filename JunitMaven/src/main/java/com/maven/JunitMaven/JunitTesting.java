package com.maven.JunitMaven;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTesting {

	static ChromeDriver driver;
	String url;

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("1");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Before
	public void before() throws Exception {
		System.out.println("2");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	}

	@Test
	public void test1() {
		System.out.println("Test1");
		url = driver.getCurrentUrl();
		if (url.equals("https://www.saucedemo.com/inventory.html")) 
		{
			System.out.println("Test Successful");
		}	
		else
		{
			System.out.println("Test Failed");
		}

	}

	@After
	public void after() throws Exception 
	{
		System.out.println("3");
		
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);

	} 
	

	@AfterClass
	public static void afterClass() 
	{
		System.out.println("4");
		driver.close();
	}
}
