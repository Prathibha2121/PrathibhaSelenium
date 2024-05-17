package com.apr2024framework.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WebDriverManager.java
public class WebDriverManager {

	private static WebDriver driver;

	private WebDriverManager() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			// Initialize WebDriver (e.g., ChromeDriver)
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
