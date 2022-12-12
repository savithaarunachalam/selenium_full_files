package Webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.text.View;

import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
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
import io.appium.java_client.touch.offset.PointOption;
import static  io.appium.java_client.touch.offset.ElementOption.element;

public class KhanAcademyhybrid {
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity ");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
	}
	@Test
	public void testcase1() throws InterruptedException {
		 Thread.sleep(15000);
		 driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Savitha Arunachalam\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Math\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Kindergarten\"))").click();
		 //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"Class 10 (Foundation)\")").click();
		 Thread.sleep(15000);
		 driver.findElementByAndroidUIAutomator("text(\"Basics\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"The why of the 9 divisibility rule\")").click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
       	 driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View[2]")).click();
       	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
       	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
    //	 driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Back\"]/android.widget.ImageView")).click();
       	driver.pressKey(new KeyEvent(AndroidKey.BACK));
       	Thread.sleep(15000);
        driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Back\"]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Back\"]/android.widget.ImageView")).click();
     	Thread.sleep(15000);
     	
     	  driver.findElementByAndroidUIAutomator("text(\"Arts and humanities\")").click();
    	Thread.sleep(7000);
   	    driver.findElementByAndroidUIAutomator("text(\"Big History Project\")").click();
   	    Thread.sleep(9000);
   	    driver.findElementByAndroidUIAutomator("text(\"1. What Is Big History?\")").click();
   	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
   	    driver.findElementByAndroidUIAutomator("text(\"Activity: Easter Island Mystery\")").click();
   	    Thread.sleep(7000);
   		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
   	   // driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
  
     	Thread.sleep(7000);
     	//driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Easter Island Mystery Worksheet\"))").click();
     	driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Back\"]/android.widget.ImageView")).click();
     	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Back\"]/android.widget.ImageView")).click();
    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	
    	
    	//driver.findElementByAndroidUIAutomator("text(\"Economics\")").click();
    	//Thread.sleep(7000);
    	//driver.findElementByAndroidUIAutomator("text(\"Microeconomics\")").click();
    	//Thread.sleep(15000);
    	//driver.findElementByAndroidUIAutomator("text(\"Basic economic concepts\")").click();
    	//Thread.sleep(7000);
    	//driver.findElementByAndroidUIAutomator("text(\"Economics\")").click();
    	//Thread.sleep(7000);
    	//driver.findElementByAndroidUIAutomator("text(\"Scarcity\")").click();
    	
    //	driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    //	Thread.sleep(5000);
    //	driver.findElementByAndroidUIAutomator("text(\"Retry\")").click();
    //	driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup\r\n")).click();

    	//driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
    	//driver.pressKey(new KeyEvent(AndroidKey.BACK));
    
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"(Choice D)\").instance(0))").click(); //scroll down to the element and click
    	//driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"(Choice D)\"))").click();
    	//driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	
    	//driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	//Thread.sleep(7000);
    	//driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 driver.findElementByAndroidUIAutomator("text(\"Life skills\")").click();
    	 Thread.sleep(7000);
    	 driver.findElementByAndroidUIAutomator("text(\"Breakthrough Junior Challenge\")").click();
    	 Thread.sleep(7000);
    	 driver.findElementByAndroidUIAutomator("text(\"2019 Challenge\")").click();
    	 Thread.sleep(7000);
    	 driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
    	 driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
    	 Thread.sleep(7000);
    	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	 driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	 
    	 
    	 

    	driver.findElementByAndroidUIAutomator("text(\"Home\")").click();
    	Thread.sleep(7000);
    	driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Dismiss\"]")).click();
    	Thread.sleep(7000);
    	driver.findElementByAndroidUIAutomator("text(\"Edit\")").click();
    	Thread.sleep(7000);
    	driver.findElementByAndroidUIAutomator("text(\"Class 5 math (India)\")").click();
    	Thread.sleep(7000);
    	driver.findElementByAndroidUIAutomator("text(\"Done\")").click();
    	Thread.sleep(7000);
    	driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
    	Thread.sleep(7000);
    	driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();
    	Thread.sleep(7000);
    	driver.findElementByAndroidUIAutomator("text(\"SIGN OUT\")").click();
    	
        
    	
	}
	}
	