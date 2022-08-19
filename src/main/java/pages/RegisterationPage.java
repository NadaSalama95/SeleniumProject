package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage extends PageBase{

	public RegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "id_gender1")
	WebElement gender_Mr;
	
	@FindBy(id = "id_gender2")
	WebElement gender_Mrs;
	
	@FindBy(name = "customer_firstname")
	WebElement firstName;
	
	@FindBy(name = "customer_lastname")
	WebElement lastName;
	
	@FindBy(id="email")
	WebElement emailAddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement dateOfBirth_Days;
	
	@FindBy(id="months")
	WebElement dateOfBirth_Months;
	
	@FindBy(id="years")
	WebElement dateOfBirth_Years;
	
	@FindBy(id = "firstname")
	WebElement firstName_address;
	
	@FindBy(id = "lastname")
	WebElement lastName_address;
	
	@FindBy(id = "address1")
	WebElement address;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "postcode")
	WebElement postalCode;
	
	@FindBy(id = "id_country")
	WebElement country;
	
	@FindBy(id = "other")
	WebElement additionalInfo;
	
	@FindBy(id = "phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(id = "alias")
	WebElement alias;
	
	@FindBy(id = "submitAccount")
	WebElement registerButton;
	
	
	
	public void chooseGender_Mr()
	{
		click(gender_Mr);
	}
	public void chooseGender_Mrs()
	{
		click(gender_Mrs);
	}
	public void enterFisrtName(String CustomerFirstName)
	{
		enterText(firstName, CustomerFirstName);
	}
	public void enterLastName(String CustomerLastName)
	{
		enterText(lastName, CustomerLastName);
	}
	public void enterEmail(String CustomerEmail)
	{
		enterText(emailAddress, CustomerEmail);
	}
	public void enterPassword(String CustomerPassword)
	{
		enterText(password, CustomerPassword);
	}
	public void enterFirstName_Address(String AddressFirstName)
	{
		enterText(firstName_address, AddressFirstName);
	}
	public void enterLastName_Address(String AddressLastName)
	{
		enterText(lastName_address, AddressLastName);
	}
	public void enterAddress(String Address)
	{
		enterText(address, Address);
	}
	public void enterCity(String City)
	{
		enterText(city, City);
	}
	public void enterState(String stateName)
	{
		Dropdown=new Select(state);
		Dropdown.selectByVisibleText(stateName);
	}
	public void enterZipCode(String zipCode)
	{
		enterText(postalCode, zipCode);
	}
	public void enterCountry(String Country)
	{
		Dropdown=new Select(country);
		Dropdown.selectByVisibleText(Country);
	}
	public void enterAdditionalInfo(String info)
	{
		enterText(additionalInfo, info);
	}
	public void enterMobilePhone(String mobile)
	{
		enterText(mobilePhone, mobile);
	}
	public void enterAlias(String Alias)
	{
		enterText(alias,Alias);
	}
	public void clickOnRegisterButton()
	{
		click(registerButton);
	}
	public void registerNewUser(String firstName,String lastName,String Password,String FirstName_Address,String LastName_Address,String Address, String City,String State, String zipCode,String country, String AdditionalInfo,String MobilePhone,String Alias)
	{
		chooseGender_Mr();
		enterFisrtName(firstName);
		enterLastName(lastName);
		enterPassword(Password);
		enterFirstName_Address(FirstName_Address);
		enterLastName_Address(LastName_Address);
		enterAddress(Address);
		enterCity(City);
		enterState(State);
		enterZipCode(zipCode);
		enterCountry(country);
		enterAdditionalInfo(AdditionalInfo);
		enterMobilePhone(MobilePhone);
		enterAlias(Alias);
		clickOnRegisterButton();
	}
	
}
