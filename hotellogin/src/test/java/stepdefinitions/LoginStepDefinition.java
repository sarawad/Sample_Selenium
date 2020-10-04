package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webpageobjects.Login;

public class LoginStepDefinition {
	
	WebDriver driver;
	Login login;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 login =new Login(driver);  Thread.sleep(1000);
	}
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	 
	  assertEquals("file:///C://Users//Dell//Downloads//selenium//hotellogin/login.html",driver.getCurrentUrl());
	}

	@When("^User leaves username empty$")
	public void user_leaves_username_empty() throws Throwable {
	   
		login.getUsername().clear();  Thread.sleep(1000);
	   login.setPassword("123456");  Thread.sleep(1000);
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		login.clickLogin();
	}

	@Then("^Alert message is displayed$")
	public void alert_message_is_displayed() throws Throwable {
		Alert alert=driver.switchTo().alert();
		System.err.println(alert.getText());
		alert.accept();
	}

	@When("^User leaves password empty$")
	public void user_leaves_password_empty() throws Throwable {
		login.setUsername("Rahul");  Thread.sleep(1000);
		login.getPassword().clear();  Thread.sleep(1000);
	}

	@When("^User leaves username and password empty$")
	public void user_leaves_username_and_password_empty() throws Throwable {
		login.getUsername().clear();  Thread.sleep(1000);
		login.getPassword().clear();  Thread.sleep(1000);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		login.getUsername().clear();
		login.setUsername(username);  Thread.sleep(1000);
//		assertEquals(username,login.getUsernameText());
		login.getPassword().clear();
		login.setPassword(password);  Thread.sleep(1000);
//		assertEquals(password,login.getPasswordText());
	}

	@Then("^User is logged into the system$")
	public void user_is_logged_into_the_system() throws Throwable {
	    assertEquals("file:///C://Users//Dell//Downloads//selenium//hotellogin/hotelbooking.html",driver.getCurrentUrl());
	    assertEquals("Hotel Booking",driver.getTitle());
	    System.out.println(driver.getTitle());
	}
	
	@Then("^Alert message is displayed password empty$")
	public void alert_message_is_displayed_password_empty() throws Throwable {
		System.err.println(login.getPasswordErr());
	}

	@Then("^Alert message is displayed username empty$")
	public void alert_message_is_displayed_username_empty() throws Throwable {
		System.err.println(login.getUsernameErr());
	}
	
	@After
	public void tearDown() {
		login=null;
		driver.close();
	}

}
