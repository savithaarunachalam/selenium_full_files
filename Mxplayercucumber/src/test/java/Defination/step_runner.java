package Defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_runner {
	
	String url = "https://www.mxplayer.in/";
	WebDriver driver;
	

	@Given("I should go to the hindi movies")
	public void i_should_go_to_the_hindi_movies() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	   
	}
	@Then("I should go movies")
	public void i_should_go_movies() throws InterruptedException {
		//movies
		
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/a/span")).click();
	    Thread.sleep(6000);
	    
	    
	}
	@Then("Click on hindi movies")
	public void click_on_hindi_movies() throws InterruptedException {
		//hindi
		
	    driver.findElement(By.xpath("//*[@id='app']/header/div/ul/div[3]/ul/li[3]/a")).click();
	    Thread.sleep(6000);
	    
	}
	@Then("Click on crime movies")
	public void click_on_crime_movies() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/a[1]/div")).click();
		Thread.sleep(6000);
	    
	}
	@Then("Click on comedy movies")
	public void click_on_comedy_movies() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='app']/section/div/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(6000);
	}
}
