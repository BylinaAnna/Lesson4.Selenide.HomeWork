package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class OpenPageSoftAssertions {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void OpenPageSoftAssertionsFindcodeJUnit5(){
        open("https://github.com/selenide/selenide");
        $(".js-repo-nav").$("#wiki-tab").click();
        $(".mt-4").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
