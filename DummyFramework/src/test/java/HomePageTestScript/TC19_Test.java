package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC19_Test extends BaseClass {
	
	@Test
	public void coollinktext()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Methods ms=new Methods();
		ms.scrollDown(driver);
		hp.getCoollinktext().click();
		test.log(Status.INFO,"user is able to click on cool link text");
		
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
