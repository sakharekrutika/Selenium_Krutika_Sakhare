package Day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class BrowserStack {

	WebDriver driver;
	@org.testng.annotations.Parameters({"os","osVersion","browser","browserVersion"})
	@BeforeMethod
	public void setup(String os,String osVersion,String browser,String browserVersion) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("browserVersion", browserVersion);
		capabilities.setCapability("os", os);
		capabilities.setCapability("osVersion", osVersion);
		
		
		URL url = null;
		
		try {
			url=new URL("https://krutikasakhare_O4RmPJ:hdusE8qyFyBYEUaAcN9p@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new RemoteWebDriver(url,capabilities);

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void test() {
		driver.get("https://www.amazon.in/");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
	}

}
