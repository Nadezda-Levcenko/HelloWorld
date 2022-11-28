package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage extends BasePage {

    private By backHomeButton = By.id("back-to-products");

    public WebElement getBackHomeButton() {
        return driver.findElement(backHomeButton);
    }
    public CheckoutSuccessPage (WebDriver driver) {
        super(driver);
    }
}
