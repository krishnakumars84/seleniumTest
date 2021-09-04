package seleniumtest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import seleniumutils.BrowserGetter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AutoTest {

     WebDriver driver;
    private BrowserGetter browserGetter = new BrowserGetter();

    @BeforeAll
    void beforeAllTests()  {
        driver = browserGetter.getChromeDriver();
    }
    @AfterAll
    void afterAllTests() {
        driver.quit();
    }
    @Test
    public void openPageAndCheckTheTitle() {
        String expectedTitle = "My Store";
        driver.get("http://automationpractice.com/index.php");
        assertEquals(expectedTitle,driver.getTitle());

    }
}
