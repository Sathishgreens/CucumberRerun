package org.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.FacebookPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	FacebookPOM pom;
	@Given("Facebook URL is Launched")
	@Given("Facebook Website is loaded")
	public void facebook_website_is_loaded() {
		browserLaunch("chrome");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loadUrl("https://www.facebook.com/");
		pom = new FacebookPOM();
	}
	@Given("User Enters UserName and Passwordsss")
	@When("User Enters UserName and Password")
	public void user_enters_user_name_and_password() {
		passValues(pom.getUserName(), "sathish");
		passValues(pom.getPassword(), "12345");
		
	}

	@When("User Enters UserName {string} and Password {string}")
	public void user_enters_user_name_and_password(String string, String string2) {
		passValues(pom.getUserName(), string);
		passValues(pom.getPassword(), string2);
	}

	@When("User Enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		passValues(pom.getUserName(), string);
		passValues(pom.getPassword(), string2);
	}
	//1D without Header
	@When("User Enters userName and password")
	public void user_enters_user_name_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		
		passValues(pom.getUserName(), asList.get(0));
		passValues(pom.getPassword(), asList.get(1));
	}

	
	@When("User Enters userName and password 1D with Heading")
	public void user_enters_user_name_and_password_1d_with_heading(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		
		passValues(pom.getUserName(), asMap.get("UserName2"));
		passValues(pom.getPassword(), asMap.get("Password2"));
	}


	
	@When("User Enters userName and password 2D without Heading")
	public void user_enters_user_name_and_password_2d_without_heading(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();
		List<String> list1 = asLists.get(0);
		List<String> list2 = asLists.get(1);
		
		passValues(pom.getUserName(), list1.get(2));
		passValues(pom.getPassword(), list2.get(2));
	}

	
	@When("User Enters userName and password 2D with Heading")
	public void user_enters_user_name_and_password_2d_with_heading(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map2 = asMaps.get(1);
		
		passValues(pom.getUserName(), map2.get("UserName"));
		passValues(pom.getPassword(), map2.get("Password"));
		//Assert.assertTrue(false);
	}

	@When("User Clicks Login Button")
	public void user_clicks_login_button() {
		elementClick(pom.getLogin());
	}

	@Then("Take Scrrenshot")
	public void take_scrrenshot() throws IOException {
	    screnshot(new File("C:\\Users\\Lenovo\\eclipse-workspace\\"
	    		+ "CucumberPractice\\target\\screenshot.png"));
	}


	@Then("Click Login")
	public void click_login() {
		elementClick(pom.getLogin());
	}

	@Given("User Clicks Forgot Password")
	public void user_clicks_forgot_password() {
	    WebElement findElement = findElement("linktext", "Forgotten password?");
	    elementClick(findElement);
	}


	
	@Given("Given Statement one")
	public void given_statement_one() {
	   System.out.println("Given 1");
	}
	@When("When Statement one")
	public void when_statement_one() {
	    System.out.println("When 1");
	}
	@Then("Then Statement one")
	public void then_statement_one() {
		 System.out.println("Then 1");
	}

	
	@Given("Given Statement two")
	public void given_statement_two() {
		 System.out.println("Given 2");
	}
	@When("When Statement two")
	public void when_statement_two() {
		 System.out.println("When 2");
	}
	@Then("Then Statement two")
	public void then_statement_two() {
		 System.out.println("Then 2");
	}


	@Given("Background Given")
	public void background_given() {
	    System.out.println("BackGround Given");
	}



}
