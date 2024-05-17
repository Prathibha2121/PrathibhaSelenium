package com.apr2024framework.script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ape2024framwork.page.LoginPage;
import com.apr2024framework.common.WebDriverManager;

//LoginTest.java
public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;

	@BeforeClass
	public void setUp() {
		driver = WebDriverManager.getDriver();
		loginPage = new LoginPage(driver);
	}

	@Test
	public void testLogin() {
		driver.get("https://www.phptravels.net/admin");
		loginPage.enterUsername("admin@phptravels.com");
		loginPage.enterPassword("demoadmin");
		loginPage.clickLoginButton();

		// Add assertions to verify login success
	}

	@AfterClass
	public void tearDown() {
		WebDriverManager.closeDriver();
	}
}
