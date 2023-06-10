package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps2 {

	WebDriver driver;

	@Given("^user navigates to sauce labs$")
	public void sauceDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasth\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
		driver.findElement(By.id("user-name")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		driver.findElement(By.id("login-button")).click();

	}
	//assertion 
	
	
	
	@Then("^login should be unsuccessful$")
	public void validateRelogin() {
		System.out.println(driver.getTitle());
	//	WebElement logo = driver.findElement(By.cssSelector("div[class='app_logo']"));
	//	Assert.assertEquals("Swag Labs", logo.getText());
		if (driver.getTitle() == "Swag Labs") {
			System.out.println("test case pass");

		}
	}

}
