package com.example.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	  WebDriver driver;

	    @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        driver = new ChromeDriver();
	        driver.get("https://example.com/login");
	    }

	    @When("I enter valid credentials to check")
	    public void i_enter_valid_credentials_to_check() {
	        // Enter username and password
	    }

	    @And("I click the login button")
	    public void i_click_the_login_button() {
	        // Click the login button
	    }

	    @Then("I should be redirected to the dashboard website")
	    public void i_should_be_redirected_to_the_dashboard_website() {
	        // Verify redirection to the dashboard
	    }
	}

