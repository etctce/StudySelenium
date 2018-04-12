package StudySelenium;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;

public class GoogleTest {

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\StudySelenium\\drivers\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
    }

    @Test
    public void checkGoogle() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $(By.name("q")).shouldHave(value("Selenide"));

    }
}