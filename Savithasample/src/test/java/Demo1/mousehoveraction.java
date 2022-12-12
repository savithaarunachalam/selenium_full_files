package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehoveraction {
	public static WebDriver driver;
	@BeforeTest
	public void testcase () {
		
	
	
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		String url = "https://en.wikipedia.org";
		
		driver.navigate().to(url);
		driver.manage().window().maximize();

}
	@Test(priority = 0)
	public void testcase1() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement main = driver.findElement(By.linkText("View source"));
		action.moveToElement(main);
		action.click().build().perform();
		
		
	}
	
	}
