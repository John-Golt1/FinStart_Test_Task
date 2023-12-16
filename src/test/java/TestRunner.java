import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/ValidationTest.feature", // Путь к вашим .feature файлам
        glue = "web", // Путь к пакету с классом StepDefinitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Опционально: отображение результатов в консоли и генерация отчетов
)
public class TestRunner {

}
