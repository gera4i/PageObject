package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppleCartPage extends AbstractPage{



    public AppleCartPage(WebDriver driver) {
        super(driver);
    }


    public WebElement checkCart(){
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"cart-items\"]")));
    }

    public AppleCartPage checkoutButton() {
        WebElement checkoutButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(By
                        .xpath("//*[@id=\"shoppingCart.actions.checkout\"]")));
        checkoutButton.click();
        return this;
    }

    public String getPostIndexErrorSpan() {
        WebElement PostIndexErrorSpan = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//*[@id=\"recon-0-28-error\"]/span")));
        return PostIndexErrorSpan.getText();
    }



}