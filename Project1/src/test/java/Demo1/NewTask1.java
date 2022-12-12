package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTask1 {
	
 String url="https://demoqa.com/alerts/";


  WebDriver driver1;
 @Test
public void alert()   {
	
	WebDriverManager.chromedriver().setup();
	driver1 = new ChromeDriver();
	driver1.get(url);
 }
 @Test
 public void  alert1 () throws InterruptedException {
	 Thread.sleep(5000);
	// driver.findElement(By.xpath(//*[@class='btn btn-primary']")).click();
	 driver1.findElement(By.id("alertButton")).click();
	 
	 //driver1.findElement(By.xpath(//*[@class="btn btn-primary"]']")).click();
	
    Thread.sleep(5000);
    System.out.println("I want to click on that button");
    Alert savi = driver1.switchTo().alert();
    savi.accept();
    Thread.sleep(5000);
    System.out.println("Clicked on that alert");
   
 }
 @Test
  public void alerts2() throws InterruptedException {
	  Thread.sleep(5000);
	   driver1.findElement(By.id("timerAlertButton")).click();
	   Thread.sleep(5000);
	   Alert alert =driver1.switchTo().alert();
	   alert.accept();
	   Thread.sleep(5000);
	   System.out.println("Clicked on timelines takes 5");
  
  }
 @Test
  public void alerts3() throws InterruptedException {
	  Thread.sleep(5000);
	  driver1.findElement(By.id("confirmButton")).click();
	  System.out.println("Clicked on third button");
	  Thread.sleep(5000);
	  Alert alert = driver1.switchTo().alert();
	  Thread.sleep(5000);
	  alert.dismiss();
	  Thread.sleep(5000);
  }
  
  public void alerts4() throws InterruptedException { 
	  Thread.sleep(5000);
	  driver1.findElement(By.id("promtButton")).click();
	  System.out.println("Clicked on fourth button");
	  Thread.sleep(5000);
	  Alert alert = driver1.switchTo().alert();
	  alert.sendKeys("Savitha");
	  Thread.sleep(5000);
	  alert.accept();
	  
  }
  
  @AfterTest
    public void AT() throws InterruptedException { 
	  Thread.sleep(5000);
	  driver1.quit();
  }
  
  }



  
