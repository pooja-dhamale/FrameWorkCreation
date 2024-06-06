package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC22_Test extends BaseClass {

	@Test
	public void jewelerylinktext1() throws Throwable
	{
		Thread.sleep(2000);
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getJewelrylinktext().click();
		test.log(Status.INFO,"user is able to click on jewelery link text");
	
		ms.navigateback();
		Thread.sleep(2000);
		test.log(Status.INFO,"user is able to click on browser back button");
	}
}
