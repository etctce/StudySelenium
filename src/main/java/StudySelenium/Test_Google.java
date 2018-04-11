package StudySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Google {

    private WebDriver driver;
    private WebDriverWait wait ;

    //Предусловие

    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    //Тест
    public void FirstTest(){
        driver.get("https://www.google.ru/");
    }
}
