package Webapp;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import static  io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class TaskHybrid {
AndroidDriver<AndroidElement> driver;
private WebElement element;
	
	@BeforeTest
	public void BT() throws MalformedURLException, InterruptedException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity ");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		Thread.sleep(5000);
	}
	
    @Test(enabled=true)
    public void testcase1() throws InterruptedException {
    	
    	Thread.sleep(5000);
        driver.findElement(MobileBy.id("android:id/text1")).click();
		
		//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("SAVITHA");
		
		Thread.sleep(7000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Female\")"));
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
	
	
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(3)).scrollIntoView(new UiSelector().textContains(\"ADD TO CART\").instance(3))").click();
		//MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
		       // "new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\")).getChildByText("
		       // + "new UiSelector().className(\"android.widget.TextView\"), \"Click on that product\")"));
		//element.click();
		
		
	//String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(3)).scrollIntoView(new UiSelector().text(\"ADD TO CART\").instance(3))";

		//driver.findElementByAndroidUIAutomator(scrollElement).click();
		
        
	    String savi=  driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").getText();   
	    System.out.println("scoll to that product->"+savi);
	    Thread.sleep(9000);
		
		
	     driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
	
	     driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	     Thread.sleep(5000);
	   
	     String price1=driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
	     
		 price1=price1.substring(1);
		//System.out.println(price1);
		Double cost=Double.parseDouble(price1);
		System.out.println(cost);
	  
	   driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
	   Thread.sleep(5000);
	   driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
	   Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	   
	
    }

}
