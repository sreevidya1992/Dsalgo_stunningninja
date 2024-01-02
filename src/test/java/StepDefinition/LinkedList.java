package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList extends baseClass{
	
	
	@Given("the user is in Linked List Page after logged in")
	public void the_user_is_in_linked_list_page_after_logged_in() {
		login();
		LinkedListGetStarted.click();
		/*launchBrowser();
	    driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	    PageFactory.initElements(driver, this);
	    rUserName.sendKeys("stunningninja");
	    signPasswd.sendKeys("TestWeb@321");
	    loginBtn.click();*/
	   
	}

	@When("user clicks Introduction link")
	public void user_clicks_introduction_link() {
		LLIntroductionLink.click();
	   
	}

	@Then("user should be redirected to Introduction page and click the sidelink of Introduction")
	public void user_should_be_redirected_to_introduction_page_and_click_the_sidelink_of_introduction() {
		LLIntroductionSideLink.click();
	   
	}

	@When("user want to try code {string} button can be clicked")
	public void user_want_to_try_code_button_can_be_clicked(String string) {
		TryhereLL.click();
	   
	}

	@Then("user should be redirected to TryEditor page with a Run button to test")
	public void user_should_be_redirected_to_try_editor_page_with_a_run_button_to_test() throws IOException {
//		new Actions(driver)
//        .click(TryEditor).sendKeys("num1 = 15\r\n"
//        		+ "num2 = 12\r\n"
//        		+ "sum = num1 + num2\r\n"
//        		+ "print(\"Sum of\", num1, \"and\", num2 , \"is\", sum)")
//        .perform();
//		TryEditorRunButton.click();
PageFactory.initElements(driver, this);
		
		
		
		readExcel();
		DSTryEditorRunBtn.click();
		
		screenshot("LLTryEditor");
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
	   
	}

	@Then("user should redirected to Linked List Page")
	public void user_should_redirected_to_linked_list_page() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
	   
	}

	@When("user wants to Create Linked List,clicks this link")
	public void user_wants_to_create_linked_list_clicks_this_link() {
		LLcreation.click();
	   
	}

	@Then("user should be redirected to Creating Linked List Page and click the sidelink of Creating Linked List")
	public void user_should_be_redirected_to_creating_linked_list_page_and_click_the_sidelink_of_creating_linked_list() {
		LLCreationSideLink.click();
	   
	}

	@When("user wants to learn Types of Linked List,clicks this link")
	public void user_wants_to_learn_types_of_linked_list_clicks_this_link() {
		LLtypesOf.click();
	   
	}

	@Then("user should be redirected to Types of Linked List Page and click the sidelink of Types of Linked List Page")
	public void user_should_be_redirected_to_types_of_linked_list_page_and_click_the_sidelink_of_types_of_linked_list_page() {
		TypesOfLLSideLink.click();
	   
	}

	@When("user likes to implement Linked List in Phython,clicks this link")
	public void user_likes_to_implement_linked_list_in_phython_clicks_this_link() {
		ImpelementLL.click();
	   
	}

	@Then("user should be redirected to Linked List in Phython Page and click the sidelink of Linked List in Phython Page")
	public void user_should_be_redirected_to_linked_list_in_phython_page_and_click_the_sidelink_of_linked_list_in_phython_page() {
		ImplementLLSideLink.click();
	   
	}

	@When("user would like to Traverse the Linked List, selects this link")
	public void user_would_like_to_traverse_the_linked_list_selects_this_link() {
		TraversLL.click();
	   
	}

	@Then("user should be redirected to Traversal Page and click the sidelink of Traversal")
	public void user_should_be_redirected_to_traversal_page_and_click_the_sidelink_of_traversal() {
		TraversLLSideLink.click();
	   
	}

	@When("user like to Insert element")
	public void user_like_to_insert_element() {
		InsertLL.click();
	   
	}

	@Then("user should be redirected to Insertion Page and click the sidelink of Insertion")
	public void user_should_be_redirected_to_insertion_page_and_click_the_sidelink_of_insertion() {
		InsertLLSideLink.click();
	   
	}

	@When("user want to Delete element")
	public void user_want_to_delete_element() {
		DeleteLL.click();
	   
	}

	@Then("user should be redirected to Deletion Page and click the sidelink of Deletion")
	public void user_should_be_redirected_to_deletion_page_and_click_the_sidelink_of_deletion() {
		DeleteLLSideLink.click();
	   
	}

	@Then("user clicks Sign Out")
	public void user_clicks_sign_out() {
		PageFactory.initElements(driver, this);
		hSignOut.click();
		closeBrowser();
	}

}