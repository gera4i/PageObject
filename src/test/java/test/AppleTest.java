package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import page.AppleHomePage;
import page.AppleCartPage;


public class AppleTest {

    private WebDriver driver;
    private ChromeOptions options;

    @BeforeMethod(alwaysRun = true)
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","G:\\webdriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        //options.addArguments("--whitelisted-ips");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
    }

    @Test
    public void addItemToCartTest() {
        WebElement cartPage = new AppleHomePage(driver)
                .openPage()
                .openIphonesPage()
                .openIphone12ProMaxPage()
                .openProductPage()
                .chooseModel()
                .chooseColor()
                .chooseMemory()
                .chooseNoCare()
                .openPurchasedPage()
                .openCart()
                .checkCart();

        Assert.assertTrue(cartPage.isDisplayed());
    }

    @Test
    public void checkoutOrderWithoutPostIndex() {
        AppleCartPage orderPage =  new AppleHomePage(driver)
                .openPage()
                .openIphonesPage()
                .openIphone12ProMaxPage()
                .openProductPage()
                .chooseModel()
                .chooseColor()
                .chooseMemory()
                .chooseNoCare()
                .openPurchasedPage()
                .openCart()
                //.checkCart()
                .checkoutButton();
        Assert.assertEquals(orderPage.getPostIndexErrorSpan(), "Введите ваш почтовый индекс.");    }


    @AfterMethod
    public void closeDriver() {
        driver.close();
    }

    @AfterTest
    public void quiteBrowserAfterTest() {
        driver.quit();
    }
}

