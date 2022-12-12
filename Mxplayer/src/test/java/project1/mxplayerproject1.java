package project1;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mxplayerproject1 {
	

   public static WebDriver driver;
      ExtentHtmlReporter htmlReporter;
	  ExtentReports extent;
	  ExtentTest test;
	  
	  
     
	  
     @BeforeTest
     public static void main() {
    	 
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
    	   
       driver.get("https://www.mxplayer.in/");

       driver.manage().window().maximize();
        
		
    	   

}
	@Test
	public void tc1() throws InterruptedException {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	    //telegu
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(5000);
	  //  WebDriverWait wait = new WebDriverWait(driver,Timestamp.valueOf(10));
	    
	    //WebElement SearchResult = wait.until(ExpectedCondition.ElementIsVisible((By.xpath())))
	    //tamil
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(5000);
	    //hindi
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[3]/a")).click();
	    Thread.sleep(5000);
	    //bhojpuri
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[4]/a")).click();
	    Thread.sleep(5000);
	    //malayalam
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[5]/a")).click();
	    Thread.sleep(5000);
	   
	    //malayalam movies crime
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[1]/div")).click();
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[2]/div")).click();
	    //comedy
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[2]")).click();
	    Thread.sleep(5000);
	    //romance
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[3]")).click();
	    Thread.sleep(5000);
	    //action
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[4]")).click();
	    Thread.sleep(5000);
	    //clear all button
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[2]/div/div[6]")).click();
	    
	     //movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	    //telegu
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(5000);
	    //telegu crime
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[1]/div")).click();
	    Thread.sleep(5000);
	    //comedy
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[2]")).click();
	    Thread.sleep(5000);
	    //romance
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[3]")).click();
	    Thread.sleep(5000);
	    //actions
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[4]")).click();
	    Thread.sleep(5000);
	    //clear all button
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[2]/div/div[6]")).click();
	    Thread.sleep(5000);
	    
	    //movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	    //telegu
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[1]/a")).click();
	    Thread.sleep(5000);
	    
	    //others
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
	    Thread.sleep(5000);
	    //search
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div/div/div[2]/div[1]/input")).click();
	    Thread.sleep(5000);
	    // click drama
	    driver.findElement(By.xpath("//*[@class='filter-search']")).sendKeys("Drama");
	    //click check box
	    driver.findElement(By.xpath("//*[@class='checkbox-passive']")).click();
	    //clear all buttom
	    driver.findElement(By.xpath("//*[@class='clear-all-button']")).click();
	    
	    //click movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	    //click on tamil movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(5000);
	    //click crime
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[1]/div")).click();
	    Thread.sleep(5000);
	    //click comedy
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[2]")).click();
	    
	    Thread.sleep(5000);
	    //click romance
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[3]")).click();
	    Thread.sleep(5000);
	    //action
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[4]")).click();
	    Thread.sleep(5000);
	    //clear all
	    driver.findElement(By.xpath("//*[@class='clear-all-button']")).click();
	    
	  //click movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	    //click on tamil movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(5000);
	    //click on other
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div/div/div[1]/div")).click();
	    Thread.sleep(5000);
	 
	    //search
	    driver.findElement(By.xpath("//*[@class='filter-search']")).sendKeys("Biopic");
	    Thread.sleep(5000);
	  //click on chech box
	    driver.findElement(By.xpath("//*[@class='checkbox-passive']")).click();
	    Thread.sleep(5000);
	    
	    //clear button
	    driver.findElement(By.xpath("//*[@class='clear-all-button']")).click();
	    Thread.sleep(5000);
	   
	    
	    //movies
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(5000);
	 
	    //bhojpuri
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[4]/a")).click();
	    Thread.sleep(5000);
	    
	    //crime
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[1]")).click();
	    Thread.sleep(5000);
	    //comedy
	   driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[1]/div")).click();
	   Thread.sleep(5000);
	   //romance
	   driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[2]/div")).click();
	   Thread.sleep(5000);
	   //action
	   driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[3]/div")).click();
	   Thread.sleep(5000);
	   //clear all
	   driver.findElement(By.xpath("//*[@class='clear-all-button']")).click();
	    Thread.sleep(5000);
	    
		  //movies
		    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
		    Thread.sleep(5000);
		    
		  //tamil
		    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[2]/a")).click();
		    Thread.sleep(5000);
	    
	  //click on release year
	    driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div")).click();
	    //click on search
	   driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[2]/div[1]/a/div")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='filter-search']")).sendKeys("2014");
	    Thread.sleep(5000);
	    //click on chech box
	    driver.findElement(By.xpath("//*[@class='checkbox-passive']")).click();
	    
	    //clear button
	    driver.findElement(By.xpath("//*[@class='clear-all-button']")).click();
	    Thread.sleep(5000);
	   
	    
	}	
	@AfterTest
    public void AT () {
    	driver.close();
}
}


