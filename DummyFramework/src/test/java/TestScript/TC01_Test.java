package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMRepository.JeweleryPagePom;
import genericlib.BaseClass;
import genericlib.Methods;

public class TC01_Test extends BaseClass {
	
	
	@Test
	public void Jewelery() throws Throwable
	{
		hp.getJewelery().click();
		Reporter.log("user is able to click on jewelery link text",true);
		Methods ms =new Methods();
		jp=new JeweleryPagePom(driver);
		ms.selectDropDownByVisibleText(jp.getSortbydropdown(), "Price: Low to High");
        test.log(Status.INFO, "user is able to select the filter from the dropdown as price low to high");
		ms.selectDropDownByVisibleText(jp.getDisplayperpagesdropdown(), "8");
		test.log(Status.INFO, "user is able to select the pages from the down");
		ms.selectDropDownByVisibleText(jp.getProductsviewmodedropdown(), "Grid");
		test.log(Status.INFO, "user is able to select the products view mode from the dropdown");
		Thread.sleep(5000);
		ms.scrollDown(driver);
		test.log(Status.INFO, "user is able to scroll down the page");
		Thread.sleep(2000);
		ms.scrollUp(driver);
		test.log(Status.INFO, "user is able to scroll up the page");
		jp.getAddtocartcta1().click();
		test.log(Status.INFO, "user is able to click on add to cart cta");
		Thread.sleep(4000);
		ms.navigateback();
		ms.navigateback();
	}
	
	

}
