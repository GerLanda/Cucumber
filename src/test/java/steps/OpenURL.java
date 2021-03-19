package steps;

import io.cucumber.java.ru.Пусть;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {



    @Пусть("открыт ресурс авито")
    public void openAvito() {
       /* System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru");*/
    }
}
