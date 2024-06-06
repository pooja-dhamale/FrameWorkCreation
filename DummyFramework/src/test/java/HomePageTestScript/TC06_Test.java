package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC06_Test extends BaseClass {
	

	@Test
	public void ElectronicsText() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		hp.getElectronicsText().click();
		test.log(Status.INFO,"user is able to click on electronics text link");
		Methods ms=new Methods();
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		Thread.sleep(2000);
		
    }

}
