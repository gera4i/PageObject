package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleIphone12ProMaxPage extends AbstractPage{


    @FindBy(xpath = "//*[@id=\"ac-localnav\"]/div/div[2]/div[2]/div[2]/div[2]/a")
    WebElement buyButton;

    public AppleIphone12ProMaxPage(WebDriver driver) {
        super(driver);
    }

    public AppleProductPage openProductPage(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(buyButton))
                .click();
        return new AppleProductPage(driver);
    }

}