package Day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://ineuron-courses.vercel.app/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void teardown() {
		//driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		driver.quit();
	}
	
	@Test(dataProvider = "Login Details")
	public void test(String email,String password) {
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		WebElement ele=driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]"));
		Assert.assertTrue(ele.isDisplayed());
		//WebElement ele1=driver.findElement(By.xpath("//button[contains(text(),'Sign Out')]"));
		//Assert.assertTrue(ele1.isDisplayed());
		
	}
	
	
	
//	@DataProvider(name="Login Details")
//	public Object[][] testDataProvider(){
//		Object [][]arr=new Object[4][2];
//		
//		arr[0][0]="sample9@gmail.com";
//		arr[0][1]="Mukesh1234";
//		arr[1][0]="samplemukesh@gmail.com";
//		arr[1][1]="Mukesh1234";
//		arr[2][0]="samplemukesh1@gmail.com";
//		arr[2][1]="Mukesh1234";
//		arr[3][0]="samplemukesh2@gmail.com";
//		arr[3][1]="Mukesh1234";
//		return arr;
//	}
	
	@DataProvider(name="Login Details")
	public Object testDataProvider() throws FileNotFoundException, IOException{
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\krusakha1\\Desktop\\New folder (2)\\SapientTestData.xlsx")));
		int row=wb.getSheet("sheet1").getPhysicalNumberOfRows();
		int column=wb.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr=new Object[row][column];
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
			}
		}
		return arr;
		
}
}
