package web.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import web.Element;

public class BasePage {
    protected Element element;

    public BasePage(WebDriver driver){
        this.element = new Element(driver);
    }
}
