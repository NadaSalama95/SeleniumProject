package Tests.registerationTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Tests.TestBase;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterationPage;
import pages.SignInPage;

public class checkUserRegisteration extends TestBase {
	@Test
	public void checkUserRegistrationWithValidData()
	{
 
		HomePage homePageObject;
		SignInPage signInPageObject;
		RegisterationPage RegisterationPageObject;
		MyAccountPage myAccountPageObject;
		
		homePageObject=new HomePage(driver);
		homePageObject.clickOnSignInButton();
		signInPageObject=new SignInPage(driver);
		signInPageObject.enterEmailAddress_register("nadasalama8@gmail.com");
		signInPageObject.clickOnCreateAnAccount();
		RegisterationPageObject=new RegisterationPage(driver);
		RegisterationPageObject.chooseGender_Mr();
		RegisterationPageObject.enterFisrtName("Nada");
		RegisterationPageObject.enterLastName("Ahmed");
		RegisterationPageObject.enterPassword("Password@1234");
		RegisterationPageObject.enterFirstName_Address("Address first name is here");
		RegisterationPageObject.enterLastName_Address("Address last name is here");
		RegisterationPageObject.enterAddress("Address is here");
		RegisterationPageObject.enterCity("City is here");
		RegisterationPageObject.enterState("Alaska");
		RegisterationPageObject.enterZipCode("00202");
		RegisterationPageObject.enterCountry("United States");
		RegisterationPageObject.enterAdditionalInfo("hello ");
		RegisterationPageObject.enterMobilePhone("01234567790");
		RegisterationPageObject.enterAlias("ALias is here");
		RegisterationPageObject.clickOnRegisterButton();
		myAccountPageObject =new MyAccountPage(driver);
		assertTrue(myAccountPageObject.checkMyAccountTitle_isDisplayed());
		/////nada////
	}

}
