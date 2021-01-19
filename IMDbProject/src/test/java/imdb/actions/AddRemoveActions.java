package imdb.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import imdb.elements.AddRemoveElements;
import imdb.utilities.SetupDrivers;

public class AddRemoveActions {

	
	AddRemoveElements addRemoveEle;
	
	public AddRemoveActions() {
		this.addRemoveEle = new AddRemoveElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, addRemoveEle);
	}
	
	
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://imdb.com");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	// ----------- add list Actions -------------
	public void menuLink() throws InterruptedException {
		addRemoveEle.menuIcon.click();
		Thread.sleep(2000);
	}
	
	
	public void movieSubmenuLink() throws InterruptedException {
		addRemoveEle.mostPopulerMovieSubMenu.click();
		Thread.sleep(2000);
	}
	
	public void movieList() throws InterruptedException {
		
		addRemoveEle.movieList.get(3).click();
		addRemoveEle.movieList.get(11).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(21).click();
		addRemoveEle.movieList.get(22).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(23).click();
		addRemoveEle.movieList.get(24).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(28).click();
		addRemoveEle.movieList.get(29).click();
		addRemoveEle.movieList.get(33).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(34).click();
		addRemoveEle.movieList.get(36).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(43).click();
		addRemoveEle.movieList.get(44).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(47).click();
		addRemoveEle.movieList.get(48).click();
		Thread.sleep(2000);
		addRemoveEle.movieList.get(49).click();
		addRemoveEle.movieList.get(50).click();
		addRemoveEle.movieList.get(52).click();
		
		
		/*
		 for (WebElement cell : addRemoveEle.movieList) { 
		       cell.click();
		    }
		
		
		*/
		
	}
	
	
	
	public void account() throws InterruptedException {
		addRemoveEle.accountLink.click();
		Thread.sleep(2000);
	}
	
	public void watchList() throws InterruptedException {
		addRemoveEle.yourWatchList.click();
		Thread.sleep(2000);
	}
	
	public void listText() throws InterruptedException {
		addRemoveEle.listText.isDisplayed();
		Thread.sleep(2000);
	}
	
	//---------  remove actions  -----------------------
	
	
	public void removeMovieList() throws InterruptedException {
		
		
		addRemoveEle.movieRemoveList.get(2).click();
		addRemoveEle.movieRemoveList.get(3).click();
		
		
	}
	
	public void refreshPage() {
		SetupDrivers.chromeDriver.get("https://www.imdb.com/user/ur128497456/watchlist?ref_=nv_usr_wl");
		SetupDrivers.chromeDriver.navigate().refresh();
		
	}
	
	
	
	
}
