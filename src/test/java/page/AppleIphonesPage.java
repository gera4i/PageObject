package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleIphonesPage extends AbstractPage{


    @FindBy(xpath = "//*[@id=\"chapternav\"]/div/ul/li[1]/a")
    WebElement iphone12ProMaxButton;

    public AppleIphonesPage(WebDriver driver) {
        super(driver);
    }

    public AppleIphone12ProMaxPage openIphone12ProMaxPage(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(iphone12ProMaxButton))
                .click();
        return new AppleIphone12ProMaxPage(driver);
    }

}