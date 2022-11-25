package Day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

		WebDriver driver=new ChromeDriver();
		
		@BeforeMethod
		public void setup() {
		driver.get("https://the-internet.herokuapp.com/upload");
		
		

		
		}
		
		@Test
		public void filedownload() throws InterruptedException, IOException {
			Actions action =  new Actions(driver);
			
			action.moveToElement(driver.findElement(By.id("file-upload"))).click().perform();
			
			Thread.sleep(1000);
			
			Runtime.getRuntime().exec("C:\\Users\\krusakha1\\Documents\\autoitscript.exe");	
			
			driver.findElement(By.id("file-submit")).click();
		}
		
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
		
	}


