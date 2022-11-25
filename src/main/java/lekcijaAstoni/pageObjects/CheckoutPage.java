package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{

    private By continueButton = By.id("continue");

    private By firstNameInputField = By.id("first-name");

    private By errorText = By.cssSelector("h3");

    public void inputFirstName(String a) {
        driver.findElement(firstNameInputField).sendKeys(a);
    }

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorText() {
        return driver.findElement(errorText).getText();
    }

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
