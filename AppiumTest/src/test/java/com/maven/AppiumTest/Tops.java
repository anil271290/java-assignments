package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Tops {
 static AppiumDriver driver= null;
	
	public static void main(String[] args) throws InterruptedException {
		try {
			Topscareer();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Topscareer() throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung SM-M127G");
		cap.setCapability("udid", "RZ8T60TGEFX");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.google.android.googlequicksearchbox");
		cap.setCapability("appActivity", "com.google.android.googlequicksearchbox.SearchActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/");

		
		driver=new AppiumDriver(url, cap);
		
		//driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("Topscareercenter");
	}
	

		
		
		
	

}
