package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GraphDataStructure extends baseClass {

	By graphButton = By.xpath("/html/body/div[3]/div[7]/div/div/a[@href=\"graph\"]");
	
	By graph2Btn = By.xpath("/html/body/div[2]/ul[2]/a[@href=\"graph\"]");
	
	By tryLink = By.xpath("/html/body/div[2]/div/div[2]/a[@href=\"/tryEditor\"]");
	
	
	By answerForm = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]");
	
	By runBtn = By.xpath("/html/body/div/div/form/button[text()='Run']");
	
	By graphRepButton = By.xpath("/html/body/div[2]/ul[3]/a[@href=\"graph-representations\"]");
	By tryRepLink = By.xpath("/html/body/div[2]/div/div[2]/a[@href=\"/tryEditor\"]");
	
	By practiceButton = By.xpath("/html/body/div[2]/div/div[1]/div/a[@href=\"practice\"]");
	
		//TC01
	@Given("User is in graph page after login")
	public void user_is_in_graph_page_after_login() {
		System.out.println("Inside the home page ::: ");
		driver.findElement(graphButton).click();
	}
	
	@When("User clicks graph button")
	public void user_clicks_graph_button()  {
		driver.findElement(graph2Btn).click();
	}
	
	@Then("User should be directed to graph page")
	public void user_should_be_directed_to_graph_page()   {
		System.out.print("Statement 1 ");
	}
	
	@When("user selects second graph button")
	public void user_clicks_second_graph()  {
		driver.findElement(tryLink).click();
		
	}
	@Then("user is able to view the tryEditor")
	public void user_directed_to_try_editor() throws IOException   {
//		new Actions(driver)
//        .click(driver.findElement(answerForm)).sendKeys("for i in range(10):\r\n"
//        		+ "     print(i)")
//        .perform();
//		driver.findElement(runBtn).click();
//		driver.close();
		PageFactory.initElements(driver, this);
		readExcel();
		DSTryEditorRunBtn.click();
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
	}
	
	//TC_002
	@Given("User is in graph rep page")
	public void user_is_in_graph_rep_page() {
		driver.findElement(graphButton).click();
	}
	
	@When("user selects graph representation button")
	public void user_clicks_second_graph_rep_page()  {
		driver.findElement(graphRepButton).click();
	}
	@Then("user is able to view the tryRepEditor")
	public void user_directed_to_try_rep_editor() throws IOException   {
		
		 driver.findElement(tryRepLink).click();
		/* new Actions(driver)
		  .click(driver.findElement(answerForm)).sendKeys("for i in range(10):\r\n" +
		  "     print(i)") .perform(); driver.findElement(runBtn).click();
		 * driver.close();
		 */
		PageFactory.initElements(driver, this);
		readExcel();
		DSTryEditorRunBtn.click();
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
		driver.navigate().back();
		PageFactory.initElements(driver, this);
		driver.findElement(signOut).click();
	}

}
