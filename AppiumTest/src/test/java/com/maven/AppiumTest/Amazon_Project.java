package com.maven.AppiumTest;

import java.awt.Window;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class Amazon_Project {
 static AppiumDriver driver= null;
	
	public static void main(String[] args) throws Exception {
		try {
			Tasteinsta();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Tasteinsta() throws Exception  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi POCO F1");
		cap.setCapability("udid", "915997cd");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		//cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		//cap.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appWaitForLaunch", false);
		cap.setCapability("app", "C:\\Users\\ANIL PATEL\\Downloads\\com.amazon.mShop.android.shopping_v26.16.0.100-1241254010_Android-8.0.apk");
		
		URL url = new URL("http://127.0.0.1:4723/");

		
		driver=new AppiumDriver(url, cap);
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		Thread.sleep(500);
	    driver.findElement(By.xpath("//android.view.View[@content-desc=\"Mobiles Mobiles\"]")).click();
		
		
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView[1]")).click();
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Samsung Galaxy M34 5G\"]")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add to Wish List\"));"));
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
	}
	

		
		
		
	

}