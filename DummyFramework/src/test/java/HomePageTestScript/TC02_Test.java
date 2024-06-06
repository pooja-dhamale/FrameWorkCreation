package HomePageTestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass;

public class TC02_Test extends BaseClass {

	@Test
	public void newsletter() throws Throwable
	{
		
        hp.getNewsletteremail().sendKeys("pooja11@gmail.com");
        test.log(Status.INFO, "user is able to type the email id in newsletter field");
        hp.getNewslettersubscribebutton().click();
        test.log(Status.INFO, "user is able to click on newsletter cta");
        Thread.sleep(2000);
	}
}
