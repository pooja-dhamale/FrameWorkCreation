package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC24_Test extends BaseClass {

	@Test
	public void shirtlinktext() throws Throwable
	{
		Thread.sleep(2000);
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getShirtlinktext().click();
		test.log(Status.INFO,"user is able to click on shirt link text");
		
		ms.navigateback();
		Thread.sleep(2000);
		test.log(Status.INFO,"user is able to click on browser back button");
	}
}
