package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC23_Test extends BaseClass {
	@Test
	public void nicelinktext() throws Throwable
	{
		Thread.sleep(2000);
		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getNicelinktext().click();
		test.log(Status.INFO,"user is able to click on nice link text");
		ms.navigateback();
		Thread.sleep(2000);
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
