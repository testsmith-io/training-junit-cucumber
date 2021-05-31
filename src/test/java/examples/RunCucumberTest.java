package examples;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/examples",
    tags = {"not @ignore"})
public class RunCucumberTest {
}

