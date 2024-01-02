package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclass.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends baseClass {
	@FindBy (xpath="//a[text()='Data Structures']") WebElement hDataStructersDD;
	
	//@FindBy (xpath="//a[text()='Sign in']") WebElement hSignIn;
	@FindBy (xpath="//a[text()=' Register ']") WebElement hRegister;
	
	
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		launchBrowser();
		
		PageFactory.initElements(driver, this);
		
        
		
		
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) {
		
		hDataStructersDD.click();
		
	    
	}

	@Then("User should see {int} different data structure entries in that dropdown")
	public void user_should_see_different_data_structure_entries_in_that_dropdown(Integer int1) throws IOException {
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a"));
		screenshot("Homepagedropdown");
	    System.out.println(allOptions.size());
	    
	    assertEquals(allOptions.size(), int1);
	    
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) throws InterruptedException {
		//Thread.sleep(3000);
		WebElement getstartedArray= driver.findElement(By.xpath("//a[@href='array']"));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	    //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@href='array']")));
	    getstartedArray.click();
		
		
		
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
		System.out.println(hAlertMsg.getText());
		assertEquals(hAlertMsg.getText(), string);
	   
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")).click();
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		
		String[] stringArray = new String[]{"Sign in", "Register"};
		for(String data:stringArray) {
			data.compareTo(hSignIn.getText());
			data.compareTo(hRegister.getText());
			
		}
	    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		hSignIn.click();
		
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form(){
	
		hRegister.click(); 
		
	}

}
