import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.page.UserStartPage;

public class StepDefenitions extends AbstractTest {
    WebDriver driver;
    UserStartPage userStartPage;
    @Before
    public void initPage() {
        userStartPage = new UserStartPage(driver);
    }

    @Given("^User opens the application$")
    public void user_opens_the_application() {
        driver = getDriver();
        driver.get("https://testfortesting.online-loans.ph/");
    }

    @When("^User fills the form$")
    public void user_fills_the_form() {
        userStartPage.fillFormFirstLoan("Juan", "Pablo", "1", "09321412412");
        userStartPage.sendForm("Get First Loan");
    }

    @Then("^User click button Get First Loan$")
    public void checkErrors() {
        // проверяем наличие ошибок
    }

    @After
    public void tearDown() {
        quitChromeDriverInstance();
    }
}
