package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {
	
	public LoginPagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	private WebElement EmailIDtextField;
	
	@FindBy(id="Password")
	private WebElement PasswordField;
	
	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement LoginButton;
	
	
	@FindBy(partialLinkText = "Log out")
	private WebElement Logout;
	
	
	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getEmailIDtextField() {
		return EmailIDtextField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	

}
