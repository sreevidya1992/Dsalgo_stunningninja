package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Baseclass.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack_SD extends baseClass{
	
	//public static WebDriver driver; 
	String url = "https://dsportalapp.herokuapp.com/login";
	
	/*
	 * By userName = By.name("username"); By password = By.name("password"); By
	 * login = By.xpath("//input[@value='Login']"); By stack =
	 * By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]//a"); By
	 * operations = By.xpath("//a[text()='Operations in Stack']"); By tryHere =
	 * By.xpath("//a[text()='Try here>>>']"); By implementation =
	 * By.xpath("//a[text()='Implementation']"); By applications =
	 * By.xpath("//a[text()='Applications']"); By practiceQtn =
	 * By.xpath("//a[text()='Practice Questions']"); By queue =
	 * By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a"); By
	 * implementationQueue =
	 * By.xpath("//a[text()='Implementation of Queue in Python']"); By
	 * collectonQueue =
	 * By.xpath("//a[text()='Implementation using collections.deque']"); By
	 * arrayQueue = By.xpath("//a[text()='Implementation using array']"); By
	 * operationsQueue = By.xpath("//a[text()='Queue Operations']"); By run =
	 * By.xpath("//button[text()='Run']");
	 * By signOut = By.xpath("//a[text()='Sign out']");
	 */
	
	//By tryEditor = By.xpath("//div/pre/span[@role='presentation']");
	//By tryEditorOut = By.xpath("//div/pre[@id='output']");
	//WebElement tryEditor = driver.findElement(By.xpath("//div/pre/span[@role='presentation']"));
	//WebElement tryEditorOut = driver.findElement(By.xpath("//div/pre[@id='output']"));
	
	String ds;
	
	@Given("The user is in the {string} page after logged in")
	public void the_user_is_in_the_page_after_logged_in(String dataStructure) {
		
		
		/*
		 * driver = new ChromeDriver(); driver.get(url);
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 */
		 
		// launchBrowser();
		
		  driver.navigate().to("https://dsportalapp.herokuapp.com/login");
		  
		  
		  driver.findElement(userName).sendKeys("stunningninja");
		  driver.findElement(password).sendKeys("TestWeb@321");
		  driver.findElement(login).click();
		 
	    
	    ds=dataStructure;
	    if(ds.equals("Stack")) {
	    	System.out.println("the ds is Stack" );
	    	driver.findElement(stack).click();
	    }
	    if(ds.equals("Queue")) {
    	System.out.println("the ds is Queue");
    	driver.findElement(queue).click();
	    }
	}

	@When("The user try to click the {string} button")
	public void the_user_try_to_click_the_button(String button) {
		 if(button.equals("Operations in Stack")) {
		System.out.println(button+ " button is clicked");
		driver.findElement(operations).click();
		 }
		 if(button.equals("Try Here")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(tryHere).click();
		 }
		 if(button.equals("Run")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(run).click();
		 }
		 if(button.equals("Implementation")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(implementation).click();
		 }
		 if(button.equals("Applications")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(applications).click();
		 }
		 if(button.equals("Implementation of Queue in Python")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(implementationQueue).click();
		 }
		 if(button.equals("Implementation using collections.deque")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(collectonQueue).click();
		 }
		 if(button.equals("Implementation using Array")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(arrayQueue).click();
		 }
		 if(button.equals("Queue Operations")) {
			 System.out.println(button+ " button is clicked");
			 driver.findElement(operationsQueue).click();
		 }
	   
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	    
	   
	}

	@Then("The user should be redirected to {string} page with a Run button to test")
	public void the_user_should_be_redirected_to_page_with_a_run_button_to_test(String string) {
	    
		
	}

	@When("The user enter a sample code in the tryEditor")
	public void the_user_enter_a_sample_code_in_the_try_editor() throws IOException {
	    
	 //  Actions action = new Actions(driver);
	 //  WebElement tryEditor = driver.findElement(By.xpath("//div/pre/span[@role='presentation']"));
	   
	   
	 //Reading python code from excel
		PageFactory.initElements(driver, this);
		readExcel();
		TryEditorRunButton.click();
		screenshot("Queue");
		/*
		 * String path = System.getProperty("user.dir")+
		 * "/src/test/resources/TestData/PythonCode.xlsx"; File ExcelFile =new
		 * File(path); FileInputStream Fis = new FileInputStream(ExcelFile);
		 * XSSFWorkbook workbook = new XSSFWorkbook(Fis); XSSFSheet
		 * sheet=workbook.getSheet("Sheet 1");
		 * 
		 * Row row = sheet.getRow(1); Cell cell = row.getCell(2); String pythonCode
		 * =cell.getStringCellValue();
		 * System.out.println("The cell value is "+pythonCode); workbook.close();
		 * action.sendKeys(tryEditor, pythonCode).perform();
		 */
	   
	   
	   //***********************
		/*
		 * action.sendKeys(tryEditor, "num1 = 15\r\n" + "num2 = 12\r\n" +
		 * "sum = num1 + num2\r\n" +
		 * "print(\"Sum of\", num1, \"and\", num2 , \"is\", sum)").perform();
		 */
	   //***********************
	  // String expectedOutput="('Sum of', 15, 'and', 12, 'is', 27)";
	  // WebElement tryEditorOut = driver.findElement(By.xpath("//div/pre[@id='output']"));
		//Assert.assertEquals(tryEditorOut.getText(), expectedOutput);
	   
	}

	@Then("The result should be printed")
	public void the_result_should_be_printed() throws IOException {
		PageFactory.initElements(driver, this);
		//readExcel();
		String expectedMsg="27";
		Assert.assertEquals(DSTryEditorResult.getText(), expectedMsg);
	    
		/*
		 * WebElement tryEditorOut =
		 * driver.findElement(By.xpath("//div/pre[@id='output']")); String output =
		 * tryEditorOut.getText(); System.out.println("The output is: "+output);
		 */
	}

	@Given("The user navigationg back to the {string} page")
	public void the_user_navigationg_back_to_the_page(String backPage) {
		driver.navigate().back();
		//driver.findElement(implementation).click();
		//driver.navigate().back();
		//driver.findElement(applications).click();
		 if(backPage.equals("stack-applications")) {
			 driver.navigate().back();
		 }
		 if(backPage.equals("QueueOp")) {
			 driver.navigate().back();
		 }
	}

	@When("The user clicks {string} link at the left side")
	public void the_user_clicks_link_at_the_left_side(String leftLink) {
		if(leftLink.equals("Operations in Stack")) {
			driver.findElement(operations).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Implementation")) {
			driver.findElement(implementation).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Applications")) {
			driver.findElement(applications).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Practice Questions")) {
			driver.findElement(practiceQtn).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Implementation of Queue in Python")) {
			driver.findElement(implementationQueue).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Implementation using collections.deque")) {
			driver.findElement(collectonQueue).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Implementation using Array")) {
			driver.findElement(arrayQueue).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		if(leftLink.equals("Queue Operations")) {
			driver.findElement(operationsQueue).click();
			System.out.println(leftLink+ " left side button is clicked");
		}
		
		
	}

	@Then("User try to click the Sign out")
	public void user_try_to_click_the_sign_out() {
		driver.findElement(signOut).click();
		//driver.quit();
		//closeBrowser();
	}




}
