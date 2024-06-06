package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMRepository.HomePagePom;
import genericlib.BaseClass;

public class TC28_Test extends BaseClass {
	
	@Test
	
	public void HomePageBannerslider() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp=new HomePagePom(driver);
		hp.getNextslider().click();
		test.log(Status.INFO, "user is able to swipe the banner image with the help of next slider arrow");
		Thread.sleep(2000);
		hp.getPrevslider().click();
		test.log(Status.INFO, "user is able to swipe the banner image with the help of previous slider arrow");

	}

}
