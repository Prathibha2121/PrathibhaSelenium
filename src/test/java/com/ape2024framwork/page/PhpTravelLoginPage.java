package src.test.java.com.ape2024framwork.page;



public class PhpTravelLoginPage {

	private WebDriver driver;

// Constructor	
public PhpTravelLoginPage (WebDriver driver) {
		this.driver = driver;
	}


// Web Elements

By UsernameField= By.name("email"));
By PasswordField= By.name("password"));
By LoginButton= By.xpath("//button[@type='submit']");
By SuperAdminLink= By.xpath("(//a[normalize-space()='Super Admin'])[1]");
By Logout = By.linkText("Logout");


// Actions
public void enterUsername(String username) {
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(sUserName);
}

public void enterPassword(String password) {
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(sPassword);
}

public void clickLoginButton() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

public void clickSuperAdminLink() {
	driver.findElement(By.xpath("(//a[normalize-space()='Super Admin'])[1]")).click();
}

public void clickLogoutButton() {
	driver.findElement(By.linkText("Logout")).click();
}

}

	