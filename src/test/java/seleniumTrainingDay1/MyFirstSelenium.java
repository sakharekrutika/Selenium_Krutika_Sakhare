package seleniumTrainingDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSelenium {
		@Test
		public void MyFirstSelenium() {
	//public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
		driver.findElement(By.name("q")).sendKeys("Krutika",Keys.ENTER);
		//driver.findElement(By.name("q")).sendKeys("Krutika",Keys.ENTER);
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		driver.quit();

	}

}
