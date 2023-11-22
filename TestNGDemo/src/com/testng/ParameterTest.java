package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTest 
{
	ChromeDriver driver;
   @Test
   @Parameters({"username","password"})
   public void parametertest(@Optional String username,@Optional String password) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ANIL PATEL\\Automation Library\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"profile__dropdown\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app__logout\"]")).click();
		Thread.sleep(2000);
		driver.close();
		
}
   	
}
