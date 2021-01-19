package imdb.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninElements {

	
	@FindBy(xpath = "//div[contains(text(),'Sign In')]")
	public WebElement signInLink;
	
	
	@FindBy(xpath = "//span[contains(text(),'Sign in with IMDb')]")
	public WebElement signInWithIMDb;
	
	
	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement password;
	
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement signInButton;
	
	
	
}
