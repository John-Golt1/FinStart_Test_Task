import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ValidationTest extends AbstractTest {
    @Test
    public void testSomething() {
        WebDriver driver = getDriver();
        driver.get("https://testfortesting.online-loans.ph/");



        quitChromeDriverInstance();
    }
}
