package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array extends baseClass{

	/*public static void screenshot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take screenshot and store it as file format
		
			FileUtils.copyFile(file, new File("C:\\Users\\DELL\\eclipse-workspace\\Stunningninjas\\target\\Screenshots\\"+fileName+".jpg"));
		
		
		
	}*/
	
	@Given("user is in the Array page after logged in")
	public void user_is_in_the_array_page_after_logged_in() {
		
		//launchBrowser();
		login();
		
		
	   /* driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	    PageFactory.initElements(driver, this);
	    rUserName.sendKeys("stunningninja");
	    signPasswd.sendKeys("TestWeb@321");
	    loginBtn.click();*/
		//PageFactory.initElements(driver, this);
		
		ArrayGetStarted.click();
	    
	}

	@When("user clicks {string} link")
	public void user_clicks_link(String string) {
		ArrayInPythonLink.click();
	    
	}

	@Then("user should be redirected to {string} page and click the sidelink of arrays in python")
	public void user_should_be_redirected_to_page_and_click_the_sidelink_of_arrays_in_python(String string) {
		ArraypythonSidelink.click();
	    
	}

	@When("user clicks {string} button")
	public void user_clicks_button(String string) {
		ArrayTryHereButton.click();
	    
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		/*
		 * new Actions(driver) .click(TryEditor).sendKeys("num1 = 15\r\n" +
		 * "num2 = 12\r\n" + "sum = num1 + num2\r\n" +
		 * "print(\"Sum of\", num1, \"and\", num2 , \"is\", sum)") .perform();
		 * 
		 * TryEditorRunButton.click();
		 */
		
		//readExcel();
PageFactory.initElements(driver, this);
		
		
		
		readExcel();
		DSTryEditorRunBtn.click();
		
		screenshot("ArrayTryEditor");
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
		
		}
	    
	

	@Then("user should redirected to array page")
	public void user_should_redirected_to_array_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array");
	    
	}

	@When("user wants {string} link")
	public void user_wants_link(String string) {
		ArrayUsingList.click();
	    
	}

	@Then("user should be redirected to {string} page and click the sidelink of Arrays Using List")
	public void user_should_be_redirected_to_page_and_click_the_sidelink_of_arrays_using_list(String string) {
		ArrayUsingListSidelink.click();
	    
	}

	@When("user selects {string} link")
	public void user_selects_link(String string) {
		ArraybasicopertninList.click();
	    
	}

	@Then("user should be redirected to {string} page and click the sidelink of Basic Operations in List")
	public void user_should_be_redirected_to_page_and_click_the_sidelink_of_basic_operations_in_list(String string) {
		ArrayBasicOperationSidelink.click();
	    
	}

	@When("user want to learn {string} link")
	public void user_want_to_learn_link(String string) {
		ArrayApplications.click();
	    
	}

	@Then("user should be redirected to {string} page and click the sidelink of Applications of Array")
	public void user_should_be_redirected_to_page_and_click_the_sidelink_of_applications_of_array(String string) {
		ArrayApplicationsSidelink.click();
	    
	}

	@Then("user should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
	    
	}

	@When("user clicks the {string} link")
	public void user_clicks_the_search_the_array_link(String string) {
		PageFactory.initElements(driver, this);
		SearchArray.click();
	    
	}

	

	@Then("user should redirected to practice page")
	public void user_should_redirected_to_practice_page() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
		driver.navigate().back();
	}

	@When("user clicks the {string} link in Practice page")
	public void user_clicks_the_link_in_practice_page(String string) {
		PageFactory.initElements(driver, this);
		ArrayMaxConsecutiveOnes.click();
	    
	}

	@Then("user should be redirected to {string} page contains questions,an tryEditor to write code with Run and Submit buttons")
	public void user_should_be_redirected_to_page_contains_questions_an_try_editor_to_write_code_with_run_and_submit_buttons(String string) throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
		WebElement test=driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre"));
		
		new Actions(driver).doubleClick(test).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		
		/*
		 * new Actions(driver) .click(DSTryEditorTextBox).sendKeys("num1 = 15\r\n" +
		 * "num2 = 12\r\n" + "sum = num1 + num2\r\n" +
		 * "print(\"Sum of\", num1, \"and\", num2 , \"is\", sum)") .perform();
		 */
		readExcel();
		TryEditorRunButton.click();
		screenshot("ArrayTryEditorQuestions");
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
		
	    
	}
	

	@When("user selects {string} link in Practice page")
	public void user_selects_link_in_practice_page(String string) {
		PageFactory.initElements(driver, this);
		ArrayFindnum.click();
	    
	}

	@When("user clicks {string} link in Practice page")
	public void user_clicks_link_in_practice_page(String string) {
		PageFactory.initElements(driver, this);
		SquaresOfSortedArray.click();
	    
	}

	@Then("user click Sign Out")
	public void user_click_sign_out() {
		PageFactory.initElements(driver, this);
		hSignOut.click();
		//closeBrowser();
	}




}