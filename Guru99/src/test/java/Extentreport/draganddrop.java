package Extentreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	public static String url ="https://jqueryui.com/droppable/";
	WebDriver driver;
	



  @BeforeTest
  public void beforetest () throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
  }
   @Test
    public void Test1() throws InterruptedException {
	   Thread.sleep(3000);
	 //  driver.findElements(By.tagName("iframe")).size();
	   //System.out.println(driver.findElements( By.tagName("iframe")).size());
	   //driver.switchTo().frame(0);
	   //driver.switchTo().frame(1);
	   
	   WebElement drag =driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	
	   WebElement drop = driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']"));
	   Actions ac = new Actions(driver);
	   Thread.sleep(2000);
	   ac.dragAndDrop(drag, drop).build().perform();
	   
	   
   }
   
   
   }
   
