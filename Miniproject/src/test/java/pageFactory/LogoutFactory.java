package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFactory 
{
	WebDriver driver;
	
	public LogoutFactory (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement signin_tab;
	
	public WebElement signin_tab()
	{
		return signin_tab;
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement email;
	
	public WebElement email()
	{
		return email;
	}
	
	@FindBy(id="passwd")
	@CacheLookup
	WebElement password;
	
	public WebElement password()
	{
		return password;
	}
	

	@FindBy(id="SubmitLogin")
	@CacheLookup
	WebElement SubmitLogin;
	
	public WebElement SubmitLogin()
	{
		return SubmitLogin;
	}
	
	
	@FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[2]/a")
	@CacheLookup
	WebElement logout;
	
	public WebElement logout()
	{
		return logout;
	}
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
	@CacheLookup
	WebElement tshirt;
	
	public WebElement tshirt()
	{
		return tshirt;
	}
	
	@FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a/span")
	@CacheLookup
	WebElement profile;
	
	public WebElement profile()
	{
		return profile;
	}
	
	@FindBy(xpath="//*[@id=\'center_column\']/div/div[1]/ul/li[1]/a")
	@CacheLookup
	WebElement orderhistory;
	
	public WebElement orderhistory()
	{
		return orderhistory;
	}
	
	@FindBy(xpath="//*[@id=\'order-list\']/tbody/tr[1]/td[6]/a")
	@CacheLookup
	WebElement report;
	
	public WebElement report()
	{
		return report;
	}
}
