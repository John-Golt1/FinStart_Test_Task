package web.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    private static WebDriver chromeDriverInstance;

    protected AbstractTest() {
    }

    public static WebDriver getDriver() {
        if (chromeDriverInstance == null) {
            try {
                //WebDriverManager.chromedriver().setup();
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\makurin.a\\.cache\\selenium\\chromedriver\\win64\\119.0.6045.105\\chromedriver.exe");

                chromeDriverInstance = new ChromeDriver();
                chromeDriverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                chromeDriverInstance.manage().window().maximize();
            } catch (Exception e) {
                System.err.println("Ошибка при создании хромдрайвера: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return chromeDriverInstance;
    }

    public static void quitChromeDriverInstance() {
        if (chromeDriverInstance != null) {
            chromeDriverInstance.quit();
            chromeDriverInstance = null;
        }
    }
}
