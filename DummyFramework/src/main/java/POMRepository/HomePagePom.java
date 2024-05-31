package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	
	public HomePagePom(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
		}
		
	@FindBy(partialLinkText = "Books")
	private WebElement Bookstextlink;
	
		public WebElement getBookstextlink() {
		return Bookstextlink;
	}

	public WebElement getComputertext() {
		return Computertext;
	}

	public WebElement getElectronicsText() {
		return ElectronicsText;
	}

	public WebElement getApparelShoesText() {
		return ApparelShoesText;
	}

	public WebElement getDigitaldownloadstext() {
		return Digitaldownloadstext;
	}

	public WebElement getGiftCardstext() {
		return GiftCardstext;
	}

	public WebElement getTricentis() {
		return Tricentis;
	}

	public WebElement getApparel() {
		return apparel;
	}

	public WebElement getAwesome() {
		return awesome;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getCamera() {
		return camera;
	}

	public WebElement getCell() {
		return cell;
	}

	public WebElement getCompact() {
		return compact;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getCoollinktext() {
		return coollinktext;
	}

	public WebElement getDigitallinktext() {
		return digitallinktext;
	}

	public WebElement getGiftlinktext() {
		return giftlinktext;
	}

	public WebElement getJewelrylinktext() {
		return jewelrylinktext;
	}

	public WebElement getNicelinktext() {
		return nicelinktext;
	}

	public WebElement getShirtlinktext() {
		return shirtlinktext;
	}

	public WebElement getShoeslinktext() {
		return shoeslinktext;
	}

	public WebElement getTCPlinktext() {
		return TCPlinktext;
	}

	public WebElement getViewalllinktext() {
		return Viewalllinktext;
	}

	public WebElement getNewsletteremail() {
		return newsletteremail;
	}

	public WebElement getNewslettersubscribebutton() {
		return newslettersubscribebutton;
	}

	public WebElement getExcellentradio() {
		return Excellentradio;
	}

	public WebElement getGoodradio() {
		return Goodradio;
	}

	public WebElement getPoorradio() {
		return Poorradio;
	}

	public WebElement getVerybadradio() {
		return Verybadradio;
	}

	public WebElement getVotecta() {
		return votecta;
	}

	public WebElement getAddtoCartcta1() {
		return AddtoCartcta1;
	}

	public WebElement getAddtoCartcta2() {
		return AddtoCartcta2;
	}

	public WebElement getAddtoCartcta3() {
		return AddtoCartcta3;
	}

	public WebElement getAddtoCartcta4() {
		return AddtoCartcta4;
	}

	public WebElement getAddtoCartcta5() {
		return AddtoCartcta5;
	}

	public WebElement getAddtoCartcta6() {
		return AddtoCartcta6;
	}

	public WebElement getShoppingcarttext() {
		return Shoppingcarttext;
	}

	public WebElement getWishlistlintext() {
		return Wishlistlintext;
	}

		@FindBy(partialLinkText = "Log in")
		private WebElement LoginTextlink;
		

		@FindBy(id="small-searchterms")
		private WebElement serachbox;
		
		@FindBy(partialLinkText = "Jewelry")
		private WebElement Jewelery;
		
		@FindBy(partialLinkText = "Register")
		private WebElement RegisterButton;
		
		@FindBy(partialLinkText = "Computers")
		private WebElement Computertext;
		
		@FindBy(partialLinkText = "Electronics")
		private WebElement ElectronicsText;
		
		@FindBy(partialLinkText ="Apparel & Shoes")
		private WebElement ApparelShoesText;
		
		@FindBy(partialLinkText = "Digital downloads")
		private WebElement Digitaldownloadstext;
		
		@FindBy(partialLinkText = "Gift Cards")
		private WebElement GiftCardstext;
		
		@FindBy(partialLinkText = "Tricentis")
		private WebElement Tricentis;
		
		@FindBy(partialLinkText = "apparel")
		private WebElement apparel;
		
		@FindBy(partialLinkText = "awesome")
		private WebElement awesome;
		
		@FindBy(partialLinkText = "book")
		private WebElement book;
		
		@FindBy(partialLinkText = "camera")
		private WebElement camera;
		
		@FindBy(partialLinkText = "cell")
		private WebElement cell;
		
		@FindBy(partialLinkText = "compact")
		private WebElement compact;
		
		@FindBy(partialLinkText = "computer")
		private WebElement computerlink;
		
		@FindBy(partialLinkText = "cool")
		private WebElement coollinktext;
		
		@FindBy(partialLinkText = "digital")
		private WebElement digitallinktext;
		
		@FindBy(partialLinkText = "gift")
		private WebElement giftlinktext;
		
		@FindBy(partialLinkText = "jewelry")
		private WebElement jewelrylinktext;
		
		@FindBy(partialLinkText = "nice")
		private WebElement nicelinktext;
		
		@FindBy(partialLinkText = "shirt")
		private WebElement shirtlinktext;
		
		@FindBy(partialLinkText = "shoes")
		private WebElement shoeslinktext;
		
		@FindBy(partialLinkText = "TCP")
		private WebElement TCPlinktext;
		
		@FindBy(partialLinkText = "View all")
		private WebElement Viewalllinktext;
		
		@FindBy(id="newsletter-email")
		private WebElement newsletteremail;
		
		@FindBy(id="newsletter-subscribe-button")
		private WebElement newslettersubscribebutton;
		
		@FindBy(partialLinkText = "Excellent")
		private WebElement Excellentradio;
		
		@FindBy(partialLinkText = "Good")
		private WebElement Goodradio;
		
		@FindBy(partialLinkText = "Poor")
		private WebElement Poorradio;
		
		@FindBy(partialLinkText = "Very bad")
		private WebElement Verybadradio;
		
		@FindBy(id="vote-poll-1")
		private WebElement votecta;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][1]")
		private WebElement AddtoCartcta1;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][2]")
		private WebElement AddtoCartcta2;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][3]")
		private WebElement AddtoCartcta3;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][4]")
		private WebElement AddtoCartcta4;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][5]")
		private WebElement AddtoCartcta5;
		
		@FindBy(xpath="//input[@value=\"Add to cart\"][6]")
		private WebElement AddtoCartcta6;
		
		@FindBy(partialLinkText = "Shopping cart")
		private WebElement Shoppingcarttext;
		
		@FindBy(partialLinkText = "Wishlist")
		private WebElement Wishlistlintext;
		
		
		public WebElement getRegistertext() {
			return RegisterButton;
		}

		public WebElement getSerachbox() {
			return serachbox;
		}

		public WebElement getJewelery() {
			return Jewelery;
		}
		
		public WebElement getLoginTextlink() {
			return LoginTextlink;
		}

		public WebElement getRegisterButton() {
			return RegisterButton;
		}
		
	

}
