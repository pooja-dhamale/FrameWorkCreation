package TestScript;

import org.testng.annotations.Test;

import genericlib.BaseClass;

public class TC01_Test extends BaseClass {
	
	
	@Test
	public void Jewelery()
	{
		hp.getJewelery().click();
	}
	
	

}
