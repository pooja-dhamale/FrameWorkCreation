package HomePageTestScript;

import java.lang.reflect.Method;
import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC04_Test extends BaseClass{
	
	@Test
	public void books() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		hp.getBookstextlink().click();
		test.log(Status.INFO, "user is able to click on books text link");
		Methods ms=new Methods();
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		Thread.sleep(3000);
		
	}

}
