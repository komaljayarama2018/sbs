package stepDefinition;
import java.io.*;
import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.it.Date;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



// runner class
@RunWith(Cucumber.class)
@CucumberOptions(
	features = "Feature",
	glue= {"stepDefinition"},
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome = true
)
public class testRunner {

	
//	@AfterClass
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File("C:/Users/Komal Jayarama/eclipse-workspace/appium/SBSMaven/extent-config.xml"));
//	}
	
	
	
}
