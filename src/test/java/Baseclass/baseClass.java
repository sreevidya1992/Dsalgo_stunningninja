package Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class baseClass {
	public static WebDriver driver;
	//String  url="https://dsportalapp.herokuapp.com/home";
	@FindBy (xpath="//a[text()='Sign in']") public WebElement hSignIn;
	@FindBy (xpath="//a[text()='Sign out']") public WebElement hSignOut;
	@FindBy (id="id_username") public WebElement rUserName;
	@FindBy (id="id_password1") public WebElement rPasswd;
	@FindBy (id="id_password") public WebElement signPasswd;
	@FindBy (xpath="//div[@role='alert']") public WebElement hAlertMsg;
	@FindBy (xpath="//input[@value='Login']") public WebElement loginBtn;
	
	@FindBy (xpath="//a[@href='data-structures-introduction']") public WebElement DSGetStarted;
	@FindBy (xpath="//a[@href='time-complexity']") public WebElement DStimecomplexity;
	@FindBy (xpath="//a[@href='/tryEditor']") public WebElement DSTryEditor;
	
	@FindBy (xpath="//div/pre/span[@role='presentation']") public WebElement DSTryEditorTextBox;
	@FindBy (xpath="//button[text()='Run']") public WebElement DSTryEditorRunBtn;
	@FindBy (id="output") public WebElement DSTryEditorResult;
	@FindBy (xpath="//a[text()='Practice Questions']") public WebElement DSPracticeQuestions;
	
	//*******added by Keerthi*******
	public By userName = By.name("username");
	public By password = By.name("password");
	public By login = By.xpath("//input[@value='Login']");
	public By stack = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]//a");
	public By operations = By.xpath("//a[text()='Operations in Stack']");
	public By tryHere = By.xpath("//a[text()='Try here>>>']");
	public By implementation = By.xpath("//a[text()='Implementation']");
	public By applications = By.xpath("//a[text()='Applications']");
	public By practiceQtn = By.xpath("//a[text()='Practice Questions']");
	public By queue = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a");
	public By implementationQueue = By.xpath("//a[text()='Implementation of Queue in Python']");
	public By collectonQueue = By.xpath("//a[text()='Implementation using collections.deque']");
	public By arrayQueue = By.xpath("//a[text()='Implementation using array']");
	public By operationsQueue = By.xpath("//a[text()='Queue Operations']");
	public By run = By.xpath("//button[text()='Run']");
	public By signOut = By.xpath("//a[text()='Sign out']");
	//*****************************
	
	/*Array Declarations*/
	@FindBy (xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]/div/div/a") public WebElement ArrayGetStarted;
	@FindBy (xpath="//*[text()='Arrays in Python']") public WebElement ArrayInPythonLink;
	@FindBy (xpath="//*[text()='Arrays Using List']") public WebElement ArrayUsingList;
	@FindBy (xpath="//*[text()='Basic Operations in Lists']") public WebElement ArraybasicopertninList;
	@FindBy (xpath="//*[text()='Applications of Array']") public WebElement ArrayApplications;
	@FindBy (xpath="//*[text()='Try here>>>']") public WebElement ArrayTryHereButton;
	@FindBy (partialLinkText = "Search") public WebElement SearchArray;
	@FindBy (xpath="//*[text()='Max Consecutive Ones']") public WebElement ArrayMaxConsecutiveOnes;
	@FindBy (xpath="//*[text()='Find Numbers with Even Number of Digits']") public WebElement ArrayFindnum;
	@FindBy (xpath="//*[text()='Squares of  a Sorted Array']") public WebElement SquaresOfSortedArray;
	@FindBy (partialLinkText="in Python") public WebElement ArraypythonSidelink;
	@FindBy (partialLinkText="Using List") public WebElement ArrayUsingListSidelink;
	@FindBy (partialLinkText="Basic Operations") public WebElement ArrayBasicOperationSidelink;
	@FindBy (partialLinkText="Applications of") public WebElement ArrayApplicationsSidelink;
	
	/*Linked List Declarations*/
	@FindBy (xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a") public WebElement LinkedListGetStarted;
	@FindBy (xpath="//a[text()='Introduction']") public WebElement LLIntroductionLink;
	@FindBy (xpath="//div[@id='content']/li/a") public WebElement LLIntroductionSideLink;
	@FindBy (xpath="//a[text()='Creating Linked LIst']") public WebElement LLcreation;
	@FindBy (xpath="//div[@id='content']/li[2]/a") public WebElement LLCreationSideLink;
	@FindBy (xpath="//a[text()='Types of Linked List']") public WebElement LLtypesOf;
	@FindBy (xpath="//div[@id='content']/li[3]/a") public WebElement TypesOfLLSideLink;
	@FindBy (xpath="//a[text()='Implement Linked List in Python']") public WebElement ImpelementLL;
	@FindBy (xpath="//div[@id='content']/li[4]/a") public WebElement ImplementLLSideLink;
	@FindBy (xpath="//a[text()='Traversal']") public WebElement TraversLL;
	@FindBy (xpath="//div[@id='content']/li[5]/a") public WebElement TraversLLSideLink;
	@FindBy (xpath="//a[text()='Insertion']") public WebElement InsertLL;
	@FindBy (xpath="//div[@id='content']/li[6]/a") public WebElement InsertLLSideLink;
	@FindBy (xpath="//a[text()='Deletion']") public WebElement DeleteLL;
	@FindBy (xpath="//div[@id='content']/li[7]/a") public WebElement DeleteLLSideLink;
	@FindBy (xpath="//a[text()='Try here>>>']") public WebElement TryhereLL;
	@FindBy (xpath="//div/pre/span[@role='presentation']") public WebElement TryEditor;
	@FindBy (xpath="//button[text()='Run']") public WebElement TryEditorRunButton;
	
	
	public static void launchBrowser() {
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://dsportalapp.herokuapp.com/home");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void screenshot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take screenshot and store it as file format
		
			FileUtils.copyFile(file, new File("C:\\Users\\DELL\\eclipse-workspace\\Stunningninjas\\target\\Screenshots\\"+fileName+".jpg"));
		
		
		
	}
	
	          
	          public static void readExcel() throws IOException {
	        	  Actions action = new Actions(driver);
	        	  WebElement tryEditor = driver.findElement(By.xpath("//div/pre/span[@role='presentation']"));
	        	  String path = System.getProperty("user.dir")+"/src/test/resources/TestData/PythonCode.xlsx";
	        	  File ExcelFile =new File(path);
	        	  FileInputStream Fis = new FileInputStream(ExcelFile);
	        	  XSSFWorkbook workbook = new XSSFWorkbook(Fis);
	        	  XSSFSheet sheet=workbook.getSheet("Sheet 1");
	        	  Row row = sheet.getRow(1);
	        	  Cell cell = row.getCell(2);
	        	  String pythonCode =cell.getStringCellValue();
	        	  System.out.println("The cell value is "+pythonCode);
	        	  workbook.close();
	        	  action.sendKeys(tryEditor, pythonCode).perform();
	        	  
	        	  }  
	          
	          public void login() {
	      		// launchBrowser();
	      		 driver.navigate().to("https://dsportalapp.herokuapp.com/login");
	      		 PageFactory.initElements(driver, this);
	      		    rUserName.sendKeys("stunningninja");
	      		    signPasswd.sendKeys("TestWeb@321");
	      		    loginBtn.click();
	      	}

}
