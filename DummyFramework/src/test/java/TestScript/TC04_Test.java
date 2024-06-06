package TestScript;

import org.testng.annotations.Test;

import POMRepository.HomePagePom;
import genericlib.BaseClass;
import genericlib.Methods;

public class TC04_Test extends BaseClass {
	
	@Test
	public void Electronics()
	{
		hp=new HomePagePom(driver);
		hp.getElectronicsText().click();
		Methods ms=new Methods();
		ms.navigateback();
		
	}

}
