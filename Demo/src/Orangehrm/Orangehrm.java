package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
	public static String  url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private static Object beforeLogin;
	WebDriver driver;

	public static void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//arunk//Desktop//arun//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		//Thread.sleep(5000);
		//String beforeLogin =  driver.getTitle();
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // driver.findElement(By.linkText("Reports")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu']")).click();
		driver.findElement(By.linkText("Admin")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu']")).click();
		
			
		//driver.findElement(By.xpath("//*[@class=' oxd-main-menu']/li[10]/a");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']/ul/li[1]")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu']")).click();driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(""
		Thread.sleep(3000);
		String afterlogin= driver.getTitle();
		if(beforeLogin.equals(afterlogin)) {
			//Then logout
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	        Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		   System.out.print("The title of the page is same here");
		  
		}
		//else {
			System.out.print("The title of the page is not same here");
		
		}
		
	}
