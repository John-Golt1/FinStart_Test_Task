package web.page;

import Core.CoreExceptionUnexpected;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web.Element;

public class UserStartPage extends BasePage {
    private static final String INPUT_NAME_FILL = "//div[@role='formFloatGroup']/label[contains(text(),'%s')]";
    private static final String BUTTON_GET_FIRST_LOAN = "//input[@type='submit' and @value='%s']";

    public UserStartPage(WebDriver driver) {
        super(driver);
    }

    private WebElement findInputItem(String itemName) {
        try {
            return element.get(String.format(INPUT_NAME_FILL, itemName));
        } catch (NoSuchElementException e) {
            throw new CoreExceptionUnexpected("Поле [" + itemName + "] не найдено.", e);
        }
    }

    private WebElement findButton(String buttonName) {
        try {
            return element.get(String.format(BUTTON_GET_FIRST_LOAN, buttonName));
        } catch (NoSuchElementException e) {
            throw new CoreExceptionUnexpected("Кнопка [" + buttonName + "] не найдена.", e);
        }
    }

    public void fillFormFirstLoan(String firstName, String middleName, String lastName, String phoneNumber) {
        findInputItem("First name").sendKeys(firstName);
        findInputItem("Middle initial").sendKeys(middleName);
        findInputItem("Last name").sendKeys(lastName);
        findInputItem("Mobile phone").sendKeys(phoneNumber);
    }

    public void sendForm(String buttonName) {
        findButton(buttonName).click();
    }
}
