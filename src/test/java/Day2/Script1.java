package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Script1 {
	@Test
	public void script() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		Thread.sleep(3000);
		List <WebElement> allelements= driver.findElements(By.xpath("//div[@role='option']"));
		for(WebElement ele:allelements) {
	            String str= ele.getText();
	            System.out.println(str);
	            
	            if(str.contains("github")) {
	                ele.click();
	                break;
	            }
	        }
		driver.quit();
		}

}
