package imdb.stepDefs;

import org.testng.Assert;

import imdb.actions.SigninActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStefDef {

	SigninActions signAct = new SigninActions();
	
	@When("Click on sign in link from upper right corner")
	public void click_on_sign_in_link_from_upper_right_corner() throws InterruptedException {
		signAct.signInLink();
	   
	}

	@When("Click on sign in with IMDb link")
	public void click_on_sign_in_with_IMDb_link() throws InterruptedException {
		signAct.signInWithIMDb();
	   
	}

	@When("enter email and password")
	public void enter_email_and_password() throws InterruptedException {
		signAct.emailPass();
	   
	}

	@When("click on sign in button")
	public void click_on_sign_in_button() throws InterruptedException {
		signAct.signInButton();
	   
	}

	@Then("display home page")
	public void display_home_page() {
	   
		String actualTitle = signAct.title();
		String expectedTitle = "IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows";
		Assert.assertEquals(expectedTitle,actualTitle);
		
		
	}

	
	
}
