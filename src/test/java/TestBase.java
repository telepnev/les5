import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
       // Configuration.browserVersion = "118";
        Configuration.pageLoadStrategy = "eager";
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }
}
