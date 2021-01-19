package imdb.stepDefs;

import imdb.actions.CreateListActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateListStepDef {

	
	CreateListActions listAct = new CreateListActions();
	
	@Given("Navigate the url")
	public void navigate_the_url() {
		listAct.homePage();
	   
	}

	@When("Select your watchlist from my account list icon")
	public void select_your_watchlist_from_my_account_list_icon() throws InterruptedException {
		listAct.accuntWatchList();
	   
	}

	@When("Click on create new list link")
	public void click_on_create_new_list_link() throws InterruptedException {
	  
		listAct.createLink();
	}

	@When("Input list title and input list description")
	public void input_list_title_and_input_list_description() throws InterruptedException {
		listAct.listTitleDescrption();
	   
	}

	@When("Select type of list")
	public void select_type_of_list() throws InterruptedException {
		listAct.type();
	   
	}

	@When("Click on create button")
	public void click_on_create_button() throws InterruptedException {
		listAct.createButton();
	   
	}

	@When("Click on done button")
	public void click_on_done_button() throws InterruptedException {
		listAct.doneButton();
	   
	}


}
