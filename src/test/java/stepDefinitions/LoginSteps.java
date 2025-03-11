package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	  WebDriver driver;


	  @Given("I am on the login page")
	  public void i_am_on_the_login_page() {
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  @When("I enter valid credentials to check")
	  public void i_enter_valid_credentials_to_check() {
	     
		  driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
	  }
	  @When("I click the login button")
	  public void i_click_the_login_button() throws InterruptedException {
		  driver.findElement(By.className("orangehrm-login-button")).click();
			Thread.sleep(3000);
	  }
	  @Then("I should be redirected to the dashboard website")
	  public void i_should_be_redirected_to_the_dashboard_website() {
	    
		  WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
			
			Assert.assertTrue(ele.isDisplayed(), "You are redirected to the correct page ");
			
			driver.quit();
	  }



	}

