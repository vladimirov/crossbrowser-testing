import appmanager.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest extends TestBase {

    @Test
    public void testOpenUrl() {
        app.openBaseUrl();
    }

}
