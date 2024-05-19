package excledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apr2024framework.common.WebDriverManager;

import org.testng.annotations.DataProvider;

import excledemo.ExcelUtils;

public class DataProviderWithExcel_001 {

	WebDriver driver;

	@BeforeTest

	public void beforeMethod() throws Exception {

		System.out.println("-----Before Class----");

		driver = WebDriverManager.getDriver();

		driver.get("https://phptravels.net/admin");

	}

	@Test(dataProvider = "Authentication")

	public void Registration_data(String sUserName, String sPassword) throws Exception {

		System.out.println(sUserName);

		System.out.println("Login Method");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(sUserName);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(sPassword);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Thread.sleep(3000);

		// System.out.println("Loggedin");
		
		

		//driver.findElement(By.id("dropdownUser1")).click();

		//driver.findElement(By.linkText("Logout")).click();
		
		

		/*
		 * try { System.out.println("Logged method");
		 * 
		 * // Logout
		 * 
		 * driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']"))
		 * .click(); } catch (Exception e) { // TODO: handle exception
		 * System.out.println(Thread.currentThread().getStackTrace()); }
		 */

	}

	@DataProvider

	public Object[][] Authentication() throws Exception {

		Object[][] testObjArray = ExcelUtils.getTableArray("E:\\eclipse-workspace\\PrathibhaSelenium\\TestData.xlsx",
				"Sheet1");

		return (testObjArray);

	}

	@AfterTest

	public void afterMethod() {

		driver.close();

	}

}