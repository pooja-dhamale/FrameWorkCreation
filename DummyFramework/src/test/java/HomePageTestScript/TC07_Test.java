package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC07_Test extends BaseClass {
	
	@Test
	public void appareltext() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		hp.getApparelShoesText().click();
		test.log(Status.INFO,"user is able to click on Apparel text link");
		Methods ms=new Methods();
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		Thread.sleep(2000);
	}

}
