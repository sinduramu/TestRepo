package stepdefinitions;

import TodoMVCPages.TodoMVCPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TodoMVCSteps {
	
	
	
	private TodoMVCPage todoPage=new TodoMVCPage(DriverFactory.getDriver());
	
	
	@Given("an empty Todo list")
	public void an_empty_todo_list() {
	    
		DriverFactory.getDriver()
				.get("https://todomvc.com/examples/vue/");
	}

	@When("I add a Todo for {string}")
	public void i_add_a_todo_for(String string) {
	
	}

	@Then("only that item is listed")
	public void only_that_item_is_listed() {
	    
	   
	}

	@Then("the list summary is {string}")
	public void the_list_summary_is(String string) {

	}

	@Then("the list’s filter is set to {string} with {string} & {string} unset")
	public void the_list_s_filter_is_set_to_with_unset(String string, String string2, String string3) {
	  
	}

	@Then("{string} is unavailable")
	public void is_unavailable(String string) {
	 
	}
}
