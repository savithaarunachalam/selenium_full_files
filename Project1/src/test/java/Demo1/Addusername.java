package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addusername {
	WebDriver driver;
	public void BT()  {
		
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);
		driver.manage().window().maximize();
	
	
}
	@Test(priority = 0)
	public void testcase1() throws InterruptedException {
		Thread.sleep(3000);
		WebElement username= driver.findElement(By.name("username"));
		if(username.isEnabled())
		{
			username.sendKeys("Admin");
			Thread.sleep(5000);
			  
		}
			
	  
		WebElement password = driver.findElement(By.name("password"));
		if(password.isDisplayed())
		{
			password.sendKeys("admin123");
			Thread.sleep(4000);
			  
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	 

              driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
               Actions action = new Actions(driver);
              Thread.sleep(5000);
              WebElement A= driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
             Thread.sleep(5000);
               action.moveToElement(A);
              Thread.sleep(5000);
           action.click().build().perform();
             Thread.sleep(5000);      

           //Add username
             WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
            Actions act = new Actions(driver);
              act.moveToElement(ele).perform();
}
}

