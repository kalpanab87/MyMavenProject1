package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\IdeaProjects\\MyMavenProject1\\src\\test\\Feature",
        glue = {"stepDefinition"},
        // tags = {"@smoke"},
        plugin = {"pretty", "html:target/destination" + ""}
)

public class TestRunner {

}
