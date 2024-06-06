package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC17_Test extends BaseClass {
	
	@Test
	public void compact()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getCompact().click();
		test.log(Status.INFO,"user is able to click on compact text links");
		
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
