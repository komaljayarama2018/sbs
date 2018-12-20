package stepDefinition;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VideoPlayTest extends DriverCommon {

	
	
	@When ("^the user plays a video from the featured screen$")

	public static void the_user_plays_a_video_from_the_featured_screen()
			throws NoSuchElementException, Exception {
		
		String shelfTitle = "POPULAR MOVIES";
		//String shelfTitle = "Intimate Parts";
		String shelfOnFeatured ="//android.widget.TextView[@text='"+ shelfTitle +"']/../following-sibling::android.support.v7.widget.RecyclerView[@index='2']/android.widget.LinearLayout[@index='0']";
		//String shelfOnFeatured ="//android.widget.TextView[@text='"+ shelfTitle +"']";
		//String shelfOnFeatured ="//android.support.v7.widget.RecyclerView[@index='2']/android.widget.LinearLayout[@index='0']";
		click(By.xpath(shelfOnFeatured));	
	}
	
	@Then ("^the user is prompted to login$")
	public static void thenThis() {
		System.out.println("Clicked!!");
	}
}
