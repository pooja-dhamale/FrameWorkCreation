package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC14_Test extends BaseClass {
	
	@Test
	public void bookstextlinks()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getBook().click();
		test.log(Status.INFO,"user is able to click on bookstextlink button");
		
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
