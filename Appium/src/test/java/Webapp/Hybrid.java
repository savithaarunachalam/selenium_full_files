package Webapp;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybrid {
AndroidDriver<AndroidElement> driver;
	
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
	@Test(enabled=false)
	public void negativetestcases() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("android:id/text1")).click();
		
		//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
		Thread.sleep(5000);
		//driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("SAVITHA");
		
		Thread.sleep(7000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Female\")"));
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Let's Shop\")")); 
		String toastmessage = driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(toastmessage);
	
	}
  @Test(enabled=true)
  
  public void positivetestcase() throws InterruptedException {
	  driver.findElement(MobileBy.id("android:id/text1")).click();
		
		//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("SAVITHA");
		
		Thread.sleep(7000);
	
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Female\")"));
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(5000);
		
		
		
		//long press for one  element only
		 AndroidElement savi1= driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Please read our terms of conditions\")"));
		 TouchAction ta = new TouchAction(driver);
		 ta.longPress(longPressOptions().withElement(element(savi1)).withDuration(ofSeconds(3))).release().perform();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 driver.findElementByAndroidUIAutomator("text(\"CLOSE\")").click();
		 
	
		
		String price1=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		price1=price1.substring(1);
		//System.out.println(price1);
		Double firstproduct=Double.parseDouble(price1);
		System.out.println(firstproduct);
		
		String price2=driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView\r\n")).getText();
		price2=price2.substring(1);
		//System.out.println(price2);
		Double secondproduct=Double.parseDouble(price2);
		System.out.println(secondproduct);
		
		Double TotalPrice = firstproduct+secondproduct;
		System.out.println(TotalPrice);
		
		String total=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).get(0).getText();
		total=total.substring(1);
		//System.out.println(price1);
		Double total1=Double.parseDouble(total);
		System.out.println(total);
		
		
		Assert.assertEquals(TotalPrice ,total);
		  Thread.sleep(5000);
		   driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
		   Thread.sleep(5000);
		   driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		   Thread.sleep(5000);
  }
  
  }
	
