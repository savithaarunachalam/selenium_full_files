package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extends utill {
	

		WebDriver driver;
		private Object web;
		@Test
		public void BeforeTest () {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.navigate().to(url);
		}
		
		@Test
		public void testcase1() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();

		    utill.changeColor("red",web,driver);
			//String bgcolor= Element.getCssValue("backgroundColor");
		    utill.drawBorder(web,driver);
		}
		}
		
