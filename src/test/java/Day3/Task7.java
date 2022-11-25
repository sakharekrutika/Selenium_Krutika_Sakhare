package Day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task7 {
	
	
	@Test
	public void task() {

	//public static void main(String[] args) throws InterruptedException {
		// Task 7- Login Create Category and Delete Category Signout
		//Check 1- Category should be added
		//Check 2- Category should be deleted
		WebDriver driver = new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        
        driver.get("https://ineuron-courses.vercel.app/login");
        Assert.assertTrue(driver.getCurrentUrl().contains("vercel.app"));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("ineuron@ineuron.ai");
        
        driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("ineuron");
        
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        
        
        WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Manage')]"));
        
        Actions action = new Actions(driver);
        
        action.moveToElement(ele).perform();
        
        driver.findElement(By.xpath("//span[text()='Manage Categories']")).click();
        
        Set<String> allWindows=driver.getWindowHandles();
		
		List<String> lst=new ArrayList<String>(allWindows);
		
		String first=lst.get(1);
		
		driver.switchTo().window(first);
		
		driver.findElement(By.xpath("//button[contains(text(),'Add New Category')]")).click();
		
		Alert alt=	driver.switchTo().alert();
		
		alt.sendKeys("Krutika Sakhare");
		alt.accept();
		
		driver.findElement(By.xpath("//td[text()='Krutika Sakhare']//following::button[1]")).click();	
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();	
		
		driver.findElement(By.xpath("//*[text()=")).click();
		driver.quit();	
        
       

	}

}
