package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected static final int WAIT_TIMEOUT_SECONDS = 750;
    protected WebDriver driver;

    protected AbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}