package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static stepDefinition.Hooks.driver;

public class Example {
    //public static WebDriver driver;
    @Given("^I am a chrome user$")
    public void i_am_a_chrome_user() {

        System.out.println("I am in Given statement");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\MyMavenProject1\\src\\test\\java\\chromedriver.exe");
        //driver = new ChromeDriver();
    }

    @When("^I access facebook website$")
    public void i_access_facebook_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in When statement");
        driver.get("http://facebook.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
            }

    @Then("^I  see facebook login page$")
    public void i_see_facebook_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in Then statement");
//driver.quit();
    }

    @When("^I access Redbus website$")
    public void i_access_Redbus_website()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in Redbus When statement");
    }

    @Then("^I  see Redbus login page$")
              public void i_see_Redbus_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in Redbus Then statement ");
       // driver.quit();
    }



}
