package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.collect.Table.Cell;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeDataStructure extends baseClass {
	By treeButton = By.xpath("/html/body/div[3]/div[6]/div/div/a[@href=\"tree\"]");

	By tryLink = By.xpath("/html/body/div[2]/div/div[2]/a[@href=\"/tryEditor\"]");
	By answerForm = By.xpath("//div/pre/span[@role='presentation']");
	By runBtn = By.xpath("/html/body/div/div/form/button[text()='Run']");

	By overviewLink = By.xpath("/html/body/div[2]/ul[1]/a[@href=\"overview-of-trees\"]");
	By terminologyLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[2]/a[@href=\"/tree/terminologies/\"]");

	By typesOfTreeLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[3]/a[@href=\"/tree/types-of-trees/\"]");

	By treeTraverseLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[4]/a[@href=\"/tree/tree-traversals/\"]");

	By treeTraverseIllustrationLink = By
			.xpath("/html/body/div[2]/div/div[1]/div/li[5]/a[@href=\"/tree/traversals-illustration/\"]");

	By btLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[6]/a[@href=\"/tree/binary-trees/\"]");

	By typesOfBtLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[7]/a[@href=\"/tree/types-of-binary-trees/\"]");

	By implInPythonLink = By
			.xpath("/html/body/div[2]/div/div[1]/div/li[8]/a[@href=\"/tree/implementation-in-python/\"]");

	By btTraverseLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[9]/a[@href=\"/tree/binary-tree-traversals/\"]");

	By implBtLink = By
			.xpath("/html/body/div[2]/div/div[1]/div/li[10]/a[@href=\"/tree/implementation-of-binary-trees/\"]");

	By appOfBtLink = By
			.xpath("/html/body/div[2]/div/div[1]/div/li[11]/a[@href=\"/tree/applications-of-binary-trees/\"]");

	By bstLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[12]/a[@href=\"/tree/binary-search-trees/\"]");

	By implBstLink = By.xpath("/html/body/div[2]/div/div[1]/div/li[13]/a[@href=\"/tree/implementation-of-bst/\"]");

	@Given("User is in Tree page after login")
	public void user_is_in_graph_page_after_login() {

	}

	protected void tryLink() throws IOException {
		
		  driver.findElement(tryLink).click();
		  PageFactory.initElements(driver, this);
		 /* 
		 * 
		 * new Actions(driver)
		 * .click(driver.findElement(answerForm)).sendKeys("for i in range(10):\r\n" +
		 * "     print(i)") .perform();
		 * 
		 * 
		 * Actions action = new Actions(driver); WebElement tryEditor =
		 * driver.findElement(By.xpath("//div/pre/span[@role='presentation']")); String
		 * path = System.getProperty("user.dir")+
		 * "/src/test/resources/TestData/PythonCode1.xlsx"; File ExcelFile =new
		 * File(path); FileInputStream Fis = null; try { Fis = new
		 * FileInputStream(ExcelFile); } catch (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); } XSSFWorkbook workbook = null; try { workbook = new
		 * XSSFWorkbook(Fis); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } XSSFSheet sheet=workbook.getSheet("Tree"); Row
		 * row = sheet.getRow(0); System.out.println(row.getCell(0));
		 * org.apache.poi.ss.usermodel.Cell cell = row.getCell(0); String pythonCode
		 * =((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
		 * System.out.println("The cell value is "+pythonCode); workbook.close();
		 * action.sendKeys(tryEditor, pythonCode).perform();
		 * 
		 * driver.findElement(runBtn).click();
		 */
		
		readExcel();
		DSTryEditorRunBtn.click();
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
		screenshot("Testresults");

		driver.navigate().back();

	}

	@When("User clicks Tree button")
	public void user_clicks_tree_button() {
		driver.findElement(treeButton).click();
	}

	@Then("User should be directed to Tree page")
	public void user_should_be_directed_to_graph_page() {

	}

	@When("User clicks overview of trees button")
	public void user_clicks_overview_of_trees_button() {
		driver.findElement(overviewLink).click();

	}

	@Then("The user should be directed to overview of trees page")
	public void the_user_should_be_directed_to_overview_of_trees_page() {

	}

	@When("User clicks Try here button")
	public void user_clicks_try_here_button() {
		try {
			tryLink();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("User should be directed to a page having tryEditor with Run button to test")
	public void user_should_be_directed_to_a_page_having_try_editor_with_run_button_to_test() {

	}

	@When("User clicks Terminologies button")
	public void user_clicks_terminologies_button() {

		driver.findElement(terminologyLink).click();

	}

	@Then("The user should be directed to Terminologies  page")
	public void the_user_should_be_directed_to_terminologies_page() {

	}

	@When("User clicks Types of trees button")
	public void user_clicks_types_of_trees_button() {

		driver.findElement(typesOfTreeLink).click();
	}

	@Then("The user should be directed to Types of trees page")
	public void the_user_should_be_directed_to_types_of_trees_page() {

	}

	@When("User clicks Tree Traversals button")
	public void user_clicks_tree_traversals_button() {
		driver.findElement(treeTraverseLink).click();

	}

	@Then("The user should be directed to Tree Traversals  page")
	public void the_user_should_be_directed_to_tree_traversals_page() {

	}

	@When("User clicks Tree Traversals-Illustration button")
	public void user_clicks_tree_traversals_illustration_button() {

		driver.findElement(treeTraverseIllustrationLink).click();
	}

	@Then("The user should be directed to Tree Traversals-Illustration  page")
	public void the_user_should_be_directed_to_tree_traversals_illustration_page() {

	}

	@When("User clicks Binary tree button")
	public void user_clicks_binary_tree_button() {
		driver.findElement(btLink).click();

	}

	@Then("The user should be directed to Binary tree  page")
	public void the_user_should_be_directed_to_binary_tree_page() {

	}

	@When("User clicks Types of binary tree button")
	public void user_clicks_types_of_binary_tree_button() {
		driver.findElement(typesOfBtLink).click();

	}

	@Then("The user should be directed to Types of binary tree  page")
	public void the_user_should_be_directed_to_types_of_binary_tree_page() {

	}

	@When("User clicks Implementation in Python button")
	public void user_clicks_implementation_in_python_button() {

		driver.findElement(implInPythonLink).click();
	}

	@Then("The user should be directed to Implementation in Python  page")
	public void the_user_should_be_directed_to_implementation_in_python_page() {

	}

	@When("User clicks Binary tree traversals button")
	public void user_clicks_binary_tree_traversals_button() {

		driver.findElement(btTraverseLink).click();
	}

	@Then("The user should be directed to Binary tree traversals  page")
	public void the_user_should_be_directed_to_binary_tree_traversals_page() {

	}

	@When("User clicks Implementation of binary tree button")
	public void user_clicks_implementation_of_binary_tree_button() {

		driver.findElement(implBtLink).click();
	}

	@Then("The user should be directed to Implementation of binary tree  page")
	public void the_user_should_be_directed_to_implementation_of_binary_tree_page() {

	}

	@When("User clicks Application of binary tree button")
	public void user_clicks_application_of_binary_tree_button() {
		driver.findElement(appOfBtLink).click();

	}

	@Then("The user should be directed to Application of binary tree  page")
	public void the_user_should_be_directed_to_application_of_binary_tree_page() {

	}

	@When("User clicks Binary search tree button")
	public void user_clicks_binary_search_tree_button() {

		driver.findElement(bstLink).click();
	}

	@Then("The user should be directed to Binary search tree page")
	public void the_user_should_be_directed_to_binary_search_tree_page() {

	}

	@When("User clicks Implementation of binary search tree button")
	public void user_clicks_implementation_of_binary_search_tree_button() {
		driver.findElement(implBstLink).click();

	}

	@Then("The user should be directed to Implementation of binary search tree  page")
	public void the_user_should_be_directed_to_implementation_of_binary_search_tree_page() {

	}

	@Then("Close the browser")
	public void close_the_browser() {
		PageFactory.initElements(driver, this);
		hSignOut.click();

	}

}
