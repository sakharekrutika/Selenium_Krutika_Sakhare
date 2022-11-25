package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumCalender {
	@Test
		public void calender() {
	//public static void main(String[] args) {
		//Task 1 Select Date 25 without loop
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Assert.assertTrue(driver.getCurrentUrl().contains("seleniumpractise"));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.quit();
//		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		//Task 2 Select Date 26 with loop with xpath
		//List <WebElement> dates=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		//for(WebElement ele:dates) {

		}
		//Task 3- Select JavaScript From Dropdown using xpath and loop
		
		
		
		
		
		//Task 4 -Select CSS From Dropdown using 2 clicks
	

	}


