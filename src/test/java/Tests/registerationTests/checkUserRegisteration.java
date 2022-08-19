package Tests.registerationTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestData.ExcelReader;
import Tests.TestBase;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterationPage;
import pages.SignInPage;

public class checkUserRegisteration extends TestBase {
	@DataProvider(name="RegisterTestData")
	public Object [][] userLoginData() throws IOException
	{
		Excel=new ExcelReader();
		return Excel.getExcelData(14,"RegisterTestData");
	}
	@Test(dataProvider = "RegisterTestData")
	public void checkUserRegistrationWithValidData(String email,String firstName, String lastName,String password, String FirstName_Address,String LastName_Address, String Address,String City,String State,String zipCode, String Country, String Info,String mobile,String Alias)
	{
 
		HomePage homePageObject;
		SignInPage signInPageObject;
		RegisterationPage RegisterationPageObject;
		MyAccountPage myAccountPageObject;
		
		homePageObject=new HomePage(driver);
		homePageObject.clickOnSignInButton();
		signInPageObject=new SignInPage(driver);
		signInPageObject.enterEmailAddress_register(email);
		signInPageObject.clickOnCreateAnAccount();
		RegisterationPageObject=new RegisterationPage(driver);
		RegisterationPageObject.chooseGender_Mr();
		RegisterationPageObject.enterFisrtName(firstName);
		RegisterationPageObject.enterLastName(lastName);
		RegisterationPageObject.enterPassword(password);
		RegisterationPageObject.enterFirstName_Address(FirstName_Address);
		RegisterationPageObject.enterLastName_Address(LastName_Address);
		RegisterationPageObject.enterAddress(Address);
		RegisterationPageObject.enterCity(City);
		RegisterationPageObject.enterState(State);
		RegisterationPageObject.enterZipCode(zipCode);
		RegisterationPageObject.enterCountry(Country);
		RegisterationPageObject.enterAdditionalInfo(Info);
		RegisterationPageObject.enterMobilePhone(mobile);
		RegisterationPageObject.enterAlias(Alias);
		RegisterationPageObject.clickOnRegisterButton();
		myAccountPageObject =new MyAccountPage(driver);
		assertTrue(myAccountPageObject.checkMyAccountTitle_isDisplayed());
		/////nada////
	}

}
