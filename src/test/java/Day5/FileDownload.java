package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownload {
	
	WebDriver driver=new ChromeDriver();
	
	@BeforeMethod
	public void setup() {
	driver.get("https://the-internet.herokuapp.com");

	
	}
	
	@Test
	public void filedownload() {
		driver.findElement(By.xpath("//a[text()='File Download']")).click();
		
	}
	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
}
