package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;

import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenURL extends LocatorStuff {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Test start");
    }

    @Пусть("открыт ресурс авито")
    public void openAvito() {
        driver.get("https://www.avito.ru");
    }

    @ParameterType(".*")
    public CategoryValue value(String value) {
        return CategoryValue.valueOf(value);
    }

    @И("в выпадающем списке категорий выбрана {value}")
    public void selectCategory(CategoryValue enumType) {
        Select category = new Select(driver.findElement(categoryLocator));
        category.selectByVisibleText(enumType.value);
    }

    @И("в поле поиска введено значение {string}")
    public void productSearch(String product) {
        WebElement productSearch = driver.findElement(productSearchLocator);
        productSearch.sendKeys(product);
    }

    @Тогда("кликнуть по выпадающему списку региона")
    public void citySearch() {
        WebElement citySearch = driver.findElement(citySearchLocator);
        citySearch.click();
    }

    @Тогда("в поле регион введено значение {string}")
    public void citySearchLine(String city) {
        WebElement citySearchLine = driver.findElement(citySearchLineLocator);
        citySearchLine.sendKeys(city);
    }

    @И("нажата кнопка показать объявления")
    public void citySelection() {
        WebElement citySelection = driver.findElement(citySelectionLocator);
        citySelection.click();
    }

    @Тогда("открылась страница результаты по запросу принтер")
    public void citySearchButton() {
        WebElement citySearchButton = driver.findElement(citySearchButtonLocator);
        citySearchButton.click();
    }

    @И("активирован чекбокс только с фотографией")
    public void chexkBox() {
        WebElement checkBox = driver.findElement(checkBoxLocator);
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    @ParameterType(".*")
    public SortPriceValue valuePrice(String value) {
        return SortPriceValue.valueOf(value);
    }

    @И("в выпадающем списке сортировка выбрано значение {valuePrice}")
    public void sortPriceSelect(SortPriceValue value) {
        Select sortPrice = new Select(driver.findElement(sortPriceLocator));
        sortPrice.selectByVisibleText(value.value);
    }

    @И("в консоль выведено значение названия и цены {int} первых принтеров")
    public void webElemebnts(int quantity) {
        List<WebElement> webElements = driver.findElements(webElementsLocator);
        for (int i = 0; i < quantity; i++) {
            System.out.println("Название " + webElements.get(i).findElement(printerNameLocator).getText());
            System.out.println("Цена " + webElements.get(i).findElement(printerPriceLocator).getText());
        }
    }

    @After
    public void close() {
        driver.quit();
        System.out.println("Test close");
    }
}
