package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static java.lang.Boolean.TRUE;
import static stepDefinition.Hooks.driver;

public class Bwfw {

    @When("^I go backward$")
    public void I_go_backward(){
        driver.navigate().back();
    }

//    @When("^I go forward$")
    //  public void I_go_forward(){
    //    driver.navigate().forward();
    //}

    @Then("^I see Facebook$")
    public void I_see_Facebook(){
        Assert.assertEquals(TRUE, driver.getTitle().contains("Facebook"));
    }

    @Then("^I go forward$")
    public void I_go_forward(){
        driver.navigate().forward();
    }

    @Then("^I see bookings$")
    public void I_see_bookings(){
        Assert.assertEquals(TRUE, driver.getTitle().contains("Booking"));
    }

}


