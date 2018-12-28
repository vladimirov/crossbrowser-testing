import appmanager.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTest extends TestBase {

    @BeforeTest
    @Parameters("browser")
    public void startBrowser(@Optional("") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            app.browser = "chrome";
        } else if (browser.equalsIgnoreCase("firefox")) {
            app.browser = "firefox";
        }
    }

    @Test
    public void testOpenUrl() {
        app.openBaseUrl();
    }

}
