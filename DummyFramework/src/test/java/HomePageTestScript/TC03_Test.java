package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import genericlib.BaseClass;

public class TC03_Test extends BaseClass {
	
	@Test
	public void radiobutton() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(7000);
		hp.getPoorradio().click();
		Thread.sleep(5000);
		hp.getVotecta().click();
		Thread.sleep(5000);
			}

}
