package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static java.lang.Boolean.TRUE;
import static stepDefinition.Hooks.driver;

public class MultipleExamples {

    // @Given("^I am a chrome user$")
    //public void i_am_a_chrome_user() {
    //}
    @When("^I access \"([^\"]*)\" website$")
    public void I_access_website(String websiteName) {
        Assert.assertEquals(TRUE, driver.getTitle().contains(websiteName));
        System.out.println("I am in when");
    }

    @Then("^I see Home page with \"([^\"]*)\"$")
    public void I_see_Home_page(String websiteTitle) {
        Assert.assertEquals(TRUE, driver.getTitle().contains(websiteTitle));
        System.out.println("I am in then");
    }
}
