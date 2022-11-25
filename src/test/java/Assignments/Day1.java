package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();        
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        
        driver.get("http://137.184.76.209/orangehrm-4.9");
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement ele= driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        WebElement ele1= driver.findElement(By.xpath("//a[contains(text(),'User Management')]"));
        action.moveToElement(ele1).perform();
        driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
        driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Mukesh Otwani");
        driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("prraajesh@123");
        driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("PRajesh@123");
        driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("PRajesh@123");
        driver.findElement(By.xpath("//input[@name='btnSave']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("prraajesh@123");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("PRajesh@123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        
        
        
        
		

	}

}
