package Demo1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_project {
	private static final String WindowType = null;
	WebDriver driver;
	private By webdriver;
	private String Actions;
	private int i;
	private CharSequence element;
	private String url2;
	private org.openqa.selenium.interactions.Actions savi;
	private WebElement ELE1;
	private String WebElement;
	@BeforeTest
	public void BT()  {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.safaridriver().setup();
		driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String url2="https://www.youtube.com/";
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);
		driver.navigate().to(url2);
		
		driver.manage().window().fullscreen();
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
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
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText());
			 System.out.println(links.get(i).getAttribute("href"));
		 }
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		
		driver.getWindowHandle();
		//Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.tab);
		//Navigations to  new tab and opens the new link 
		driver.navigate().to(url2);
		// hold all window handles in array list
		 ArrayList<String> newTb= new ArrayList<String>(driver.getWindowHandles());
		 System.out.println(newTb);
		 //switch to new tab
		 driver.switchTo().window(newTb.get(0));
		 System.out.println("Page tittle of parent tab:" + driver.getTitle());
		 //switch to parent window
		 driver.switchTo().window(newTb.get(1));
		 System.out.println("Page tittle of child tab:" + driver.getTitle());
		 Thread.sleep(5000);
		  driver.switchTo().window(newTb.get(2));
		  System.out.println("Page tittle of parent tab :" + driver.getTitle());
		  driver.close();
		  System.out.println("Child tab closed");
		  Thread.sleep(5000);
		  driver.switchTo().window(newTb.get(0));
		  driver.close();
		  System.out.println("parent tab closed");
		 
		
		
		//driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']"));
	    driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("Aaliyah.Haq");
	    Actions act = new Actions(driver);
	  /// Dropdown 
		Actions savi = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
		action.click(element).build().perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	   
	   
		
		driver.findElement(By.xpath(//*[@placeholder='Type for hints...'])).sendKeys("Aaliyah.Haq");
	    WebElement ELE1 = driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[4]/div/div/div/div/div[2]"));
	    action.click(ELE1).build().perform();
	    		
	    		
		//action.moveToElement(A);
		//action.click().build().perform();
		//Thread.sleep(5000); 
		
		
		
		

		// Add userrole
				
		 //   Actions savi= new Actions(driver);
		  //  WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']")).click();
			//act.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
			//Thread.sleep(5000);
			//act.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
			//Thread.sleep(5000);	
			//driver.findElement(By.xpath("//*[@class='oxd-select-text oxd-select-text--active']")).click();
			//Thread.sleep(5000);
			
			// Status
		  // Actions element= new Actions(driver);
			//act.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		//	Thread.sleep(5000);
			//act.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
			//Thread.sleep(5000);	
			//driver.findElement(By.xpath("//*[@class='oxd-select-text-input']")).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@type='submit']"));
			
			
			
		// Actions act = new Actions(driver);
			//WebElement ele = driver.findElement(By.xpath("//*[']"));
			
		    //act.click(ele).build().perform();
			//act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
			//act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
		 
		 /// Dropdown 
		//Actions action1 = new Actions(driver);
		//WebElement element = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
		//action1.click(element).build().perform();
		//action1.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		//action1.sendKeys(element,Keys.ARROW_DOWN).click().build().perform();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		 /// Employee Name
		 
		
		
		
		
		/// print size /////
		
			//List<WebElement> li = driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
			//System.out.print(li.size());
			//Thread.sleep(5000);
			//System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(0).getText());
			//Thread.sleep(5000);
			//driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(0).click();
			//Thread.sleep(5000);
			//driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			//Thread.sleep(5000);
		     /// @@@@@@click table @@@@ ////
		//  Thread.sleep(5000);
		
		  
		
		    //MouseoverAction
		
		//Actions action = new Actions(driver);
		//Thread.sleep(5000);
		//WebElement element1 = driver.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
		//Thread.sleep(5000);
		//action1.moveToElement(element1).build().perform();
		//Thread.sleep(5000);
		//System.out.print("MOUSEOVER IS WORKING FINE");
		//Thread.sleep(3000);
		  // Logout
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	
	  
	 
		
		 
		  
		   /// print name //
		//List<WebElement> printname = driver.findElements(By.xpath("oxd-icon bi-check oxd-checkbox-input-icon"));
		//System.out.println(printname.size());
		//for (WebElement webElement : printname) {
		//	String name = webElement.getText();
			//System.out.println(name);
			
		//}
		
		//driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
		//Thread.sleep(5000);
		     ////@@@@@click icon @@@@  ////
		//driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(11).click();
		    ////@@@@@click delete icon  @@@@ ////
		//driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(11).click();
		//Thread.sleep(5000);
		   ////@@@@@popup deleted here  @@@@ ////
		//driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]")).click();
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
		
	  
	@SuppressWarnings("unused")
	private Action build() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterTest
	public void testcase3() {
    driver.close();
    
	}
	}
    
   
