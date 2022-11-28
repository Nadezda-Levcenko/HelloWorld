package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BasePage {

    //private By successLogin = By.cssSelector("span.title");
    private By addToCart = By.id("add-to-cart-sauce-labs-onesie");
    private By cartPage = By.id("shopping_cart_container");
    private By productNameInv = By.className("inventory_item_name");

//    public WebElement getSuccessLogin() {
//        return driver.findElement(successLogin);
//    }

    public String getProductNameInv(){
        return driver.findElement(productNameInv).getText();
    }

    public WebElement getAddToCart(){
        return driver.findElement(addToCart);
    }

    public WebElement getCartPage(){
        return driver.findElement(cartPage);
    }

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
}
