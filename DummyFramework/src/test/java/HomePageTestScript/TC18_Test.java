package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC18_Test extends BaseClass{
	
	@Test
	public void computerlinkstext()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getComputerlink().click();
		test.log(Status.INFO,"user is able to click on computer link text");
		
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
