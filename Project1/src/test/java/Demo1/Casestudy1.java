package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Casestudy1 {
	
	String url = "https://www.makemytrip.com/";		
	WebDriver driver;
	public void BT()  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
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
	   
	   
   }
	   
   }

