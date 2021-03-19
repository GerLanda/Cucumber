package steps;

import org.openqa.selenium.By;

public class LocatorStuff {
    By categoryLocator = By.xpath("//select[@id='category']");
    By productSearchLocator = By.xpath("//input[@id='search']");
    By citySearchLocator = By.xpath("//div[@class='main-text-2PaZG']");
    By citySearchLineLocator = By.xpath("//input[@class='suggest-input-3p8yi']");
    By citySelectionLocator = By.xpath("//ul[@class='suggest-suggests-bMAdj']/li[@class='suggest-suggest-1wwEm text-text-1PdBw text-size-m-4mxHN']");
    By citySearchButtonLocator = By.xpath("//button[@class='button-button-2Fo5k button-size-m-7jtw4 button-primary-1RhOG']");
    By checkBoxLocator = By.xpath("//span[@class='checkbox-label-3AzRS text-text-1PdBw text-size-s-1PUdo text-color-default-1QVMz']");
    By elementLocator = By.xpath("//div[@data-marker='delivery-filter/container']/label[@class='checkbox-checkbox-7igZ6 checkbox-size-s-yHrZq']");
    By sortPriceLocator = By.xpath("//div[@class='sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy']/select[@class='select-select-3CHiM']");
    By webElementsLocator = By.xpath("//div[@class='items-items-38oUm']/div[@data-marker='item']");
    By printerNameLocator = By.xpath(".//h3[@class='title-root-395AQ iva-item-title-1Rmmj title-list-1IIB_ title-root_maxHeight-3obWc text-text-1PdBw text-size-s-1PUdo text-bold-3R9dt']");
    By printerPriceLocator = By.xpath(".//span[@class='price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo']");
}
