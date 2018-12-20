package stepDefinition;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
//import cucumber.runtime.PendingException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.FeaturedPageObjects;

public class DriverCommon {
	
	//was made protected from testlistener class
	protected static AndroidDriver<AndroidElement>  driver;
	
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		

		File file = new File("src");
		File fs = new File(file, "QA-SBSAndroid_2.5.5(3260).apk");
		//File fs = new File(file, "app-qa-release.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();	
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SBSemulator");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.sbs.ondemand.*");
				
		
		driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		System.out.println("----------App launched-----------");
		return driver;
		
	}

	public static boolean isElementPresent(By locatorKey) {
		boolean isPresent = false;
		try {
			isPresent = driver.findElements(locatorKey).size() > 0;
		} catch (Exception | AssertionError e) {
			Assert.fail(e.getMessage(), e);
		}
		return isPresent;
	}

@AfterSuite
	public WebDriver getDriver()
	{
	    return driver;
	}
	
@AfterClass
public static void teardown() {
	
	driver.quit();
}
	

public static void click(By Key) throws Exception, NoSuchElementException {
	try {
		System.out.println(Key);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(Key).click();
	} catch (NoSuchElementException ex) {
		throw new Exception("Unable to find/click the element" + Key, ex);
	}
}
}
