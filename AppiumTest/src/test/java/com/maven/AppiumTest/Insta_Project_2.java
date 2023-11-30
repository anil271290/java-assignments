package com.maven.AppiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Insta_Project_2 {
 static AppiumDriver driver= null;
	
	public static void main(String[] args) throws Exception {
		try {
			Tasteinsta();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void takeScreenshot() throws Exception  {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file= ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		FileUtils.copyFile(file, new File("./screenshots/image" + timestamp + ".jpeg" ));	
	}
	
	public static void Tasteinsta() throws Exception  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung SM-M127G");
		cap.setCapability("udid", "RZ8T60TGEFX");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.instagram.android");
		cap.setCapability("appActivity", "com.instagram.mainactivity.InstagramMainActivity");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appWaitForLaunch", false);
		URL url = new URL("http://127.0.0.1:4723/");

		
		driver=new AppiumDriver(url, cap);
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Instagram\"]")).click();
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("captain");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("marvel.captain");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Not now\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.EditText")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/pickers\"]/android.widget.NumberPicker[1]")).sendKeys("15");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/pickers\"]/android.widget.NumberPicker[2]")).sendKeys("Jan");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/pickers\"]/android.widget.NumberPicker[3]")).sendKeys("1995");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("8866691917");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.EditText[@text=\" \"]"));
		Thread.sleep(500);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"I Agree\"]/android.view.ViewGroup")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Skip\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		takeScreenshot();
		

	}
	

		
		
		
	

}
