package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC15_Test extends BaseClass {
	
	@Test
	public void camera()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getCamera().click();
		test.log(Status.INFO,"user is able to click on camera text link");
		
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
