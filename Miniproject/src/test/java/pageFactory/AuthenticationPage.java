package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage 
{
	WebDriver driver;
    //creating parameterized constructor to initialize WebDriver reference
    public AuthenticationPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(id="email_create")
    @CacheLookup // to store the element in cache memory
    WebElement newEmail;
    
    @FindBy(id="SubmitCreate")
    @CacheLookup // to store the element in cache memory
    WebElement submitButton;
    
    @FindBy(id="email")
    @CacheLookup // to store the element in cache memory
    WebElement email;
    
    @FindBy(id="passwd")
    @CacheLookup // to store the element in cache memory
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"login_form\"]/div/p[1]/a")
    @CacheLookup // to store the element in cache memory
    WebElement forgotPass;
    
    @FindBy(id="SubmitLogin")
    @CacheLookup // to store the element in cache memory
    WebElement loginButton;
    
    public WebElement NewCustomerEmail() {
		return newEmail;
	}

	public WebElement CreateAnAccount() {
		return submitButton;
	}

	public WebElement ExistingEmail() {
		return email;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement ForgotPassword() {
		return forgotPass;
	}

	public WebElement SigninButton() {
		return loginButton;
	}
}
