package Webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
  
	@Test()
    public void testcase1() throws InterruptedException {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"9\")")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("multiply")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("equals")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("clear")).click();
	}
}
