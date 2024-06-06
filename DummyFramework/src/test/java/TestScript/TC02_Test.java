package TestScript;

import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMRepository.BooksPagePom;
import POMRepository.HomePagePom;
import genericlib.BaseClass;
import genericlib.Methods;


public class TC02_Test extends BaseClass {
	
	
	
	
	@Test
	public void HomePage() throws Throwable
	
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
	}
	@Test
	public void newsletter()
	{
		
        hp.getNewsletteremail().sendKeys("pooja11@gmail.com");
        test.log(Status.INFO, "user is able to type the email id in newsletter field");
        hp.getNewslettersubscribebutton().click();
        test.log(Status.INFO, "user is able to click on newsletter cta");
	}

//		hp.getExcellentradio().click();
//		hp.getVotecta().click();
        
	@Test
	public void books()
	{
		
		hp.getBookstextlink().click();
		test.log(Status.INFO, "user is able to click on books text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		
	}
		
	
	@Test
	public void Computertext()
	{
		hp.getComputertext().click();
		test.log(Status.INFO,"user is able to click on computer text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	

	@Test
	public void ElectronicsText()
	{
		hp.getElectronicsText().click();
		test.log(Status.INFO,"user is able to click on electronics text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		
    }

	@Test
	public void appareltext()
	{

		hp.getApparel().click();
		test.log(Status.INFO,"user is able to click on Apparel text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
		
	}
	@Test
	public void digitaldownloadlink()
	{
		hp.getDigitaldownloadstext().click();
		test.log(Status.INFO,"user is able to click on Digital downloads text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void jewelery()
	{
		
		
		hp.getJewelery().click();
		test.log(Status.INFO,"user is able to click on jewelery text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void giftcardtext()
	{

		hp.getGiftCardstext().click();
		test.log(Status.INFO,"user is able to click on giftcards text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void tricentis()
	{
	
		hp.getTricentis().click();
		test.log(Status.INFO,"user is able to click on tricents links text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	@Test
	public void apparellink()
	{

		hp.getApparel().click();
		test.log(Status.INFO,"user is able to click on Apparel links text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	@Test
	public void awesome()
	{
		
		hp.getAwesome().click();
		test.log(Status.INFO,"user is able to click on awesome text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void bookstextlinks()
	{
		
		hp.getBookstextlink().click();
		test.log(Status.INFO,"user is able to click on bookstextlink button");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void camera()
	{
		
		hp.getCamera().click();
		test.log(Status.INFO,"user is able to click on camera text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void cell()
	{
		
		hp.getCell().click();
		test.log(Status.INFO,"user is able to click on cell text link");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	@Test
	public void compact()
	{
		hp.getCompact().click();
		test.log(Status.INFO,"user is able to click on compact text links");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	@Test
	public void computerlinkstext()
	{
		
		hp.getComputerlink().click();
		test.log(Status.INFO,"user is able to click on computer link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void coollinktext()
	{
		hp.getCoollinktext().click();
		test.log(Status.INFO,"user is able to click on cool link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void digitallinktext()
	{
		
		hp.getDigitallinktext().click();
		test.log(Status.INFO,"user is able to click on digital link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	 
	@Test
	public void giftlinktext()
	{
		
		hp.getGiftlinktext().click();
		test.log(Status.INFO,"user is able to click on giftlinktext");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void jewelerylinktext1()
	{
		
		hp.getJewelrylinktext().click();
		test.log(Status.INFO,"user is able to click on jewelery link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	@Test
	public void nicelinktext()
	{
		
		hp.getNicelinktext().click();
		test.log(Status.INFO,"user is able to click on nice link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void shirtlinktext()
	{
		
		hp.getShirtlinktext().click();
		test.log(Status.INFO,"user is able to click on shirt link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void shoeslinktext()
	{
		
		hp.getShoeslinktext().click();
		test.log(Status.INFO,"user is able to click on shoes link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void TCPlinktext()
	{
		
		hp.getTCPlinktext().click();
		test.log(Status.INFO,"user is able to click on TCP link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	}
	
	@Test
	public void viewAlllinktext()
	{
		
		hp.getViewalllinktext().click();
		test.log(Status.INFO,"user is able to click on view all link text");
		ms.navigateback();
		test.log(Status.INFO,"user is able to click on browser back button");
	
	}

}

