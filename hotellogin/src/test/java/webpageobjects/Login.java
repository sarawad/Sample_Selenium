package webpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver; 
		//driver.navigate().to("resources/login.html");
		driver.get("file:///C://Users//Dell//Downloads//selenium//hotellogin/login.html");
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	@CacheLookup
	private WebElement username;
	
	@FindBy(name="userPwd")
	@CacheLookup
	private WebElement password;
	
	@FindBy(className="btn")
	@CacheLookup
	private WebElement login;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	private WebElement usernameErr;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	private WebElement passwordErr;

	
	public String getUsernameErr() {
		return usernameErr.getText();
	}
	
	public String getPasswordErr() {
		return passwordErr.getText();
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}

	public String getUsernameText() {
		return username.getText();
	}

	public String getPasswordText() {
		return password.getText();
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
}
