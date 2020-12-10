package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleHomePage extends AbstractPage{

    private static final String PRODUCTPAGE_URL = "https://www.apple.com/ru/";

    @FindBy(xpath = "//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a")
    WebElement iphonesButton;

    public AppleHomePage(WebDriver driver) {
        super(driver);
    }
    public AppleHomePage openPage() {
        driver.get(PRODUCTPAGE_URL);
        return this;
    }
    public AppleIphonesPage openIphonesPage(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(iphonesButton))
                .click();
        return new AppleIphonesPage(driver);
    }

}