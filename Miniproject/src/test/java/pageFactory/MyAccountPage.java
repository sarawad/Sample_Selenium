package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	WebDriver driver;
    //creating parameterized constructor to initialize WebDriver reference
    public MyAccountPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    @CacheLookup // to store the element in cache memory
    WebElement singout;
   
    @FindBy(xpath="//*[@id=\"columns\"]/div[1]/a")
    @CacheLookup // to store the element in cache memory
    WebElement home;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
    @CacheLookup // to store the element in cache memory
    WebElement orderHistory;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
    @CacheLookup // to store the element in cache memory
    WebElement wishlist;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")
    @CacheLookup // to store the element in cache memory
    WebElement creditSlip;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")
    @CacheLookup // to store the element in cache memory
    WebElement myAddress;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
    @CacheLookup // to store the element in cache memory
    WebElement personalInfo;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a")
    @CacheLookup // to store the element in cache memory
    WebElement homelink;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement Singout() {
		return singout;
	}
	
	public WebElement Home() {
		return home;
	}

	public WebElement OrderHistoryAndDetails() {
		return orderHistory;
	}

	public WebElement MyWishlists() {
		return wishlist;
	}

	public WebElement MyCreditSlips() {
		return creditSlip;
	}

	public WebElement MyAddress() {
		return myAddress;
	}

	public WebElement MyPersonalInformation() {
		return personalInfo;
	}

	public WebElement Homelink() {
		return homelink;
	}  
}
