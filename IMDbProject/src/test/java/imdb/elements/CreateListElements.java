package imdb.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateListElements {

	
	@FindBy(xpath = "//*[@id=\"imdbHeader\"]/div[2]/div[6]/div/label[2]/div/span")
	public WebElement account;
	
	@FindBy(xpath = "//*[@id=\"navUserMenu-contents\"]/ul/a[3]")
	public WebElement watchList;
	
	
	@FindBy(xpath = "//h3[contains(text(),'Create a new list')]")
	public WebElement createList;
	
	
	@FindBy(xpath = "//textarea[@id='list-create-name']")
	public WebElement listTitle;
	
	
	@FindBy(xpath = "//textarea[@id='list-create-description']")
	public WebElement listDescreaption;
	
	@FindBy(xpath = "//select[@id='list-create-type']")
	public WebElement selectType;
	
	
	@FindBy(xpath = "//button[contains(text(),'CREATE')]")
	public WebElement createButton;
	
	
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	public WebElement doneButton;
	
}
