package seleniumDriverConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver get() {
        if (driver.get() == null) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        }

        return driver.get();
    }

    public static void quit() {
        driver.get().quit();
        driver.set(null);
    }
}
