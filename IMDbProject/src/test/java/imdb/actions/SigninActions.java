package imdb.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;


import imdb.elements.SigninElements;
import imdb.utilities.SetupDrivers;

public class SigninActions {

	
	SigninElements signEle;
	
	
	public SigninActions() {
		this.signEle = new SigninElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, signEle);
	}
	
	
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://imdb.com");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void signInLink() throws InterruptedException {
		signEle.signInLink.click();
		Thread.sleep(2000);
	}
	
	public void signInWithIMDb() throws InterruptedException {
		signEle.signInWithIMDb.click();
		Thread.sleep(2000);
	}
	
	
	public void emailPass() throws InterruptedException {
		signEle.email.sendKeys("kf.email20@gmail.com");
		Thread.sleep(2000);
		signEle.password.sendKeys("12345678");
		Thread.sleep(2000);
	}
	
	
	public void signInButton() throws InterruptedException {
		signEle.signInButton.click();
		Thread.sleep(2000);
	}
	
	public String title() {
		String title = SetupDrivers.chromeDriver.getTitle();
		System.out.println(title);
		return title;
		
		
	}
	
	
	
}
