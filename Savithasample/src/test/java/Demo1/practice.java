package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	public static WebDriver driver;
	@BeforeTest
	public void testcase () {
		
	
	
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
	
	
}
	@Test(priority = 0)
	public void testcase1() throws InterruptedException {
		
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    Thread.sleep(1000);
		    driver.findElement(By.name("password")).sendKeys("admin123");
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		     
	 

             driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
             Actions action = new Actions(driver);
             Thread.sleep(2000);
             WebElement A= driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
             Thread.sleep(2000);
             action.moveToElement(A);
             Thread.sleep(2000);
             action.click().build().perform();
             Thread.sleep(2000);      

           //Add username
             WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
             Actions act = new Actions(driver);
             act.moveToElement(ele).perform();
}
}

