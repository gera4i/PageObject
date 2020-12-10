package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleProductPage extends AbstractPage{


    @FindBy(xpath = "//*[@id=\"Item16_7inch_label\"]/span")
    WebElement targetModel;

    @FindBy(xpath = "//*[@id=\"Item2pacificblue_label\"]/span[2]")
    WebElement targetColor;

    @FindBy(xpath = "//*[@id=\"Item3256gb_label\"]/span[1]")
    WebElement targetMemory;

    @FindBy(xpath = "//*[@id=\"primary\"]/div[3]/div[2]/accessory-slot/div/fieldset/div[2]/div/div")
    WebElement clickNoCare;

    @FindBy(xpath = "//*[@id=\"primary\"]/summary-builder/div[2]/div[1]/div/div[1]/div[2]/div/div/form/div/span")
    WebElement addToBasketButton;



    public AppleProductPage(WebDriver driver) {
        super(driver);
    }

     public AppleProductPage chooseModel(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(
                        targetModel))
                .click();
        return this;
    }


    public AppleProductPage chooseColor(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(
                        targetColor))
                .click();
        return this;
    }

    public AppleProductPage chooseMemory(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(
                        targetMemory))
                .click();
        return this;
    }

   /* public AppleProductPage scrollToItem(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",addToBasketButton);
        return this;
    }*/
    public AppleProductPage chooseNoCare(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(clickNoCare))
                .click();
        return this;
    }

    public AppleItemPurchasedPage openPurchasedPage(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(addToBasketButton))
                .click();
        return new AppleItemPurchasedPage(driver);
    }

}