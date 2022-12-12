package Demo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  extends Demo31{
public static void flash(WebElement element,WebDriver driver) {  // flash method
		
		String bgcolor= element.getCssValue("backgroundColor");//gives the background color of the element
		
		for(int i=0; i<500; i++) {  // change the background color multiple times
			changeColor("#000000",element,driver);  //#000000 -> This represent black
			changeColor(bgcolor,element,driver);  // change to it's original color
		}	
		}
		public static void changeColor(String color,Object web ,WebDriver driver1) {
			JavascriptExecutor js= ((JavascriptExecutor)driver1);
			
			js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", web);
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				
			}
		}
		public static void drawBorder(Object web, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}
	}

