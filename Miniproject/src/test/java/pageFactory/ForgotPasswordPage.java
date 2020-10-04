package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage 
{
	WebDriver driver;
    //creating parameterized constructor to initialize WebDriver reference
    public ForgotPasswordPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(id = "email")
    @CacheLookup // to store the element in cache memory
    WebElement email;
    
    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    @CacheLookup // to store the element in cache memory
    WebElement retrieveBtn;
    
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a")
    @CacheLookup // to store the element in cache memory
    WebElement backBtn;
    
    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    @CacheLookup // to store the element in cache memory
    WebElement textMsg;
    
	public WebElement Email() {
		return email;
	}

	public WebElement RetrieveBtn() {
		return retrieveBtn;
	}

	public WebElement BackBtn() {
		return backBtn;
	}
    
	public WebElement TextMessage() {
		return textMsg;
	}
}
