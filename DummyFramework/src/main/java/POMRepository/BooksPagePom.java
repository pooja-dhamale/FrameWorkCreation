package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPagePom {
	
	public BooksPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement productdropdown;

	public WebElement getProductdropdown() {
		return productdropdown;
	}

}
