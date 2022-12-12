package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window1Test {
 
  WebDriver driver;


	@BeforeTest
	
	  public void BT() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://letcode.in/windows");
	String windowHandle = driver.getWindowHandle();
	System.out.println("FIRST WINDOW : " + windowHandle);
	driver.getWindowHandle();
	driver.findElement(By.id("home")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	List<String> list = new ArrayList<String> (windowHandles);
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(list.get(0));
	driver.close();
	String CurrentUrl = driver.getCurrentUrl();
	//System.out.println(currentUrl);
	}
	
}
