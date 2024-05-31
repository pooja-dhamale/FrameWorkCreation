package TestScript;

import org.testng.annotations.Test;

import POMRepository.BooksPagePom;
import POMRepository.HomePagePom;
import genericlib.BaseClass;
import genericlib.Methods;

public class TC02_Test extends BaseClass {
	
	
	@Test
	public void scrolldown() throws Throwable
	{
		hp=new HomePagePom(driver);
	    hp.getBookstextlink().click();
		Thread.sleep(2000);
		bp=new BooksPagePom(driver);
		Methods ms=new Methods();
		ms.selectDropDownByVisibleText(bp.getProductdropdown(), "Name: A to Z");
		Thread.sleep(3000);
	}

}
