import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/ValidationTest.feature", // Путь к вашим .feature файлам
        glue = "path.to.step.definitions", // Путь к пакету с классом StepDefinitions
        plugin = {"pretty", "html:target/cucumber-reports"} // Опционально: отображение результатов в консоли и генерация отчетов
)
public class TestRunner {

}
