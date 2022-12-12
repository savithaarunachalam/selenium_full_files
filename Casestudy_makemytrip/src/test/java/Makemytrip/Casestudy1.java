package Makemytrip;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Casestudy1 {
	//String url = "https://www.makemytrip.com/";
	WebDriver driver;
	public String url;
	
	public void BT()  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
}

   @Test
   public void testcase1() {
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
   
	   
	   @AfterTest
		public void testcase3() {
	    driver.close();
	   
	   
   }
	   
   }

