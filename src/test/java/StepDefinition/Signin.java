package StepDefinition;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.LoggerLoad;

public class Signin extends baseClass {
	
	
	
	
	@Given("The user opens Sign in Page")
	public void the_user_opens_sign_in_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/login");
     	PageFactory.initElements(driver, this);
		hSignIn.click();
		
	    
	}

	@When("User enters username {string} and passord {string} and user clicks on Login Button")
	public void user_enters_username_and_passord_and_user_clicks_on_login_button(String string, String string2) {
		PageFactory.initElements(driver, this);
		rUserName.sendKeys(string);
		signPasswd.sendKeys(string2);
		loginBtn.click();
		PageFactory.initElements(driver, this);
	    
	}

	/*
	 * @Then("verify the {string} in the step") public void
	 * verify_the_in_the_step(String string) { System.out.println(string);
	 * 
	 * assertEquals(string, string);
	 * 
	 * 
	 * 
	 * }
	 */
	

	
	/*
	 * @Then("user will be redirected to home page with message {string}") public
	 * void user_will_be_redirected_to_home_page_with_message(String string) {
	 * System.out.println(hAlertMsg.getText()); assertEquals(hAlertMsg.getText(),
	 * string);
	 * 
	 * }
	 * 
	 * 
	 * @Then("user clicks sign out if {string} is success") public void
	 * user_clicks_sign_out_if_is_success(String string) {
	 * 
	 * hSignOut.click();
	 * 
	 * closeBrowser(); LoggerLoad.info("info - user signed out successfully");
	 * 
	 * }
	 */
	
	@Then("user will be redirected to home page with message {string} and user clicks sign out if {string} is {string}")
	public void user_will_be_redirected_to_home_page_with_message_and_user_clicks_sign_out_if_is(String confirmation, String status, String success) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(status);
		
		
		
		String messageStr = rUserName.getAttribute("validationMessage");
		String messageStr1 = signPasswd.getAttribute("validationMessage");
		String messageStr2 = hAlertMsg.getAttribute("validationMessage");
		
		if (status==messageStr) {
			
		}
		
		
	}
	
	@Then("verify the {string} from {string} and if user redirected to home page with message {string} then user clicks sign out")
	public void verify_the_from_and_if_user_redirected_to_home_page_with_message_then_user_clicks_sign_out(String status, String identifier, String success) {
		
		String actualStatus = "";
		switch(identifier) {
		case "USER_NAME" :
			actualStatus = rUserName.getAttribute("validationMessage");
			LoggerLoad.warn("warning - user not able to login"+actualStatus);
			break;
		case "PASSWORD" :
			actualStatus = signPasswd.getAttribute("validationMessage");
			LoggerLoad.warn("warning - user not able to login"+actualStatus);
			break;
		case "ALERT" :
			actualStatus = hAlertMsg.getText();
			LoggerLoad.warn("warning - user not able to login"+actualStatus);
			break;
		default :
			break;
			
		}
		assertEquals(actualStatus, status);
		if(status.equals(success /*hAlertMsg.getText()*/) ) {
			hSignOut.click();
			//closeBrowser(); 
			LoggerLoad.info("info - user signed out successfully");
			return;
		}
	}

}
