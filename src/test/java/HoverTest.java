
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HoverTest extends TestBase{
    @Test
    public void hover() {
        open("https://github.com/");

        $x("//button[contains(text(),'Solutions')]").hover();
        $x("//a[contains(text(),'Enterprise')]").click();
        $x("//h1[@id='hero-section-brand-heading']").
                shouldHave(text("The AI-powered developer platform."));
    }

    @Test
    public void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));

//        $("#column-a").dragAndDropTo("column-b"); ----- don't work
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();

        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

}
