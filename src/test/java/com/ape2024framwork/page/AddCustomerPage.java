package com.ape2024framwork.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
	
	private WebDriver driver;
	 
	 // Constructor
	 public AddCustomerPage(WebDriver driver) {
	     this.driver = driver;
	 }
	 
	 // Web Elements
	 By usernameField = By.id("username");
	 By passwordField = By.id("password");
	 By loginButton = By.id("loginButton");
	 
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
