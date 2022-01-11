package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchFunctionality {
	
	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Inside Step-Browser is open ");
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://www.google.com");
		System.out.println("user is on google search page ");
		
	}

	@When("User enters a text in the search box")
	public void user_enters_a_text_in_the_search_box() {
		
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		System.out.println("User enters a text in the search box ");
		
	}

	@And("clicks on Searh button")
	public void clicks_on_searh_button() {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("clicks on Searh button");
	}

	@Then("user is navigated to the search results page")
	public void user_is_navigated_to_the_search_results_page() {
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
		System.out.println("user is navigated to the search results page ");
		
	}

}
