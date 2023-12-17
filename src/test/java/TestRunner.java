import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/ValidationTest.feature",
        glue = "web",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

}
