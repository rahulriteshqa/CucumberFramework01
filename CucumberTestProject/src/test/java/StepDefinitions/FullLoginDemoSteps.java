/*
 * package StepDefinitions;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.*;
 * 
 * public class FullLoginDemoSteps {
 * 
 * WebDriver driver=null;
 * 
 * @Given("browser is open") public void browser_is_open() {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe"
 * );
 * 
 * driver= new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 * 
 * }
 * 
 * @And("user is on login page") public void user_is_on_login_page() {
 * 
 * driver.get("https://example.testproject.io/web/");
 * 
 * }
 * 
 * @When("^user enters (.*) and (.*)$") public void
 * user_enters_username_and_password(String username, String password) {
 * 
 * driver.findElement(By.id("name")).sendKeys(username);
 * driver.findElement(By.id("password")).sendKeys(password);
 * 
 * 
 * }
 * 
 * @And("user clicks on login button") public void user_clicks_on_login_button()
 * { driver.findElement(By.id("login")).click(); }
 * 
 * @Then("user is navigated to the homepage after login") public void
 * user_is_navigated_to_the_homepage_after_login() throws InterruptedException {
 * 
 * driver.findElement(By.id("logout")).isDisplayed(); Thread.sleep(5000);
 * driver.close(); driver.quit();
 * 
 * }
 * 
 * }
 */