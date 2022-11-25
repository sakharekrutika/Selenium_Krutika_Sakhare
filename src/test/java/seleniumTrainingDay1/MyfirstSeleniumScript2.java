package seleniumTrainingDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyfirstSeleniumScript2 {
	@Test
	
	public void myfirstSelenium() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("vercel.app"));
		//WebElement username = driver.findElement(By.name("email1"));
		//username.sendKeys("SapientTraining@gmail.com");
		//driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		//driver.findElement(By.className("submit-btn")).click();
//		driver.findElement(By.xpath("//tagname[@attribute='value']))
		driver.findElement(By.linkText("New user? Signup")).click();
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Krutika");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("krutikasakhare20@gmail.com");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("kruti@2000");
		WebElement interests=driver.findElement(By.xpath("//label[text()='Testing']"));
		interests.click();
		Thread.sleep(3000);
		WebElement gender=driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		WebElement statedropdown=driver.findElement(By.id("state"));
		Select state = new Select(statedropdown);
		state.selectByIndex(2);
		Thread.sleep(3000);
		state.selectByValue("Rajasthan");
		Thread.sleep(3000);
		List<WebElement> allvalues = state.getOptions();
		for(WebElement ele:allvalues) {
			if(ele.getText().equalsIgnoreCase("Rajasthan")) {
			break;
			}
			System.out.println(ele.getText());
		}
		driver.quit();
		}

}
