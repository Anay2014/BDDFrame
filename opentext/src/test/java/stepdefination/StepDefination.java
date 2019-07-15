package stepdefination;

import PageObject.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	loginPage l=new loginPage();
	
	@Given("^i enter Username as <username>$")
	public void enterUsername() throws InterruptedException {
		l.launchURL();
		l.Signin();
		l.enterUsername(username);
		
		
	}
	@When("^i enter password$")
	public void password() {
		l.enterpassword();
		
	}
    @Then("^logged in$")
    public void login() {
    	l.clickLogin();
    	
    }
    
}
