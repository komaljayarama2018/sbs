package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FeaturedPageObjects {

public FeaturedPageObjects() {
		
    }

	public FeaturedPageObjects(AndroidDriver driver) {
	   
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
		
//		@AndroidFindBy(xpath = "//android.widget.ImageButton[@class='android.widget.ImageButton']")
//		public WebElement sidemenu;
//		
		public static final By sidemenu = By.xpath("//android.widget.ImageButton[@class='android.widget.ImageButton']");
		
//		@AndroidFindBy(id = "com.sbs.ondemand.android.qa:id/cast_featurehighlight_help_text_header_view")
//		public WebElement castOverlay;
		
		public static final By castOverlay = By.xpath("com.sbs.ondemand.android.qa:id/cast_featurehighlight_help_text_header_view");
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Featured']")
		public WebElement featuredBottomMenu;
				
			
}
