package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	protected static WebDriver driver;
	public static WebDriverWait wait;
	protected static Select Dropdown;
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	protected static void click(WebElement element)
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	protected static void enterText(WebElement element,String text)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
}
