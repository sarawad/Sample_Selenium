package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageFactory.AuthenticationPage;
import pageFactory.CartPage;
import pageFactory.ForgotPasswordPage;
import pageFactory.HomePage;
import pageFactory.MyAccountPage;
import pageFactory.RegisterPage;
import pageFactory.LogoutFactory;

public class ShopStepDefinition 
{
	WebDriver driver;
	AuthenticationPage ap;
	HomePage hp;
	MyAccountPage ma;
	RegisterPage reg;
	ForgotPasswordPage fp;
	CartPage pf;
	LogoutFactory lf;
	
	@Before
    public void beforeMethod()
    {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");
        ap = new AuthenticationPage(driver);
        hp = new HomePage(driver);
        ma = new MyAccountPage(driver);
        reg = new RegisterPage(driver);
        fp = new ForgotPasswordPage(driver);
        pf = new CartPage(driver);
        lf = new LogoutFactory(driver);
    }
	
	@Given("^clear the already created users before starting the scenario$")
    public void clear_the_already_created_users_before_starting_the_scenario() throws Throwable {
        System.out.println("Welcome");
    }

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        String exp = driver.getTitle();
        String act = "My Store";
        Assert.assertEquals(exp, act);
    }

    @Given("^user is on authentication page$")
    public void user_is_on_authentication_page() throws Throwable {
        hp.SignInLink().click();
    	String act = "Login - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @When("^user clicks on contact us$")
    public void user_clicks_on_contact_us() throws Throwable {
        hp.ContactUs().click();
        Thread.sleep(1000);
    }

    @When("^user clicks on sign in$")
    public void user_clicks_on_sign_in() throws Throwable {
        hp.SignInLink().click();
        Thread.sleep(1000);
    }

    @When("^user gives valid email id$")
    public void user_gives_valid_email_id() throws Throwable {
        ap.NewCustomerEmail().sendKeys("tommmyje123@gmail.com");
    }

    @When("^user gives valid details$")
    public void user_gives_valid_details() throws Throwable {
    	Thread.sleep(2000);
        reg.MrTitle().click();
    	Thread.sleep(2000);
        reg.Firstname().sendKeys("Tommmy");
        Thread.sleep(2000);
        reg.Lastname().sendKeys("Jerry");
        Thread.sleep(2000);
        reg.Password().sendKeys("tom@1234");
        Thread.sleep(2000);
        Select val = new Select(reg.Day());
        val.selectByValue("5");
        Select val1 = new Select(reg.Month());
        val1.selectByValue("5");
        Select val2 = new Select(reg.Year());
        val2.selectByValue("2005");
        reg.Newsletter().click();
        reg.OfferChechBox().click();
        reg.CompanyName().sendKeys("Capgemini");
        reg.Address1().sendKeys("siruserri,sipcot IT park");
        reg.City().sendKeys("chennai");
        Select val3 = new Select(reg.State());
        val3.selectByVisibleText("Ohio");
        reg.PostalCode().sendKeys("12345");
        Select val4 = new Select(reg.Country());
        val4.selectByVisibleText("United States");
        Thread.sleep(2000);
        reg.MobileNumber().sendKeys("9685741230");
        reg.Alias().sendKeys("office");
        Thread.sleep(2000);
    }

    @When("^user clicks on search for a product and types value$")
    public void user_clicks_on_search_for_a_product_and_types_value() throws Throwable {
        hp.Search().sendKeys("Dresses");
        hp.SearchButton().click();
    }

    @When("^user clicks on cart$")
    public void user_clicks_on_cart() throws Throwable {
        hp.Cart().click();
        Thread.sleep(1000);
    }

    @When("^user clicks on women button$")
    public void user_clicks_on_women_button() throws Throwable {
        hp.Women().click();
        Thread.sleep(1000);
    }

    @When("^user clicks on dresses button$")
    public void user_clicks_on_dresses_button() throws Throwable {
    	hp.Dresses().click();
        Thread.sleep(1000);
    }

    @When("^user clicks on tshirt button$")
    public void user_clicks_on_tshirt_button() throws Throwable {
    	hp.TShirt().click();
        Thread.sleep(1000);
    }

    @When("^user gives valid email id and password$")
    public void user_gives_valid_email_id_and_password() throws Throwable {
        ap.ExistingEmail().sendKeys("sojisona@mail.com");
        ap.Password().sendKeys("sojisona1234");
        Thread.sleep(1000);
    }

    @When("^user gives valid email id and empty password$")
    public void user_gives_valid_email_id_and_empty_password() throws Throwable {
    	ap.ExistingEmail().sendKeys("tomjerry@gmail.com");
        ap.Password().sendKeys(" ");
        Thread.sleep(1000);
    }

    @Then("^navigates to customer service page$")
    public void navigates_to_customer_service_page() throws Throwable {
    	String act = "Contact us - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to customer authentication page$")
    public void navigates_to_customer_authentication_page() throws Throwable {
    	String act = "Login - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to registration page$")
    public void navigates_to_registration_page() throws Throwable {
    	String act = "Login - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to my account page$")
    public void navigates_to_my_account_page() throws Throwable {
    	String act = "My account - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to required product page$")
    public void navigates_to_required_product_page() throws Throwable {
    	String act = "Search - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to shopping cart page$")
    public void navigates_to_shopping_cart_page() throws Throwable {
    	String act = "Order - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to women section$")
    public void navigates_to_women_section() throws Throwable {
    	String act = "Women - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to Dresses section$")
    public void navigates_to_dresses_section() throws Throwable {
    	String act = "Dresses - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^navigates to Tshirt section$")
    public void navigates_to_tshirt_section() throws Throwable {
    	String act = "T-shirts - My Store";
        String exp = driver.getTitle();
        Assert.assertEquals(exp, act);
    }

    @Then("^click on back to login$")
    public void click_on_back_to_login() throws Throwable {
        fp.BackBtn().click();
        Thread.sleep(1000);
    }

    @And("^clicks on create account$")
    public void clicks_on_create_account() throws Throwable {
        ap.CreateAnAccount().click();
        Thread.sleep(1000);
    }

    @And("^clicks on register$")
    public void clicks_on_register() throws Throwable {
        reg.SubmitBtn().click();
        Thread.sleep(1000);
    }

    @And("^clicks on sign in button$")
    public void clicks_on_sign_in_button() throws Throwable {
        ap.SigninButton().click();
        Thread.sleep(1000);
    }

    @And("^clicks on forgot password button$")
    public void clicks_on_forgot_password_button() throws Throwable {
        ap.ForgotPassword().click();
    }

    @And("^navigates to forgot password page$")
    public void navigates_to_forgot_password_page() throws Throwable {
    	String exp = "Forgot your password - My Store";
    	String act = driver.getTitle();
    	Assert.assertEquals(exp, act);
    }

    @And("^user gives valid email id and clicks on retrieve password$")
    public void user_gives_valid_email_id_and_clicks_on_retrieve_password() throws Throwable {
        fp.Email().sendKeys("sojisona@mail.com");
        fp.RetrieveBtn().click();
        Thread.sleep(1000);
    }

    @And("^navigate to confirmation page$")
    public void navigate_to_confirmation_page() throws Throwable {
    	boolean act = fp.TextMessage().getText().contains("A confirmation email has been sent to your address:");
        Assert.assertTrue(act);
    }
    
    @When("^user select product$")
    public void user_select_product() throws Throwable {
        pf.Selectitem().click();
    }

    @When("^User click on sign in$")
    public void user_click_on_sign_in() throws Throwable {
        pf.SignIn().click();
    }

    @Then("^Cart summary displays$")
    public void cart_summary_displays() throws Throwable {
       System.out.println("cart summery");
    }

    @And("^click on product$")
    public void click_on_product() throws Throwable {
    	 System.out.println("cart summery");
    }
    @And("^click on product1$")
    public void click_on_product1() throws Throwable {
    	pf.SearchedItemAdd().click();
    }

    @And("^select quantity$")
    public void select_quantity() throws Throwable {
     pf.SetQuantity().click();;
    }

    @And("^select size$")
    public void select_size() throws Throwable {
    	Select val3= new Select (pf.SetSize());
        val3.selectByVisibleText("M");
    }

    @And("^select color$")
    public void select_color() throws Throwable {
        pf.SetColor().click();
    }

    @And("^click on Addtocart$")
    public void click_on_addtocart() throws Throwable {
    	pf.AddtoCart().click();
    	Thread.sleep(1000);
    }

    @And("^click on proceed to checkout$")
    public void click_on_proceed_to_checkout() throws Throwable {
       Thread.sleep(3000);
    	pf.Proceed().click();
    }

    @And("^User enters valid email and password$")
    public void user_enters_valid_email_and_password() throws Throwable {
       pf.Email().sendKeys("niki@gmail.com");
       pf.pass().sendKeys("niki123");
    }

    @And("^click on sign in$")
    public void click_on_sign_in() throws Throwable {
        pf.SignInBtn().click();
    }
    
    @And("^click on search$")
    public void click_on_search() throws Throwable {
        pf.SearchButton().click();
    }
    @And("^click on women$")
    public void click_on_women() throws Throwable {
      pf.SelectWomen().click();
    }

    @And("^user selects product$")
    public void user_selects_product() throws Throwable {
    	pf.selectedProductWithSign().click();
    }

    @And("^click on search field$")
    public void click_on_search_feild() throws Throwable {
        pf.SearchItem().click();
    }

    @And("^enters product$")
    public void enters_product() throws Throwable {
        pf.SearchItem().sendKeys("Faded Short Sleeve T-shirts");
        
    }
    
    @Then("^Navigate to wishlist page$")
    public void navigate_to_wishlist_page() throws Throwable {
       
    }

    @And("^click on My Wishlist$")
    public void click_on_my_wishlist() throws Throwable {
    	 pf.MyWishlist().click();
    }
    
    //--- logout & report generation
    @Given("^User is on shopping home page$")
	 public void user_is_on_shopping_home_page() throws Throwable 
	 {
	        driver.get("http://automationpractice.com/index.php");
	        lf = new LogoutFactory(driver);
	 }
	    
	 @When("^User clicks on signin button$")
	 public void user_clicks_on_signin_button() throws Throwable 
	 {
	       lf.SubmitLogin().click();
	 }

	 @And("^User clicks on signin tab$")
	 public void user_clicks_on_signin_tab() throws Throwable 
	 {
	  	 lf.signin_tab().click();
	 }

	 @And("^User enters registered email and password$")
	 public void user_enters_registered_email_and_password() throws Throwable 
	 {
	        lf.email().sendKeys("kaneswilliamson1990@gmail.com");
	        lf.password().sendKeys("kane@123");
	 }

	 @And("^User clicks on sign out tab$")
	 public void user_clicks_on_sign_out_tab() throws Throwable 
	 {
	        lf.logout().click();
	 }
	 
	 
	
	
		 
		    
		    //----
		    
		    @Then("^Report generation is successful$")
		    public void report_generation_is_successful() throws Throwable {
		        lf.report().click();
		        Thread.sleep(4000);
		    }

		    
		    @And("^User clicks on profile tab$")
		    public void user_clicks_on_profile_tab() throws Throwable {
		       lf.profile().click();
		    }

		    @And("^User clicks on order history$")
		    public void user_clicks_on_order_history() throws Throwable {
		        lf.orderhistory().click();
		    }

	 
	 
    
    //---
	
    @After
    public void after()
    {
    	driver.quit();
    }
}
