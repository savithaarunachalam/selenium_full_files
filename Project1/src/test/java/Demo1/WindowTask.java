package Demo1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTask {
	        
			String URL= "https://www.youtube.com/";
			String Child_URL="https://demo.guru99.com/test/newtours/";
			String Parent_URL="https://www.amazon.in";
			String Sub_Parent_URL="https://www.google.com/" ;
		    String Sub_Child_URL="https://www.facebook.com/";
		    WebDriver driver;
		    
		   @BeforeTest
		   public void BT() throws InterruptedException {
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			   driver.get(URL);
			   driver.manage().window().maximize();   
		
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
}
		   @AfterTest
			public void testcase3() {
		    driver.quit();
		    
			}
}



