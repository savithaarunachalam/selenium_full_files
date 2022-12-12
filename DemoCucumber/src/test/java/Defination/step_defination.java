package Defination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_defination {
	
	
	String url = "https://demoapp.skillrary.com/login.php?type=login";
	WebDriver driver;
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}

	@And("Enter the email {string}")
	public void enter_the_email(String string) {
	   // JavascriptExecutor js = ((JavascriptExecutor)driver);
	    //js.executeScript("document.getElementById('email').value=Admin");
	    driver.findElement(By.name("email")).sendKeys(string);
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) {
		//JavascriptExecutor js = ((JavascriptExecutor)driver);	
        // js.executeScript("document.getElementById('password').value=admin");
         driver.findElement(By.name("password")).sendKeys(string);
 	    
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("document.getElementById('last').click()");
	    
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) { 
		//driver.findElement(By.name("//*[@class='user-image']")).click();
		Assert.assertEquals(driver.getTitle(),string);
	    
	}
	@And("Click on the username")
	public void click_on_the_username() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//arunk//Desktop//selenium//Homepage.png"));
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		//driver.findElement(By.linkText("SkillRary Admin"));
		driver.findElement(By.xpath("//*[@class='hidden-xs']")).click();
	
	}
	@And("Click on the signout")
	public void click_on_the_signout() {
		driver.findElement(By.linkText("Sign out"));
	    
	}
	@Then("I should go skillary homepage as\"Skillary Courses\"")
	public void i_should_go_skillary_homepage_as_skillary_courses() {
		//driver.findElement(By.linkText("HOME"));
		driver.close();

	}
	
}
