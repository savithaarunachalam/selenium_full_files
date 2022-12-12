package Extentreport;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newguru {
	
	public static String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	  ExtentHtmlReporter htmlReporter;
	  ExtentReports extent;
	  ExtentTest test;
	  
	
	@BeforeTest
	public void test1 ()  {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		// ExtentTest test = extent.createTest("My First Test");
		// test.pass("details");
		 htmlReporter = new ExtentHtmlReporter("extent.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
		
		//something.assertAll();
		
	}
	
	@Test
	public void testcase1() throws InterruptedException, IOException {
		Thread.sleep(3000);
		SoftAssert savi = new SoftAssert();
		test = extent.createTest("this is my first test");
		driver.findElement(By.name("userName")).sendKeys("user");
		test.pass("user have entered the username");
		driver.findElement(By.name("password")).sendKeys("user");
		test.pass("password entered");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		test.info("logged in successfully");
		String k = driver.getTitle();
		savi.assertEquals(k, "Welcome:Mercury Tours");
	}
	
    @AfterTest 
    public void AT () {
    	driver.close();
    	extent.flush();
    }
    	
    }

