package com.apr2024framework.script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ape2024framwork.page.AddCustomerPage;
import com.ape2024framwork.page.LoginPage;
import com.apr2024framework.common.WebDriverManager;

public class AddCustomerTest {
    WebDriver driver;
    LoginPage loginPage;
    AddCustomerPage addCustomerPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        loginPage = new LoginPage(driver);
       // loginPage.login("admin", "password"); // Assuming login method is implemented in LoginPage class
        addCustomerPage = new AddCustomerPage(driver);
    }

    @Test
    public void testAddCustomer() {
     //   addCustomerPage.navigateToAddCustomerPage();
     //   addCustomerPage.enterCustomerDetails("John Doe", "john@example.com", "New York");
     //   addCustomerPage.clickSaveButton();

        // Add assertions to verify customer added successfully
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.closeDriver();
    }
}
