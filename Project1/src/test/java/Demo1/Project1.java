package Demo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1   {
	WebDriver driver;
	public static String url="https://demo.guru99.com/test/newtours/";
	String linkurl ;
	//start report
	//htmlReporter = new ExtentHtmlReporter("extend.html");
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	
	
	

	@BeforeTest
	public void BT()  {
		ExtentTest test = extent.createTest("MyFirstTest");
		test.pass("details");
		 htmlReporter = new ExtentHtmlReporter("extent.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	@Test
	public void testcase1() throws InterruptedException, IOException {
		Thread.sleep(3000);
		test = extent.createTest("this is my first test");
		
		driver.findElement(By.name("userName")).sendKeys("user");
		test.pass("user have entered the username");
		
		driver.findElement(By.name("password")).sendKeys("user");
		
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		// Using angartag
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// print total number of links 
		System.out.println("Total number of links:"+links.size());
		
		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText());
			 System.out.println(links.get(i).getAttribute("href"));
		 }
	
		URL url = new URL(linkurl);
		HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
		//httpURLConnect.setConnectTimeout(3000);
		httpURLConnect.connect();
		
		if(httpURLConnect.getResponseCode()==200)
		{
			System.out.println(linkurl+ " "+httpURLConnect.getResponseMessage());
		}
		
		if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+ " "+httpURLConnect.getResponseMessage() + "  " + HttpURLConnection.HTTP_NOT_FOUND);
			
		}
		
        test.info("user may able to the admin page");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("savitha");
		driver.findElement(By.name("lastName")).sendKeys("aruna");
		driver.findElement(By.name("phone")).sendKeys("8903402455");
		driver.findElement(By.name("userName")).sendKeys("savithaarunachalam@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("coimbatore");
		driver.findElement(By.name("city")).sendKeys("udumalpet");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("642205");
		Select S= new Select(driver.findElement(By.name("country")));
		S.selectByVisibleText("AUSTRIA");
		//driver.findElement(By.name("password")).sendKeys("savitha");
		//S.selectByIndex(6);
				
		driver.findElement(By.name("confirmPassword")).sendKeys("savitha");
		driver.findElement(By.name("submit")).click();

	}
	
    @AfterTest 
    public void AT () {
    	System.out.println(url);
    	String curl= driver.getCurrentUrl();
    	System.out.println(curl);
    	extent.flush();
    	driver.close();
    	
		
    	
    }
    	
    }




