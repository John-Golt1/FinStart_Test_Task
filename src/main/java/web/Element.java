package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Element {
    private WebDriver driver;
    public Element(WebDriver driver){
        this.driver = driver;
    }

    public WebElement get(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public boolean isElementPresent(String xpath) {
        try {
            return driver.findElements(By.xpath(xpath)).size() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
