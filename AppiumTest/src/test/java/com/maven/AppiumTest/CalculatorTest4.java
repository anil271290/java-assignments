package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class CalculatorTest4 {
	static AppiumDriver driver = null;
	static AndroidDriver driver1=null;
	public static void main(String[] args) throws InterruptedException {
		try {
			openCalculator("8238073745", "Helooo");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openCalculator(String phoneNumber, String message) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "samsung SM-M127G");
		cap.setCapability("udid", "RZ8T60TGEFX");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.google.android.apps.messaging");
		cap.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/");
		//driver = new AppiumDriver(url, cap);
		driver1=new AndroidDriver(url,cap);
		driver1.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		
		  driver1.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_federated_learning_next_button")).click();
		  driver1.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_spam_next_button")).click();
		  driver1.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_rcs_consent_accept_button")).click();

			 //driver1.findElement(By.id("com.google.android.apps.messaging:id/start_chat_fab")).click();
			 Thread.sleep(1000); 
			 //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText/android.widget.TextView")).click();
			 //driver.findElement(By.className("android.widget.TextView")).sendKeys("133");
			// driver1.findElement(By.id("ContactSearchBar")).sendKeys("123");
			 driver1.sendSMS(phoneNumber="8238073745", message="Helooww");
			 
			 
			// driver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.TextView[1]")).click();
			 //driver1.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("Helloooww");
			// driver1.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon")).click();
			// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brijesh Bodo\"));"));
			// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.TextView[1]")).click();
			 
				/*
				 * driver.findElement(By.xpath(
				 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]"
				 * )).click(); driver.findElement(By.id(
				 * "com.google.android.apps.messaging:id/compose_message_text")).click();
				 * driver.findElement(By.id("android.widget.EditText")).
				 * sendKeys("Hello automate msg");
				 * 
				 * driver.findElement(By.id(
				 * "com.google.android.apps.messaging:id/send_message_button_icon")).click();
				 * Thread.sleep(1000);
				 */
		System.out.println("connected");
		driver1.quit();
		// String value=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
		 //System.out.println("my output is.."+value);
	}

}
