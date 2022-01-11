package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM {

	WebDriver driver;
	
	By text_username_login = By.id("name");
	By text_password_login = By.id("password");
	By btn_login_login = By.id("login");
	By btn_logout =By.id("logout");

	
	
	public LoginPage_POM(WebDriver driver) {
		
		this.driver = driver;
		if(!driver.getTitle().equals("TestProjectDemo")) {
			
			throw new IllegalStateException("This is not Login Page!!!!!!! The Current page is "+driver.getCurrentUrl());
			
		}
	}

	public void enterUsername(String username) {

		driver.findElement(text_username_login).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(text_password_login).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login_login).click();
	}
	
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void validLogin(String username, String password) {
		driver.findElement(text_username_login).sendKeys(username);
		driver.findElement(text_password_login).sendKeys(password);
		driver.findElement(btn_login_login).click();
		
	}
}

