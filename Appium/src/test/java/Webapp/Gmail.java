package Webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gmail {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.gm");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.google.android.gm.GmailActivity ");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	@Test
	public void testcase1() throws InterruptedException {
		   Thread.sleep(9000);
		   driver.findElement(MobileBy.id("com.google.android.gm:id/welcome_tour_got_it")).click();
		   Thread.sleep(9000);
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAKE ME TO GMAIL\")")).click();
		   Thread.sleep(15000);
		   driver.findElement(MobileBy.AccessibilityId("Close")).click();
		  // driver.findElement(MobileBy.id("Close")).click();
		   driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Meet\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		   driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"New meeting\")")).click();
		   driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Start an instant meeting\")")).click();
		   driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ALLOW\")")).click();
		   driver.manage().timeouts().implicitlyWait(17,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ALLOW\")")).click();
		   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		   
		   driver.findElement(MobileBy.AccessibilityId("Expand")).click();
		   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  // driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Turn camera off\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		  // driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  // driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Turn microphone off\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		   driver.findElement(MobileBy.AccessibilityId("Leave call")).click();
		   
		   driver.findElement(MobileBy.AccessibilityId("Navigation menu")).click();
		   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		   
		   
		   driver.findElement(MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Mail, 13 new notifications\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		   driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		   driver.findElement(MobileBy.AccessibilityId("Dismiss tip")).click();
	}
	

}
