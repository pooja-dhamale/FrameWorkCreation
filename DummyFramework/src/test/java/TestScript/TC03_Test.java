package TestScript;

import org.testng.annotations.Test;

import POMRepository.HomePagePom;
import genericlib.BaseClass;
import genericlib.Methods;

public class TC03_Test extends BaseClass {

	@Test
	
	public void computers() throws Throwable
	{
		hp=new HomePagePom(driver);
		hp.getBookstextlink().click();
		Thread.sleep(2000);
		Methods ms=new Methods();
		ms.navigateback();
	
		
		
	}
}
