package Tests.LoginTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.ExcelReader;
import Tests.TestBase;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

public class checkLoginwithValidUserNameAndPassword extends TestBase {
	@DataProvider(name="LoginTestData")
	public Object [][] userLoginData() throws IOException
	{
		Excel=new ExcelReader();
		return Excel.getExcelData();
	}
	
	@Test(dataProvider = "LoginTestData")
	public void checkLoginwithValidUserNameAndPassword(String email, String password)
	{
		HomePage homePageObject;
		SignInPage signInPageObject;
		MyAccountPage myAccountPageObject;
		
		
		homePageObject=new HomePage(driver);
		homePageObject.clickOnSignInButton();
		signInPageObject=new SignInPage(driver);
		signInPageObject.enterEmailAddress_login(email);
		signInPageObject.enterEmailAddress_password(password);
		signInPageObject.clickOnSignIn();
		myAccountPageObject=new MyAccountPage(driver);
		assertTrue(myAccountPageObject.checkMyAccountTitle_isDisplayed());
	}

}
