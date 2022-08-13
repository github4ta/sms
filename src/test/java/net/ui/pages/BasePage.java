package net.ui.pages;

import net.ui.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;

    protected BasePage() {
        driver = DriverSingleton.getDriver();
    }

    public WebElement waitTimeWebElement(WebElement element) {
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitWebElementsIsVisible(By locator) {
        WebElement element = driver.findElement(locator);
        return waitTimeWebElement(element);
       }
}
