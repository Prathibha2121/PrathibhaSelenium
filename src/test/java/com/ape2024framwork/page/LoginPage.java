package com.ape2024framwork.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//LoginPage.java
public class LoginPage {
	private WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Web Elements
	By usernameField = By.name("email");
	By passwordField = By.name("password");
	By loginButton = By.xpath("//button[@type='submit']");

	// Actions
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
