package excledemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apr2024framework.common.WebDriverManager;

import org.testng.annotations.DataProvider;

import excledemo.ExcelUtils;

public class DataProviderWithExcel_001 {

	WebDriver driver;

	@BeforeClass

	public void beforeMethod() throws Exception {

		System.out.println("-----Before Class----");

		driver = WebDriverManager.getDriver();

		driver.get("https://phptravels.net/admin");

	}

	@Test(dataProvider = "Authentication")

	public void Registration_data(String sUserName, String sPassword) throws Exception {

		System.out.println(sUserName);

		System.out.println("Login Method Started");
		// Login

		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(sUserName);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(sPassword);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[normalize-space()='Super Admin'])[1]")).click();

		driver.findElement(By.linkText("Logout")).click();

	}

	@DataProvider

	public Object[][] Authentication() throws Exception {

		Object[][] testObjArray = ExcelUtils.getTableArray("E:\\eclipse-workspace\\PrathibhaSelenium\\TestData.xlsx",
				"Sheet1");

		return (testObjArray);

	}

	@AfterClass

	public void afterMethod() {

		driver.close();

	}

}