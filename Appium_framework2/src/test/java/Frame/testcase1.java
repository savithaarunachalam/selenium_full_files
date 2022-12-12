package Frame;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testcase1 extends Capabilities {
	@BeforeTest
	public void KillAllProcesses() throws InterruptedException, IOException   {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(8000);
		
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"//run.bat");
			Thread.sleep(10000);
		
		
	}
	@Test
	public void tc1() throws IOException  {
		service = startServer();
		AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
	

}
}

