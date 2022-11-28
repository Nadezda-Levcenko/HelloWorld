package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postCode = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By errorMessage = By.cssSelector("div.error-message-container h3");

    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }
    public WebElement getLastName(){
        return driver.findElement(lastName);
    }
    public WebElement getPostCode(){
        return driver.findElement(postCode);
    }
    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }
    public void fillCheckoutFields(String firstName, String lastName, String postCode) {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getPostCode().sendKeys(postCode);
    }

    public WebElement getErrorMessage(){
        return driver.findElement(errorMessage);
    }

    public CheckoutPage (WebDriver driver) {
        super(driver);
    }
}
