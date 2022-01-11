package PageFactoryforPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id = "name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(id = "login")
	@CacheLookup
	WebElement btn_login;

	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver,this);
		// we can use both ----- PageFactory.initElements(driver, this);

	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);

	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLoginBtn() {
		btn_login.click();
	}
}
// Step 1- Create a class for each page
// Step 2- Create Locators for all objects to be used in that page using @FingBy annotation
// Step 3- Create methods or actions to be performed on those objects
// Step 4- Create constructor to get the driver instance and initialize the elements using method init Elements to maintain the same session of driver we need to pass the same driver instance
// Step 5- Update the test scripts to refer methods from Page Factory class