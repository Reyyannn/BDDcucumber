package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	ChromeDriver driver;

	@Given("I am on sauce lab login page")
	public void i_am_on_sauce_lab_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	}

	@Given("I enter usrename")
	public void i_enter_usrename() {
		driver.findElementByCssSelector("#user-name").sendKeys("standard_user");
	}

	@Given("I enter password")
	public void i_enter_password() {
		driver.findElementByCssSelector("#password").sendKeys("secret_sauce");
	}

	@Given("I click on login button")
	public void i_click_on_login_button() {
		driver.findElementByCssSelector("#login-button").click();
	}

	@Then("I will be navigated to dashboard")
	public void i_will_be_navigated_to_dashboard() {
		driver.findElementByCssSelector(".app_logo").isDisplayed();
	}

}
