package imdb.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import imdb.elements.CreateListElements;
import imdb.utilities.SetupDrivers;

public class CreateListActions {

	
	CreateListElements listEle;
	
	public CreateListActions() {
		this.listEle = new CreateListElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, listEle);
	}
	
	
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://imdb.com");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void accuntWatchList() throws InterruptedException {
		listEle.account.click();
		Thread.sleep(2000);
		listEle.watchList.click();
		Thread.sleep(2000);
	}
	
	public void createLink() throws InterruptedException {
		listEle.createList.click();
		Thread.sleep(2000);
	}
	
	
	public void listTitleDescrption() throws InterruptedException {
		listEle.listTitle.sendKeys("Test Link 10");
		Thread.sleep(2000);
		listEle.listDescreaption.sendKeys("This is test link 10 description.");
		Thread.sleep(2000);
	}
	
	public void type() throws InterruptedException {
		
		Select type = new Select(listEle.selectType);
		type.selectByVisibleText("People");
		Thread.sleep(2000);
		
	}
	
	public void createButton() throws InterruptedException {
		listEle.createButton.click();
		Thread.sleep(2000);
	}
	
	
	public void doneButton() throws InterruptedException {
		listEle.doneButton.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
}
