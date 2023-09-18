package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class CalculatorTest3 {
	static AppiumDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openCalculator() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1909");
		cap.setCapability("udid", "5a491d5a");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("appPackage", "com.dencreak.dlcalculator");
		cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/");

		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		
		  driver.findElement(By.id(
		  "com.dencreak.dlcalculator:id/pad_btn_b_c")).click();
		  Thread.sleep(1000); 
			
			 driver.findElement(By.id(
			 "com.dencreak.dlcalculator:id/pad_btn_d_a")).click();
			 Thread.sleep(1000); driver.findElement(By.id(
			 "com.dencreak.dlcalculator:id/pad_img_d_d")).click();
			 Thread.sleep(1000); driver.findElement(By.id(
			  "com.dencreak.dlcalculator:id/pad_btn_b_b")).click();
			  Thread.sleep(1000); driver.findElement(By.id(
			  "com.dencreak.dlcalculator:id/pad_btn_b_c")).click();
			  Thread.sleep(1000); driver.findElement(By.id(
			  "com.dencreak.dlcalculator:id/pad_img_e_d")).click();
			  Thread.sleep(1000);
			 
		System.out.println("connected");
		driver.quit();
		// String value=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
		 //System.out.println("my output is.."+value);
	}

}
