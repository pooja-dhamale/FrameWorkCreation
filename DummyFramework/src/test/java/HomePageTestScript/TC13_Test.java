package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC13_Test extends BaseClass {
	
	@Test
	public void awesomelinktext() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getAwesome().click();
		test.log(Status.INFO,"user is able to click on awesome text link");
		
		ms.navigateback();
		Thread.sleep(2000);
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	

}
