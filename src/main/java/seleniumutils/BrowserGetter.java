package seleniumutils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.*;
public class BrowserGetter {

    public WebDriver getChromeDriver() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            return driver;
    }
}
