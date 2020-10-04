package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement item;
	
	public WebElement Selectitem() 
	{
		return item;
	}

	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]/span/i")
	@CacheLookup
	WebElement qty;
	
	public WebElement SetQuantity() 
	{
		return qty;
	}
	
	@FindBy(id="group_1")
	@CacheLookup
	WebElement size;
	
	public WebElement SetSize() 
	{
		return size;
	}
	
	@FindBy(id="color_13")
	@CacheLookup
	WebElement clr;
	
	public WebElement SetColor() 
	{
		return clr;
	}
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	@CacheLookup
	WebElement addbtn;
	
	public WebElement AddtoCart() 
	{
		return addbtn;
	}
	
	
	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a")
	@CacheLookup
	WebElement proceed;
	
	public WebElement Proceed() 
	{
		return proceed;
	}
	
	

	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement signin;
	
	public WebElement SignIn() 
	{
		return signin;
	}
	@FindBy(id="email")
	@CacheLookup
	WebElement email;
	
	public WebElement Email() 
	{
		return email;
	}
	@FindBy(id="passwd")
	@CacheLookup
	WebElement pass;
	
	public WebElement pass() 
	{
		return pass;
	}
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	@CacheLookup
	WebElement loginbtn;
	
	public WebElement SignInBtn() 
	{
		return loginbtn;
	}
	
	
	@FindBy(xpath="//*[@id=\"search_query_top\"]")
	@CacheLookup
	WebElement search;
	
	public WebElement SearchItem() 
	{
		return search;
	}
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	@CacheLookup
	WebElement searchBtn;
	
	public WebElement SearchButton() 
	{
		return searchBtn;
	}
	

	@FindBy(id="quantity_wanted")
	@CacheLookup
	WebElement selected;
	
	public WebElement SearchedItem() 
	{
		return selected;
	}
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement select;
	
	public WebElement SearchedItemAdd() 
	{
		return select;
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	@CacheLookup
	WebElement women;
	
	public WebElement SelectWomen() 
	{
		return women;
	}

	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement sel;
	
	public WebElement selectedProductWithSign() 
	{
		return sel;
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
	@CacheLookup
	WebElement add;
	
	public WebElement MyWishlist() 
	{
		return add;
	}
	
	
	
	
}
