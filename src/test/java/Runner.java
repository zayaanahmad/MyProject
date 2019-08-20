import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs", "utils"},
        tags = "@bitcoin",
        plugin = {
                "pretty",
                "html:build/cucumber-report/cucumber.html"
        },
        strict = true
)
public class Runner {
}
