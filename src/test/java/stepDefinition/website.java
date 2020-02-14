package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//import static stepDefinition.Example.driver;
import java.sql.SQLOutput;

import static java.lang.Boolean.TRUE;
import static stepDefinition.Hooks.driver;

public class website {
    @When("^I access facebook\\.com website$")
    public void i_access_facebook_com_website()  {
        System.out.println("I am in FB when statement");
        driver.get("http://facebook.com");
    }

    @Then("^I see facebook login page$")
    public void i_see_facebook_login_page()  {
        System.out.println("I am in FB Then statement");
        System.out.println(driver.getTitle());
        Assert.assertEquals(TRUE, driver.getTitle().contains("Facebook"));
      //  driver.quit();
            }

    @When("^I access loyids\\.com website$")
    public void i_access_loyids_com_website()   {
        System.out.println("I am in loyids when statement");
        driver.get("https://www.lloydsbank.com/");
    }

    @Then("^I see loyids login page$")
    public void i_see_loyids_login_page() {
        System.out.println("I am in loyids Then statement");
        System.out.println(driver.getTitle());
        //driver.quit();
    }

    @When("^I access bookings\\.com website$")
    public void i_access_bookings_com_website() {
        driver.get("https://www.booking.com/");
    }

    @Then("^I see bookings\\.com website$")
    public void i_see_bookings_login_page() {
        System.out.println("I am in bookings Then statement");
       // driver.quit();
        System.out.println(driver.getTitle());
    }

    @When("^I access santander\\.com website$")
    public void i_access_santander_com_website()   {
        driver.get("https://www.santander.co.uk/");
    }

    @Then("^I see santander\\.com website$")
    public void i_see_santander_login_page() {
        System.out.println("I am in santander Then statement");
       // driver.quit();
        System.out.println(driver.getTitle());
    }

}
