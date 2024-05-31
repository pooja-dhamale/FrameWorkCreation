package genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Methods extends BaseClass{

	public static void scrollTillWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollTillWebElementdown(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	}
	
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);");
	}

	public static void passValue(WebDriver driver, WebElement element, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+value+"'", element);
	}
	
	public void selectDropDownByValue(WebElement dropdown,String value)
	{
		Select s= new Select(dropdown);
		s.selectByValue(value);
		
	}
	
	public void selectDropDownByVisibleText(WebElement dropdown,String visibleText)
	{
		
		Select s= new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void clickOnElement(WebElement targetElement) {
		Actions actions= new Actions(driver);
		actions.click(targetElement).perform();
	}

	public void doubleClickOnElement(WebElement targetElement) {
		Actions actions= new Actions(driver);
		actions.doubleClick(targetElement).perform();
	} 
	
	public void rightClickOnElement(WebElement targetElement) {
		Actions actions= new Actions(driver);
		actions.contextClick(targetElement).perform();
		
		
	}
	
}


