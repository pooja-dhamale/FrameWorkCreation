package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;
import genericlib.Methods;

public class TC10_Test extends BaseClass {
	@Test
	public void giftcardtext()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		hp.getGiftCardstext().click();
		test.log(Status.INFO,"user is able to click on giftcards text link");
		Methods ms=new Methods();
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}

}
