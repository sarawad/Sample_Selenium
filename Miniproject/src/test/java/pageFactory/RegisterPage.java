package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	WebDriver driver;
    //creating parameterized constructor to initialize WebDriver reference
    public RegisterPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(id="id_gender1")
    @CacheLookup // to store the element in cache memory
    WebElement mrTitle;
    
    @FindBy(xpath="//*[@id=\"id_gender2\"]")
    @CacheLookup // to store the element in cache memory
    WebElement mrsTitle;
    
    @FindBy(xpath="//*[@id='customer_firstname']")
    @CacheLookup // to store the element in cache memory
    WebElement fname;
    
    @FindBy(id="customer_lastname")
    @CacheLookup // to store the element in cache memory
    WebElement lname;
    
    @FindBy(id="passwd")
    @CacheLookup // to store the element in cache memory
    WebElement password;
    
    @FindBy(id="days")
    @CacheLookup // to store the element in cache memory
    WebElement day;
    
    @FindBy(id="months")
    @CacheLookup // to store the element in cache memory
    WebElement month;
    
    @FindBy(id="years")
    @CacheLookup // to store the element in cache memory
    WebElement year;
    
    @FindBy(id="newsletter")
    @CacheLookup // to store the element in cache memory
    WebElement newsletter;
    
    @FindBy(id="optin")
    @CacheLookup // to store the element in cache memory
    WebElement offer;
    
    @FindBy(id="company")
    @CacheLookup // to store the element in cache memory
    WebElement company;
    
    @FindBy(id="address1")
    @CacheLookup // to store the element in cache memory
    WebElement address1;
    
    @FindBy(id="address2")
    @CacheLookup // to store the element in cache memory
    WebElement address2;
    
    @FindBy(id="city")
    @CacheLookup // to store the element in cache memory
    WebElement city;
    
    @FindBy(id="id_state")
    @CacheLookup // to store the element in cache memory
    WebElement state;
    
    @FindBy(id="postcode")
    @CacheLookup // to store the element in cache memory
    WebElement postCode;
    
    @FindBy(id="id_country")
    @CacheLookup // to store the element in cache memory
    WebElement country;
    
    @FindBy(id="other")
    @CacheLookup // to store the element in cache memory
    WebElement other;
    
    @FindBy(id="phone")
    @CacheLookup // to store the element in cache memory
    WebElement homePhn;
    
    @FindBy(id="phone_mobile")
    @CacheLookup // to store the element in cache memory
    WebElement mobile;
    
    @FindBy(id="alias")
    @CacheLookup // to store the element in cache memory
    WebElement alias;
    
    @FindBy(id="submitAccount")
    @CacheLookup // to store the element in cache memory
    WebElement submitBtn;
	
	public WebElement MrTitle() {
		return mrTitle;
	}
	
	public WebElement MrsTitle() {
		return mrsTitle;
	}

	public WebElement Firstname() {
		return fname;
	}

	public WebElement Lastname() {
		return lname;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Day() {
		return day;
	}

	public WebElement Month() {
		return month;
	}

	public WebElement Year() {
		return year;
	}

	public WebElement Newsletter() {
		return newsletter;
	}

	public WebElement OfferChechBox() {
		return offer;
	}

	public WebElement CompanyName() {
		return company;
	}

	public WebElement Address1() {
		return address1;
	}

	public WebElement Address2() {
		return address2;
	}

	public WebElement City() {
		return city;
	}

	public WebElement State() {
		return state;
	}

	public WebElement PostalCode() {
		return postCode;
	}

	public WebElement Country() {
		return country;
	}

	public WebElement AdditionalInfo() {
		return other;
	}

	public WebElement HomePhnNumber() {
		return homePhn;
	}

	public WebElement MobileNumber() {
		return mobile;
	}

	public WebElement Alias() {
		return alias;
	}

	public WebElement SubmitBtn() {
		return submitBtn;
	}
    
}
