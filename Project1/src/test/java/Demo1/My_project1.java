package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_project1 {
	
	WebDriver driver;
	@BeforeTest
	
	public void B() {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		// initialize the HtmlReporter
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		 		
		
	}
    @Test
    
    public void testcase1() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Holiday Packages")).click();
 	   driver.findElement(By.linkText("FROM CITY")).click();
 	   //Select S= new Select(driver.findElement(By.name("FROM CITY")));
 	   //S.selectByVisibleText("Bangalore");
 	   driver.findElement(By.linkText("FROM CITY")).sendKeys("Bangalore");
 	   driver.findElement(By.linkText("TO CITY/COUNTRY")).click();
 	   driver.findElement(By.linkText("TO CITY/COUNTRY")).sendKeys("Singapore");
 	   driver.findElement(By.linkText("Search")).click();
 	   driver.findElement(By.linkText("STARTING DATE")).click();
 	   driver.findElement(By.xpath("//*[@class='DayPicker-Day DayPicker-Day--selected']")).click();
 	   driver.findElement(By.linkText("Search")).click();
 	   driver.findElement(By.linkText("2N/3D")).click();
 	   driver.findElement(By.xpath("//*[@id='initeraryNav']/li[3]")).click();
 	   //choose hotel  
 	   driver.findElement(By.xpath("//*[//*[@id='modalpopup']/div/div/div/div/div[2]/div/div[55]/div[2]/div[7]/span")).click();
 	   //update package
 	   driver.findElement(By.linkText("Select")).click();
 	   driver.findElement(By.linkText("Update Package")).click();
 	   //add activity
 	   driver.findElement(By.xpath("//*[@class='add-activity-button']")).click();
 	   driver.findElement(By.linkText("Entrance Fee Canopy Bridge")).click();
 	   driver.findElement(By.linkText("Select")).click();
    }
    
    	//driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
    	//driver.findElement(By.xpath("//*[@class='nav-line-2']/span")).click();
    	
    	//driver.findElement(By.linkText("Sign in")).click();
    	//driver.findElement(By.name("email")).sendKeys("savithaarunachalam@gmail.com");
    	//driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
    	//driver.findElement(By.name("password")).sendKeys("savithaarun");
    
    
      @AfterTest
     
      public void AT () throws InterruptedException {
    	  Thread.sleep(3000);
    	  driver.close();
    	 
      }
      
}
