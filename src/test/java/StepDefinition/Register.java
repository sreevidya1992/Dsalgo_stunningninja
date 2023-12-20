package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseclass.baseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register extends baseClass {
	
	//public static WebDriver driver;
    //String url="https://dsportalapp.herokuapp.com/register";
	
	@FindBy (xpath="//input[@value='Register']") WebElement registerBtn;
	
	@FindBy (id="id_password2") WebElement rConfirmationPasswd;
	@FindBy (xpath="//div [contains(text(), \"password_mismatch\")]") WebElement registerFailMsg;
	@FindBy (xpath="/html/body/div[2]") WebElement registersuccessMsg;
	

		
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/register");
		System.out.println("user is on register page");
		//PageFactory.initElements(driver, this);
	}

	@When("The user enters with all fields empty")
	public void the_user_enters_with_all_fields_empty() {
		PageFactory.initElements(driver, this);
	}

	@When("User Clicks on Register Button")
	public void user_clicks_on_register_button() {
		registerBtn.click();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		//WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = rUserName.getAttribute("validationMessage");
		System.out.println("Username must enter: " + messageStr);
		assertEquals(messageStr, string);
	}

	@When("The user enters  Username  field and with other fields empty")
	public void the_user_enters_username_field_and_with_other_fields_empty(DataTable dataTable) {
	    //List<List<String>> logindetails=dataTable.asLists(String.class);
	    for(Map<String,String> e:dataTable.asMaps(String.class,String.class)) {
	    	rUserName.sendKeys(e.get("Username"));
	    	rPasswd.sendKeys(e.get("Password"));
	    	rConfirmationPasswd.sendKeys(e.get("Password Confirmation"));
	    	
	    }
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
		String messageStr = rPasswd.getAttribute("validationMessage");
		System.out.println("Password must enter: " + messageStr);
		assertEquals(messageStr, string);
	}

	@When("The user enters Username and Password with Password Confirmation field empty")
	public void the_user_enters_username_and_password_with_password_confirmation_field_empty(DataTable dataTable) {
		for(Map<String,String> e:dataTable.asMaps(String.class,String.class)) {
	    	rUserName.sendKeys(e.get("Username"));
	    	rPasswd.sendKeys(e.get("Password"));
	    	rConfirmationPasswd.sendKeys(e.get("Password Confirmation"));
	    	
	    }
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
		String messageStr = rConfirmationPasswd.getAttribute("validationMessage");
		System.out.println("Confirm Password must enter: " + messageStr);
		assertEquals(messageStr, string);
	}

	@When("The user enters Username and different passwords in Password and Password Confirmation fields")
	public void the_user_enters_username_and_different_passwords_in_password_and_password_confirmation_fields(DataTable dataTable) {
		for(Map<String,String> e:dataTable.asMaps(String.class,String.class)) {
	    	rUserName.sendKeys(e.get("Username"));
	    	rPasswd.sendKeys(e.get("Password"));
	    	rConfirmationPasswd.sendKeys(e.get("Password Confirmation"));
	    	
	    } 
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	   String msg=registerFailMsg.getText();
	   assertEquals(msg, string);
	}

	@When("The user enters a Username and Password and Password Confirmation with only numbers")
	public void the_user_enters_a_username_and_password_and_password_confirmation_with_only_numbers(DataTable dataTable) {
		for(Map<String,String> e:dataTable.asMaps(String.class,String.class)) {
	    	rUserName.sendKeys(e.get("Username"));
	    	rPasswd.sendKeys(e.get("Password"));
	    	rConfirmationPasswd.sendKeys(e.get("Password Confirmation"));
	    	
	    }
	}

	@When("The user enters valid Username and Password with Password Confirmation")
	public void the_user_enters_valid_username_and_password_with_password_confirmation(DataTable dataTable) {
		for(Map<String,String> e:dataTable.asMaps(String.class,String.class)) {
	    	rUserName.sendKeys(e.get("Username"));
	    	rPasswd.sendKeys(e.get("Password"));
	    	rConfirmationPasswd.sendKeys(e.get("Password Confirmation"));
	    	
	    }
	}
	

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		String msg=registersuccessMsg.getText();
		   assertEquals(msg, string);
		   
		   
	}
	
	


	
}