package Webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import  static java.time.Duration.ofSeconds;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
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
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static  io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.LongPressOptions;


import static  io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;



public class Tasknative {
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

	@Test(enabled=false)
    public void testcase1() throws InterruptedException {
     	System.out.println("hello i am trying to run native apps");
     	Thread.sleep(2000);
     	driver.findElement(MobileBy.AccessibilityId("Preference")).click();
     	Thread.sleep(2000);
     	driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
     	Thread.sleep(2000);
     	driver.findElement(MobileBy.id("android:id/checkbox")).click();
     	
     	Thread.sleep(2000);
     	//driver.findElement(MobileBy.className("android.widget.RelativeLayout")).click();
     	driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
     	
     	
     	driver.findElement(MobileBy.id("android:id/edit")).sendKeys("SAVITHA");
     	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"CANCEL\")")).click();
     	driver.hideKeyboard();
     	
     	
	}
	@Test(enabled=true)
	
	public void open_notification() throws InterruptedException {
		driver.openNotifications();
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
		TouchAction tee=new TouchAction(driver);
		Thread.sleep(10000);
		tee.longPress(PointOption.point(1045,626)).moveTo(PointOption.point(35, 612)).release().perform();
		
		//click on rotate icon
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
		Thread.sleep(2000);
		//driver.findElements(MobileBy.className("android.widget.ImageView")).get(4).click();
		driver.findElement(MobileBy.AccessibilityId("Open settings.")).click();
		Thread.sleep(2000);
		
	}
	@Test(enabled=false)
	public void tabandlongpress() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(2000);
		// whether views is able to click element or not
		AndroidElement size=driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		//print size 
		System.out.println(size.getSize());
		
		driver.findElement(MobileBy.AccessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		 AndroidElement tp = driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter"));
		 TouchAction ta= new TouchAction(driver);
		 ta.tap(tapOptions().withElement(element(tp))).perform();
		 
		 AndroidElement lp=driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"People Names\")"));
		 ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
	
	}
	@Test(enabled=false)
	public void scroll() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(1000);
		//multiple scrolldown
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		Thread.sleep(1000);
		//keyboard actuon press back
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(1000);
		//go to recent apps
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
	}
	@Test(enabled=false)
	public void swipeActions() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		Thread.sleep(5000);
		//click on time
		driver.findElement(MobileBy.AccessibilityId("12")).click();
		Thread.sleep(5000);
		//click on 15
		AndroidElement savi1 = driver.findElement(MobileBy.AccessibilityId("15"));
		Thread.sleep(5000);
		//click on 5
		AndroidElement savi2 = driver.findElement(MobileBy.AccessibilityId("5"));
		Thread.sleep(1000);
		 //Actions and long press
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(savi1)).withDuration(ofSeconds(3))).moveTo(element(savi2)).release().perform();
		 
		 driver.findElementByAndroidUIAutomator("text(\"AM\")").click();
		 
		
	}
	@Test(enabled=false)
	public  void Draganddrop() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		Thread.sleep(5000);
		AndroidElement arun1 = driver.findElements(MobileBy.className("android.view.View")).get(0);
		AndroidElement arun2 = driver.findElements(MobileBy.className("android.view.View")).get(2);
		//Action and long press
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(arun1)).withDuration(ofSeconds(3))).moveTo(element(arun2)).release().perform();
		 
	}
	@Test(enabled=false)
	public void swapeApp() throws InterruptedException {
		driver.findElement(MobileBy.AccessibilityId("OS")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("SMS Messaging")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(555) 521-5554");
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("io.appium.android.apis:id/sms_content")).sendKeys("hello ..i am trying to open messages");
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Send")).click();
		Thread.sleep(5000);
		driver.activateApp("com.google.android.apps.messaging");
		Thread.sleep(5000);
	    String value=	driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"hello ..i am trying to open messages open\"))").getText();
	    Thread.sleep(5000);
		System.out.println(value);
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(5000);
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(5000);
		
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(2000);
		
		
	}
	
}

