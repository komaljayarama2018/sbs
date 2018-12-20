package stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import utils.ExtentReports.ExtentTestManager;
import pageObjects.FeaturedPageObjects;
import pageObjects.LoginPageObjects;

public class LoginTest extends DriverCommon{
		 
	 public static AndroidDriver<AndroidElement> driver;
	 static LoginPageObjects loginPage;
	 static FeaturedPageObjects featuredPage;
	
	 @Given ("^the app is launched$") 
	 public static void the_app_is_launched()  throws MalformedURLException {
				driver = capabilities();	
			}
	 
	 
	@Given ("^the user is on the login page$")
	public static void the_user_is_on_the_login_page() throws MalformedURLException {
		
		
		System.out.println("----------User is on the Login/Sign-up Screen-----------");	
	}

	@When ("^username \"(.*?)\" and password \"(.*?)\" is entered$") 
	public static void username_and_passowrd_is_entered(String username, String password) throws MalformedURLException {

	loginPage = new LoginPageObjects(driver);	
	
	if (isElementPresent(LoginPageObjects.nextBtn)) {
	loginPage.skipWelcomePages();
	loginPage.singInFromLandingPage();
	}
	
	loginPage.login(username, password);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	@Then ("^the user is logged in$")	

	public static void the_user_is_logged_in() throws MalformedURLException {		
	
	featuredPage = new FeaturedPageObjects(driver);	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	if((isElementPresent(featuredPage.castOverlay))) {
		featuredPage.featuredBottomMenu.click();
	}
	
	Assert.assertTrue("Login unsuccessfull", isElementPresent(FeaturedPageObjects.sidemenu));		
	}
	
	@Then ("^the user is not logged in$")
	public static void the_user_is_not_logged_in() {
		
		Assert.assertTrue("Error message for invalid credentials missing", isElementPresent(LoginPageObjects.invalidCredentialsErr));	
	}
	

}
