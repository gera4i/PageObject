package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleItemPurchasedPage extends AbstractPage{


    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div[2]/div/form/button")
    WebElement goToBasketButton;

    public AppleItemPurchasedPage(WebDriver driver) {
        super(driver);
    }

    public AppleCartPage openCart(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(goToBasketButton))
                .click();
        return new AppleCartPage(driver);
    }

}