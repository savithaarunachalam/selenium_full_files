package Webapp;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Taskapidemos {
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.appium.android.apis.ApiDemos");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	@Test
	public void testcase1() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("1. Preferences from XML")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Checkbox preference\"))").click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Edit text preference\"))").click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/edit")).sendKeys("CAT");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Graphics")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Vertices\"))").click();
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("1. Dialog")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("change the date")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"7\"))").click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"OK\"))").click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"CHANGE THE TIME\"))").click();
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.AccessibilityId("10")).click();
		Thread.sleep(5000);
		//click on 15
		AndroidElement savi1 = driver.findElement(MobileBy.AccessibilityId("15"));
		Thread.sleep(5000);
		//click on 5
		AndroidElement savi2 = driver.findElement(MobileBy.AccessibilityId("5"));
		Thread.sleep(1000);
		
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(savi1)).withDuration(ofSeconds(3))).moveTo(element(savi2)).release().perform();
		 
		 driver.findElementByAndroidUIAutomator("text(\"AM\")").click();
		 Thread.sleep(5000);
		 driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		 Thread.sleep(5000);
		 driver.pressKey(new KeyEvent(AndroidKey.HOME));
	    Thread.sleep(1000);
	}
	

}
