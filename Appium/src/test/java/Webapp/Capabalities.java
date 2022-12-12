package Webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.events.api.general.JavaScriptEventListener;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabalities {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C://Users//Star//Documents//workspace-spring-tool-suite-4-4.16.1.RELEASE//Appium//test-output//chromedriver.exe");
		//driver = new AndroidDriver<AndroidElement>(new URL(“http://0.0.0.0:4723/wd/hub”),dc);
		driver =new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
		
	
	}
	
	@Test
	public void tc_1() throws InterruptedException
	{
		driver.get("https://www.google.com");
		System.out.println("Hello Appium");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Moolyaed");
		
	    Actions ac = new Actions(driver);
	    ac.sendKeys(Keys.ENTER).build().perform();
		//JavascriptExecutor js= ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollTo(0,300)");
		
		//driver.findElement(By.xpath("//*[@class='ynAwRc q8U8x MBeuO oewGkc LeUQr htnRc']")).click();
		//driver.findElement(By.xpath("//*[@id='rso']/div[3]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/a/div/div[2]/div")).click();
		
		
		//using angartag
		List<AndroidElement> links = driver.findElements(By.tagName("a"));
		//print total number of links
		System.out.println("Total number of links:"+links.size());
		
		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText());
			 System.out.println(links.get(i).getAttribute("href"));
			 
		 }
		WebElement clickelement= driver.findElement(By.xpath("//*[contains(text(),'MoolyaEd | LinkedIn')]"));
		JavascriptExecutor sa= ((JavascriptExecutor)driver);
        sa.executeScript("arguments[0].scrollIntoView(true);", clickelement);
        clickelement.click();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        
		
		

		
		
		
		
	}
}
