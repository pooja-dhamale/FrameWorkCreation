package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC27_Test extends BaseClass {
	
	@Test
	public void viewAlllinktext() throws Throwable
	{
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getViewalllinktext().click();
		test.log(Status.INFO,"user is able to click on view all link text");	
		ms.navigateback();
		Thread.sleep(3000);
		test.log(Status.INFO,"user is able to click on browser back button");
	
	}

}
