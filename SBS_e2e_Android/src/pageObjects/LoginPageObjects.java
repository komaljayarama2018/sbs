package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
//import StepDefinition.PageObjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import stepDefinition.DriverCommon;

public class LoginPageObjects {
	
	
	public LoginPageObjects() {
		
    }
    
	public LoginPageObjects(AndroidDriver driver) {
    
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
//	@AndroidFindBy(xpath = "//android.widget.EditText[@text='youremail@domain.com.au']")
//	public AndroidElement usernameTxt;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='EMAIL / USERNAME']/following-sibling::android.widget.FrameLayout/android.widget.EditText")
	public AndroidElement usernameTxt;
	
//	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
//	public AndroidElement passwordTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PASSWORD']/following-sibling::android.widget.FrameLayout/android.widget.EditText")
	public AndroidElement passwordTxt;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_action")
	public AndroidElement forgotPasswordLink;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_login")
	public AndroidElement logInBtn;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_createaccount")
	public AndroidElement createAccountBtn;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_facebook")
	public AndroidElement facebookBtn;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_google")
	public AndroidElement googleBtn;
		
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_next")
    public AndroidElement next;
	
	public static final By nextBtn = By.id("com.sbs.ondemand.android.qa:id/btn_next");
	
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_signin")
    public AndroidElement signInBtn;
	
	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/btn_skip")
    public AndroidElement skipAndBrowseBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@class='android.widget.ImageButton']")
	public WebElement sidemenu;
	
//	@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/lbl_error")
//	public AndroidElement invalidCredentialsErr;
	public static final By invalidCredentialsErr = By.id("com.sbs.ondemand.android.qa:id/lbl_error");
	
	public void login(String username, String password) {
		
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		logInBtn.click();
		
	}
	
	public void skipWelcomePages() {
		
		(next).click();
		(next).click();	
	}
	
	public void skipAndBrowse() {
		skipAndBrowseBtn.click();
	}
	
	public void singInFromLandingPage() {
		signInBtn.click();
	}
	
	public void goToLoginScreenFromSideMenu() {
		sidemenu.click();
	}
	
}
