package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
    //creating parameterized constructor to initialize WebDriver reference
    public HomePage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div//div[1]/a")
    @CacheLookup // to store the element in cache memory
    WebElement signIn;
    
    @FindBy(xpath="//*[@id=\"contact-link\"]/a")
    @CacheLookup // to store the element in cache memory
    WebElement contactUs;
    
    @FindBy(xpath="//*[@id=\"search_query_top\"]")
    @CacheLookup // to store the element in cache memory
    WebElement search;
    
    @FindBy(xpath="//*[@id=\"header\"]/div[3]//div[3]//a")
    @CacheLookup // to store the element in cache memory
    WebElement cart;
    
    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    @CacheLookup // to store the element in cache memory
    WebElement women;
    
    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    @CacheLookup // to store the element in cache memory
    WebElement dresses;
    
    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    @CacheLookup // to store the element in cache memory
    WebElement tShirt;
    
    @FindBy(xpath="//*[@id=\"searchbox\"]/button")
    @CacheLookup // to store the element in cache memory
    WebElement searchBtn;
    
    public WebElement SearchButton() {
		return searchBtn;
	}
    
	public WebElement SignInLink() {
		return signIn;
	}

	public WebElement ContactUs() {
		return contactUs;
	}

	public WebElement Search() {
		return search;
	}

	public WebElement Cart() {
		return cart;
	}

	public WebElement Women() {
		return women;
	}

	public WebElement Dresses() {
		return dresses;
	}

	public WebElement TShirt() {
		return tShirt;
	}
    
    
    
}
