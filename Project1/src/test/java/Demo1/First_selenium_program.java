package Demo1;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_selenium_program {
	
	WebDriver driver;
	public void BT()  {
		
		
		WebDriverManager.chromedriver().setup();
		options.setHeadless(true);
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.safaridriver().setup();
		driver = new ChromeDriver();
		

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);
		driver.manage().window().maximize();
	  //start report
		//htmlReporter = new ExtentHtmlReporter("extend.html");
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		
		
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
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
	}
	@Test(priority = 1)
	public void testcase2() throws InterruptedException {
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
	
		// Actions act = new Actions(driver);
			//WebElement ele = driver.findElement(By.xpath("//*[']"));
			act.click(ele).build().perform();
			act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
			act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
		 
		 /// Dropdown 
		Actions action1 = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
		action1.click(element).build().perform();
		action1.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		action1.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		 /// Employee Name
		 
		
		
		
		
		/// print size /////
		
			List<WebElement> li = driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
			System.out.print(li.size());
			Thread.sleep(5000);
			System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(0).getText());
			Thread.sleep(5000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(0).click();
			Thread.sleep(5000);
			driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			Thread.sleep(5000);
		     /// @@@@@@click table @@@@ ////
		
		
		  
		
		    //MouseoverAction
	
		
	 
		
		 
		  
		   /// print name //
		List<WebElement> printname = driver.findElements(By.xpath("oxd-icon bi-check oxd-checkbox-input-icon"));
		System.out.println(printname.size());
		for (WebElement webElement : printname) {
			String name = webElement.getText();
			System.out.println(name);
			
		}
		
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
		Thread.sleep(5000);
		
		     ////@@@@@click icon @@@@  ////
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(11).click();
		    @@@@@click delete icon  @@@@ ////
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(11).click();
		Thread.sleep(5000);
		   @@@@@popup deleted here  @@@@ ////
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]")).click();
		//driver.findElement(By.linkText("Kavya Sri Gayam")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-link']")).click();
		//driver.findElement(By.name("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		//WebElement d = driver.findElement(By.name("User Role"));
		//Select S = new Select(d);
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='--active oxd-topbar-body-nav-tab --parent']/li[1]/ul")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-form-row'][2]/div/div[2]/input")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	  
	private Action build() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterTest
	public void testcase3() {
    driver.close();
    
	}
	}
	
	
 