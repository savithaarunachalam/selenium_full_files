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

public class hybridsize {
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
	@Test(priority=0)
	  
	  public void positivetestcase() throws InterruptedException {
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

}
	@Test(priority=1)
	public void size() {
		//to check how many products or iteams are present
		//int count =driver.findElements(MobileBy.id("com.androidsample.generalstore:id/rvProductList")).size();
		//System.out.println(count);
		//scroll into specific element using its text
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().text(\"Jordan Lift Off\"))");
		
		driver.findElementByAndroidUIAutomator(" new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\")).instance(0))"));
				
		int count1 =driver.findElements(MobileBy.id("com.androidsample.generalstore:id/rvProductList")).size();
		
		for(int i=0;i<count1;i++);
		{
			String PN=driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productName")).get(i).getText();

			
			System.out.println(PN);
			
		
		     if(PN.equalsIgnoreCase("Jordan Lift Off")) 
		    {
			System.out.println(PN);
			driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			break;
		    }
		
		}
	}
}

		
		
		
		
		
		
		
		
	
