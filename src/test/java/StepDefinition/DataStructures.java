package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructures extends baseClass{
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    //launchBrowser();
	    driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	    
	}

	@When("User enters username")
	public void user_enters_username() {
		PageFactory.initElements(driver, this);
		rUserName.sendKeys("stunningninja");
		
		
	    
	}

	@When("User   enters Password")
	public void user_enters_password() {
		signPasswd.sendKeys("TestWeb@321");
	    
	}

	@When("User cliicks on Login Button")
	public void user_cliicks_on_login_button() {
		loginBtn.click();
	    
	}

	@Then("User redirects to {string} home page")
	public void user_redirects_to_home_page(String string) {
		PageFactory.initElements(driver, this);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, string);
		
	    
	}

	@Given("User Clicks on {string} Button on  {string}")
	public void user_clicks_on_button_on(String string, String string2) {
		DSGetStarted.click();
	    
	}

	@Then("The user should land in {string} Page")
	public void the_user_should_land_in(String string) {
		PageFactory.initElements(driver, this);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, string);
	    
	}

	@Given("User is on Data structures-Introduction page")
	public void user_is_on_data_structures_introduction_page() {
	    System.out.println("User is on Data Structures-Introduction page");
	    
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		DStimecomplexity.click();
	    
	}

	@Then("User will be redirected to {string} page")
	public void user_will_be_redirected_to_page(String string) {
		PageFactory.initElements(driver, this);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, string);
	    
	}

	@When("The user clicks {string} button on Time Complexity page")
	public void the_user_clicks_button_on_time_complexity_page(String string) {
		DSTryEditor.click();
	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		PageFactory.initElements(driver, this);
		
		
		/*
		 * new Actions(driver) .click(DSTryEditorTextBox).sendKeys("num1 = 15\r\n" +
		 * "num2 = 12\r\n" + "sum = num1 + num2\r\n" +
		 * "print(\"Sum of\", num1, \"and\", num2 , \"is\", sum)") .perform();
		 * 
		 * DSTryEditorRunBtn.click();
		 */
		readExcel();
		DSTryEditorRunBtn.click();
		
		screenshot("DSTryEditor");
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
	    
	}

	@Then("User should navigate back to previous page")
	public void user_should_navigate_back_to_previous_page() {
	    driver.navigate().back();
	    
	}

	@When("The user clicks the {string} link on left side of page")
	public void the_user_clicks_the_link_on_left_side_of_page(String string) {
	    
	    
	}

	@Then("The user should be redirected to {string} of Data structures-Introduction")
	public void the_user_should_be_redirected_to_of_data_structures_introduction(String string) {
		PageFactory.initElements(driver, this);
		
		DSPracticeQuestions.click();
		System.out.println(driver.getTitle());
	}

	@Then("User clicks Sign out")
	public void user_clicks_sign_out() {
		PageFactory.initElements(driver, this);
		hSignOut.click();
		//closeBrowser();
	}

}
