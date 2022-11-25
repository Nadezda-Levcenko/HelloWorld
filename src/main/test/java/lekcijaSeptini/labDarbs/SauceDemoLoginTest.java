package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SauceDemoLoginTest extends BaseTest {

    @Test
    public void testLoginPageObjectExample(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("secret_sauce", "asdasdasdas");
//        loginPage.getUsernameField().sendKeys("secret_sauce");
//        loginPage.getPasswordField().sendKeys("asdasdasdas");
//        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any " +
                "user in this service");
    }

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);

        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");

    }




    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser() {
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }

    @Test
    public void testLoginWrongUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        testLogin("asassasddd", "qewrrttty",
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() {
        testLogin("", "",
                "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword() {
        testLogin("", "jbjksnjnc",
                "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameAndEmptyPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdas", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }


    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name")); //usernameInputField
        lietotajVardsIevadesLauks.sendKeys(username);

        WebElement lietotajParolesIevadesLauks = parluks.findElement(By.id("password"));
        lietotajParolesIevadesLauks.sendKeys("password");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,expectedErrorMessage);
    }

}
