package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"MySteps"}, tags={"@Test200"},
        plugin = {"json:target/cucumber-reports/cucumber.json"})
public class Runner {
}
