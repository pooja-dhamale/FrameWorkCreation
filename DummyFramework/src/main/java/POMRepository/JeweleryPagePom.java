package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeweleryPagePom {
	
	public JeweleryPagePom(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="products-orderby")
	WebElement sortbydropdown;
	
	@FindBy(id="products-pagesize")
	WebElement displayperpagesdropdown;
	
	@FindBy(id="products-viewmode")
	WebElement productsviewmodedropdown;
	
	@FindBy(xpath="//input[@value=\"Add to cart\"][1]")
     WebElement addtocartcta1;
	
	@FindBy(xpath="//input[@value=\"Add to cart\"][2]")
    WebElement addtocartcta2;
	
	public WebElement getAddtocartcta1() {
		return addtocartcta1;
	}

	public WebElement getAddtocartcta2() {
		return addtocartcta2;
	}

	public WebElement getSortbydropdown() {
		return sortbydropdown;
	}

	public WebElement getDisplayperpagesdropdown() {
		return displayperpagesdropdown;
	}

	public WebElement getProductsviewmodedropdown() {
		return productsviewmodedropdown;
	}
}
