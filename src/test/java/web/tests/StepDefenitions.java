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

    @When("^User fills the form and send form$")
    public void user_fills_the_form() {
        userStartPage.fillFormFirstLoan("Juan", "Pablo", "1", "09321412412");
        userStartPage.sendForm("Get First Loan");
    }

    @Then("^Check error$")
    public void checkErrors() {
        userStartPage.sendForm("Get First Loan");
        userStartPage.checkFillError("Last name", "error"); //в задании не указано, на сайте непонятно поведение
    }

    @After
    public void tearDown() {
        quitChromeDriverInstance();
    }
}
