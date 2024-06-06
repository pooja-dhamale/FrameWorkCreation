package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC25_Test extends BaseClass{
	
	@Test
	public void shoeslinktext() throws Throwable
	{
		Thread.sleep(2000);
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getShoeslinktext().click();
		test.log(Status.INFO,"user is able to click on shoes link text");
		
		ms.navigateback();
		Thread.sleep(2000);
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
