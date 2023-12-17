package web.tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import web.page.UserStartPage;

public class StepDefenitions extends AbstractTest {
    WebDriver driver;
    UserStartPage userStartPage;

    @Before
    public void initPage() {
        driver = getDriver();
        userStartPage = new UserStartPage(driver);
    }

    @Given("^User opens the application$")
    public void user_opens_the_application() {
        driver = getDriver();
        driver.get("https://testfortesting.online-loans.ph/");
    }

    @When("^User fills the form with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_fills_the_form(String firstName, String middleName, String lastName, String phoneNumber) {
        userStartPage.fillFormFirstLoan(firstName, middleName, lastName, phoneNumber);
        userStartPage.removeFocusFromSendFord(200, 0);
    }

    @Then("^Check error for \"([^\"]*)\" with message \"([^\"]*)\"$")
    public void checkErrors(String fillName, String errorText) {
        userStartPage.checkFillError(fillName, errorText);
        userStartPage.sendForm();
    }

    @After
    public void tearDown() {
        quitChromeDriverInstance();
    }
}
