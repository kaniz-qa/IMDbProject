package imdb.stepDefs;

import imdb.actions.AddRemoveActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRemoveStepDef {

	
	AddRemoveActions addRemoveAct = new AddRemoveActions();
	
	// ----------- add list stepDef -------------
	
	@When("Click on menu icon")
	public void click_on_menu_icon() throws InterruptedException {
		addRemoveAct.menuLink();
	   
	}

	@When("Click on most popular menu link")
	public void click_on_most_popular_menu_link() throws InterruptedException {
	   
		addRemoveAct.movieSubmenuLink();
	}

	@When("click on add to watchlist icon")
	public void click_on_add_to_watchlist_icon() throws InterruptedException {
	   
		addRemoveAct.movieList();
	}

	@When("Click on account icon")
	public void click_on_account_icon() throws InterruptedException {
		addRemoveAct.account();
	   
	}

	@When("select your watchlist")
	public void select_your_watchlist() throws InterruptedException {
		addRemoveAct.watchList();
	   
	}

	@Then("I can show all selected watch list")
	public void i_can_show_all_selected_watch_list() throws InterruptedException {
	   
		addRemoveAct.listText();
	}

	
	//---------  remove stepDef  -----------------------
	
	

	@When("Click on remove from watchlist icon")
	public void click_on_remove_from_watchlist_icon() throws InterruptedException {
		addRemoveAct.removeMovieList();
	    
	}

	@Then("refresh the page , after that I am not able to see in the watch list")
	public void refresh_the_page_after_that_I_am_not_able_to_see_in_the_watch_list() {
		addRemoveAct.refreshPage();
	    
	}


	
	
	
	
	
	
	
	
	
	
	
}
