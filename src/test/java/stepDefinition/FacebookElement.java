package stepDefinition;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.apache.velocity.runtime.parser.ParserConstants.TRUE;
import static stepDefinition.Hooks.driver;


public class FacebookElement {

    @Then("^I see \"([^\"]*)\" is visible$")
    public void I_see_element_is_visible(String arg1){
       // driver.findElement(By.id("email"));
        Assert.assertEquals(Boolean.TRUE,driver.findElement(By.id(arg1)).isDisplayed());
        //Assert.assertEquals(Boolean.TRUE,driver.findElement(By.id("pass")).isDisplayed());
        //Assert.assertEquals(Boolean.TRUE,driver.findElement(By.id("u_0_b")).isDisplayed());

    }
}
