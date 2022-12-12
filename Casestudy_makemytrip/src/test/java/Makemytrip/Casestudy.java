package Makemytrip;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
         
public class Casestudy {
	String url = "https://www.makemytrip.com/";		
	WebDriver driver;
	public void BT()  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
		

}

   @Test
   public void testcase1() throws InterruptedException {
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
	   driver.findElement(By.linkText("Holiday Packages")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@id='fromCity']")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-7']/div/div[1]/p[2]")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.id("//*[@id='toCity']")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-8']/div/div[1]/p[1]")).sendKeys("Goa, India");
	   Thread.sleep(6000);
	   driver.findElement(By.linkText("Search")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.xpath("//*[@id='departure_date']")).click();
	   Thread.sleep(6000);
	  // driver.findElement(By.xpath())
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
	   
	   
   }
	   
   

