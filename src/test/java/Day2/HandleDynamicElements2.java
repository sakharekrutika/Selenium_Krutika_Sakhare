package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDynamicElements2 {
		@Test
		public void dynamic() {
		
	//public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		Assert.assertTrue(driver.getCurrentUrl().contains("seleniumpractise"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sapient");
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
//		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//		WebElement e= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input [@id= 'passnew']")));
		
		driver.findElement(By.xpath("//input [@id= 'passnew']")).sendKeys("Akash");
	    //e.sendKeys("Akash");
	    driver.quit();
	    
	    
	}

}
