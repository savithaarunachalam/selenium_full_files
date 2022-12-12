package TestngDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	

		WebDriver driver;
		public String title;
		public String URL;
		@Before
		public void BT()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
			driver.get("https://www.google.com");
		}
		
        
       @Test
       public void Apple() {
    	   title = driver.getCurrentUrl();
    	   
       }
        @Test
        public void Bat() {
        	System.out.println(title +URL);
        }
      @After
      public void  AT() {
    	  driver.close();
      }
}

