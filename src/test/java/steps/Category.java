package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.И;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {

    WebDriver driver = new ChromeDriver();
    By categoryLocator = By.xpath("//select[@id='category']");


    @ParameterType(".*")
    public CategoryValue value(String value) {
        return CategoryValue.valueOf(value);
    }


    @И("в выпадающем списке категория выбрана {value}")
    public void select(CategoryValue value) {

       System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru");

        Select category = new Select(driver.findElement(categoryLocator));
        category.selectByVisibleText(value.value);




    }


}
