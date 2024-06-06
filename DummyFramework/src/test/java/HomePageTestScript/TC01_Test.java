package HomePageTestScript;

import java.time.Duration;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMRepository.HomePagePom;
import genericlib.BaseClass;
import genericlib.Methods;

public class TC01_Test extends BaseClass {
	
	@Test
	
public void Searchbox() throws Throwable
	
	{
		hp=new HomePagePom(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp.getSerachbox().sendKeys("books");
		test.log(Status.INFO, "user is able to pass the values in serchbox as a books");
		hp.getSearchcta().click();
		test.log(Status.INFO, "user is able to click on search cta");
		Methods ms=new Methods();
		ms.navigateback();
		test.log(Status.INFO, "user is able to click on browser back button");
		Thread.sleep(2000);
	}

}
