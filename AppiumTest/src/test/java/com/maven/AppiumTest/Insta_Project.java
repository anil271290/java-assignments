package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Insta_Project {
 static AppiumDriver driver= null;
	
	public static void main(String[] args) throws InterruptedException {
		try {
			Tasteinsta();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Tasteinsta() throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO CPH2471");
		cap.setCapability("udid", "YDOVFMNNV8QKORZD");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		//cap.setCapability("appPackage", "com.instagram.android");
		//cap.setCapability("appActivity", "com.instagram.mainactivity.InstagramMainActivity");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appWaitForLaunch", false);
		cap.setCapability("app", "C:\\Users\\ANIL PATEL\\Automation Library\\Appium\\instagram-254-0-0-19-109.apk");
		URL url = new URL("http://127.0.0.1:4723/");

		
		driver=new AppiumDriver(url, cap);
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Instagram\"]")).click();
		
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.className("android.widget.EditText")).sendKeys("captain");
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("Captain");
	}
	

		
		
		
	

}
