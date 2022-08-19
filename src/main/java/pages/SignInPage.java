package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends PageBase{

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="email_create")
	WebElement emailAddress_register;
	
	@FindBy(id="SubmitCreate")
	WebElement createAccount_Button;
	
	@FindBy(id="email")
	WebElement emailAddress_login;
	
	@FindBy(id="passwd")
	WebElement password_login;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn;
	
	
	
	public void enterEmailAddress_register(String Email)
	{
		enterText(emailAddress_register, Email);
	}
	public void clickOnCreateAnAccount()
	{
		click(createAccount_Button);
	}
	public void enterEmailAddress_login(String Email)
	{
		enterText(emailAddress_login, Email);
	}
	public void enterEmailAddress_password(String Password)
	{
		enterText(password_login, Password);
	}
	public void clickOnSignIn()
	{
		click(signIn);
	}
	
}
