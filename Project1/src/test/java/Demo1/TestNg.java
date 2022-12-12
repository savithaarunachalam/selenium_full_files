package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	WebDriver driver;
	@BeforeTest
	public void BT()  {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	}
	
	@Test(priority = 0)
	public void testcase1() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
				List<WebElement> links = driver.findElements(By.tagName("a"));
				// print total number of links 
				System.out.println("Total number of links:"+links.size());
				
				 for(int i=0;i<links.size();i++)
				 {
					 System.out.println(links.get(i).getText());
					 System.out.println(links.get(i).getAttribute("href"));
					 
				 }
					 
				 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click();
				 driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
				 driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
				 driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
			      Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	}
	

				 