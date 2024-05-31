package genericlib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import POMRepository.BooksPagePom;
import POMRepository.HomePagePom;
import POMRepository.LoginPagePom;
import java.lang.reflect.Method;



public class BaseClass {
	
	public static WebDriver driver;
	
	 public static ExtentSparkReporter sparkReporter;
	 public static ExtentReports reports;
	 public static ExtentTest test;
	 public UtilityMethod um =new UtilityMethod();
	 public HomePagePom hp;
	 public LoginPagePom lp;
	 public Methods ms;
	 public BooksPagePom bp;
	
	@BeforeSuite
	
	public void beforesuite() throws Throwable
	{
		sparkReporter = new ExtentSparkReporter("./reports/"+um.getCurrentTime()+".html");
		reports=new ExtentReports();
		reports.attachReporter(sparkReporter);
	}

@BeforeClass
	
	public void beforeClass(@Optional("Chrome")String browser) throws Throwable
	{
		if(browser.equals("Chrome"))
		{
		driver=new ChromeDriver();	
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Enter the Browser name");
		}
		
	}
		
	@BeforeMethod
	public void beforeMethod(Method method) throws Throwable
	{
		test=reports.createTest(method.getName());
		test.log(Status.INFO, "Execution Started");
		hp=new HomePagePom(driver);
		lp=new LoginPagePom(driver);
	    driver.get(um.getDataFromPropertyFile("url"));
		hp.getLoginTextlink().click();
		lp.getEmailIDtextField().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPasswordField().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		lp.getLogout().click();
		test.log(Status.INFO, "user is able to logout");
	}
	
	@AfterClass
	public void afterclass()
	{
	
		driver.close();
		
	}
		
	@AfterSuite
	public void aftersuite()
	{
		reports.flush();
	}
			
		
	}
		


