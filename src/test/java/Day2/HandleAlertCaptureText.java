package Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertCaptureText {
	@Test
	public void handlealertcapture() throws InterruptedException {

	//public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        
        driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
        Assert.assertTrue(driver.getCurrentUrl().contains("seleniumpractise"));
        
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        
        //Alert alt = wait.until(ExpectedConditions.alertIsPresent());

        for(int i=0;i<20;i++) {
			try 
			{
				Alert alt = driver.switchTo().alert();
				String msg=alt.getText();
				if(msg.contains("Selenium"))
				{
					System.out.println("TestPassed");
					alt.accept();				}
				else{
					System.out.println("Test failed");
				}
			}
			catch (NoAlertPresentException e) {
				System.out.println("Waiting for WebElement");
				Thread.sleep(1000);
			}
			
			
		}
        driver.quit();
	}
}


