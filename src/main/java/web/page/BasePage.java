package web.page;

import org.openqa.selenium.WebDriver;
import web.Element;

public class BasePage {
    protected Element element; // Изменено на protected, чтобы классы-наследники могли использовать element

    public BasePage(WebDriver driver){
        this.element = new Element(driver); // Инициализация объекта Element
    }
}
