package imdb.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElements {

	// ----------- add list elements -------------
	
	@FindBy(xpath = "//div[contains(text(),'Menu')]")
	public WebElement menuIcon;
	
	@FindBy(xpath = "//*[@id=\"imdbHeader\"]/div[2]/aside/div/div[2]/div/div[1]/span/div/div/ul/a[4]")
	public WebElement mostPopulerMovieSubMenu;
	
	
	
	
	
	@FindBy(xpath = "//tbody/tr/td[5]")
	public List<WebElement> movieList;
	
	
	
	@FindBy(xpath = "//*[@id=\"imdbHeader\"]/div[2]/div[6]/div/label[2]/div/span")
	public WebElement accountLink;
	
	@FindBy(xpath = "//*[@id=\"navUserMenu-contents\"]/ul/a[3]")
	public WebElement yourWatchList;
	
	@FindBy(xpath = "//*[@id=\"center-1-react\"]/div/div[2]/div[1]/div[2]/div")
	public WebElement listText;
	
	
	//---------  remove elements  -----------------------
	
	
	
	@FindBy(xpath = "//*[@id=\"center-1-react\"]/div/div[3]/div/div")
	public List<WebElement> movieRemoveList;
	
	
	
	
}
