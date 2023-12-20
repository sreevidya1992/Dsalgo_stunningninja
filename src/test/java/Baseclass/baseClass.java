package Baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
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

}
