package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.out.println("Running Before Method-Creating browser session");
		driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("Running after method-Browser session close");
	}
	
	@Test
	public void verifywithoutusernamepassword() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Username cannot be empty']"));
		Assert.assertTrue(ele.isDisplayed());
		
	}
	
	@Test
	public void verifywithinvalidusername() {
		
		WebElement f=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		f.sendKeys("hwdihai");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Password cannot be empty']"));
		
		Assert.assertTrue(ele.isDisplayed());
		f.clear();
	}
	
	@Test
	public void verifywithinvalidpassword() {
		
		WebElement f=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		f.sendKeys("hwdihai");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Username cannot be empty']"));
		
		Assert.assertTrue(ele.isDisplayed());
		f.clear();
	}
	
	@Test
	public void verifywithinvalidusernameandpassword() {
		
		WebElement f=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		f.sendKeys("hwdihai");
		WebElement d=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		d.sendKeys("hffcj");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
		Assert.assertTrue(ele.isDisplayed());
		//f.clear();
		//d.clear();
	}
	
}
