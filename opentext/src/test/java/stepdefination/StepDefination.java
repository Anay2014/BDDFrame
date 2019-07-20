package stepdefination;

import PageObject.CrmLogin;
import PageObject.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	loginPage l=new loginPage();
	CrmLogin lg= new CrmLogin();
	
@Given("^user enter$")
	public void enterUsername(String username) throws InterruptedException {
		l.launchURL();
		l.Signin();
		l.enterUsername();
		
		
	}
	@When("^i enter password$")
	public void password() {
		l.enterpassword();
		
	}
	@When("^i enter the \"(.*?)\"$")
	public void passwd(String password) {
		lg.enterPswd(password);
	}
    @Then("^logged in$")
    public void login() {
    	l.clickLogin();
    	
    }
  
  
  @Given("^i enter the username$")
  public void enterUN() throws InterruptedException {
	 
     lg.StartUrl();
     lg.enterUN();
  }
     @Then("^i logged in to freeCRM$")
     public void clicklogin() throws InterruptedException{
     lg.clickLogin();

     }
     @Then("^i validate the Header contacts activity stream$")
     public void contacts() throws InterruptedException {
    	 lg.Contacts();
     }
     @Then("^i validate the header Deals$")
     public void deals() throws InterruptedException {
    	 lg.Deals();
     }
     @Then("^i Validate the header Call Queue$")
  public void callQueue() {
    	 lg.CallQueue();
     }
     @When("^i click on campaigns tab$")
     public void campaigns() throws InterruptedException {
    	 lg.campaign();
     }
     @Then("^i validate campaigns page$")
     public void validate() throws InterruptedException {
    	 lg.validatePage();
     }
     @Then("^i click on new tab$")
     public void newtab() throws InterruptedException {
    	 lg.clickNew();
     }
     @When("^i enter the valid credentials$")
     public void validcredentials() {
    	 lg.enterEmail();
    	 lg.checkbox();
    	 
     }
     @When("^click on save button$")
     public void savebutton() {
    	 lg.submit();
    	 
     }
     
}
