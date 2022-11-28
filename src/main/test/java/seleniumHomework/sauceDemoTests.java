package seleniumHomework;

import pageObjectsHomework.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sauceDemoTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        System.out.println("Pirmais Scenārijs");
        System.out.println("1. Navigēties uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");


        InventoryPage inventoryPage = new InventoryPage(driver);
        System.out.println("3. Pārbaudīt, ka lietotājs ir ielogojies");
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        Thread.sleep(1000);

        System.out.println("4. Ievietot Grozā 1 produktu");
        inventoryPage.getAddToCart().click();
        Thread.sleep(1000);

        System.out.println("5. Doties uz Grozu");
        inventoryPage.getCartPage().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        Thread.sleep(1000);

        System.out.println("6. Pārbaudīt, kā šī prece ir grozā");
        String expectProductName = cartPage.getProductName();
        Assert.assertEquals(inventoryPage.getProductNameInv(), expectProductName);

        System.out.println("7. Doties uz Checkout");
        cartPage.getCheckOutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        Thread.sleep(1000);

        System.out.println("8. Ievadīt vārdu/uzvārdu/pasta indeksu");
        checkoutPage.fillCheckoutFields("Nadezda", "Levcenko", "LV-1029");
        Thread.sleep(1000);

        System.out.println("9. Doties uz Checkout overview lapu, pārbaudīt datus");
        checkoutPage.getContinueButton().click();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertEquals(checkoutOverviewPage.getPageTitle().getText(), "CHECKOUT: OVERVIEW");
        Thread.sleep(1000);
        Assert.assertEquals(checkoutOverviewPage.getProductNameOver(), expectProductName);

        System.out.println("10. Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi");
        checkoutOverviewPage.getFinishButton().click();
        Thread.sleep(1000);

        CheckoutSuccessPage checkoutSuccessPage = new CheckoutSuccessPage(driver);
        Assert.assertEquals(checkoutSuccessPage.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
        Thread.sleep(1000);

        System.out.println("11. Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'");
        checkoutSuccessPage.getBackHomeButton().click();
        Thread.sleep(1500);
    }

    @Test
    public void testFirstNameIsNull() throws InterruptedException {
        System.out.println("Otrais Scenārijs");
        System.out.println("1. Navigēties uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        Thread.sleep(1000);

        System.out.println("3. Doties uz Grozu");
        inventoryPage.getCartPage().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        Thread.sleep(1000);

        System.out.println("4. Doties uz Checkout");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        cartPage.getCheckOutButton().click();
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        Thread.sleep(1000);

        System.out.println("5. Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");
        checkoutPage.fillCheckoutFields("", "Levcenko", "LV-1235");
        checkoutPage.getContinueButton().click();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(1000);
    }

    @Test
    public void testLastNameIsNull() throws InterruptedException {
        System.out.println("Otrais Scenārijs");
        System.out.println("1. Navigēties uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        Thread.sleep(1000);

        System.out.println("3. Doties uz Grozu");
        inventoryPage.getCartPage().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        Thread.sleep(1000);

        System.out.println("4. Doties uz Checkout");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        cartPage.getCheckOutButton().click();
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        Thread.sleep(1000);

        System.out.println("5. Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");
        checkoutPage.fillCheckoutFields("jjbnmcx", "", "LV-1235");
        checkoutPage.getContinueButton().click();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        Thread.sleep(1000);
    }

    @Test
    public void testPostCodeIsNull() throws InterruptedException {
        System.out.println("Otrais Scenārijs");
        System.out.println("1. Navigēties uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        Thread.sleep(1000);

        System.out.println("3. Doties uz Grozu");
        inventoryPage.getCartPage().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        Thread.sleep(1000);

        System.out.println("4. Doties uz Checkout");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        cartPage.getCheckOutButton().click();
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        Thread.sleep(1000);

        System.out.println("5. Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");
        checkoutPage.fillCheckoutFields("jjbnmcx", "bchsbn", "");
        checkoutPage.getContinueButton().click();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        Thread.sleep(1000);
    }

    @Test
    public void testAllDataIsNull() throws InterruptedException {
        System.out.println("Otrais Scenārijs");
        System.out.println("1. Navigēties uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        Thread.sleep(1000);

        System.out.println("3. Doties uz Grozu");
        inventoryPage.getCartPage().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        Thread.sleep(1000);

        System.out.println("4. Doties uz Checkout");
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        cartPage.getCheckOutButton().click();
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        Thread.sleep(1000);

        System.out.println("5. Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");
        checkoutPage.fillCheckoutFields("", "", "");
        checkoutPage.getContinueButton().click();
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(1000);
    }
}
