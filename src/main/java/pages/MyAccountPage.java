package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "center_column")
	WebElement MyAccount;
	
	@FindBy(className = "logout")
	WebElement signOut;
	
	
	public boolean checkMyAccountTitle_isDisplayed()
	{
		return MyAccount.isDisplayed();
	}
	public void signOut()
	{
		click(signOut);
	}
	

}
