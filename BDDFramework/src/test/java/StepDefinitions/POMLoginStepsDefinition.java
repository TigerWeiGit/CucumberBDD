package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class POMLoginStepsDefinition {
/*
	WebDriver driver;
	loginPage login;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com");
	}

//	@When("User enters valid username and password")
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String pwd) throws InterruptedException {

		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(pwd);
		
		//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickLogin();
//		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		login.isAppLogoDisplayed();
//		Assert.assertTrue(driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]")).size()>1, "Verify User is navigated to Home Page");
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
	*/
}
