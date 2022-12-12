package Webapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Orangehrm {
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
		
		
		//*[contains(text(),'OrangeHRM')]
	}
	@Test
	public void tc_1() throws InterruptedException
	{
		driver.get("https://www.google.com");
		System.out.println("Hello Appium");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Orangehrm");
		Actions ac = new Actions(driver);
	    ac.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='rso']/div[2]/div/div/div/div/div[1]/div/a/div/div[2]/div/div")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--focus']")).sendKeys("Admin");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
	    
	    
		//JavascriptExecutor sa= ((JavascriptExecutor)driver);
      /// sa.executeScript("arguments[0].scrollIntoView(true);", clickelement);
	    
        //clickelement.click();
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		//driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='oxd-topbar-header']/div/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();  
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
}
		
		
}


