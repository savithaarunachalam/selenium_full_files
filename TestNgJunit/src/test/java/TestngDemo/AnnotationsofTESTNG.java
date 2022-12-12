package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsofTESTNG {
	WebDriver driver;
	public String title;
	public String URL;
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.get("https://www.google.com");
	}
	@Test
	public void Login () {
		title = driver.getTitle();
        Assert.assertEquals("savitha","arunkmar");
	}
	@Test(priority=0,dependsOnMethods = "Apple",alwaysRun = true)
	public void main() {
		title = driver.getTitle();
	}
	@Test
	public void main1() {
		URL = driver.getCurrentUrl();
		
	}
    @AfterTest
    public void AT() {
    	driver.close();
    }
}
