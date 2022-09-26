package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    // Function to navigate a Web Page on Internet
    public void navigateTo(String url) {
        driver.get(url);
    }

    public void completeInput(String locator, String value) {
        Find(locator).clear();

        Find(locator).sendKeys(value);
    }

    public void selectElementInDropdownByText(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByVisibleText(valueToSelect);
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }
}
