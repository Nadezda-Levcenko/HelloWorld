package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage {

    private By productNameOver = By.id("item_2_title_link");
    private By finishButton = By.id("finish");

    public String getProductNameOver(){
        return driver.findElement(productNameOver).getText();
    }

    public WebElement getFinishButton(){
        return driver.findElement(finishButton);
    }

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }
}
