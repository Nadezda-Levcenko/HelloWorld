package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private By itemName = By.id("item_2_title_link");
    private By productName = By.className("inventory_item_name");
    private By checkoutButton = By.id("checkout");

    public WebElement getItemName() {
        return driver.findElement(itemName);
    }
    public WebElement getCheckOutButton(){
        return driver.findElement(checkoutButton);
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }
    public CartPage(WebDriver driver) {

        super(driver);
    }

}
