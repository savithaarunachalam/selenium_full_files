package DataDriven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
	public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;	
	@Parameters("mybrowser")
	@BeforeTest()
	public void test(String mybrowser) {
	if(mybrowser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}else if(mybrowser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Thread.sleep(7000);
	}
 	  
  }