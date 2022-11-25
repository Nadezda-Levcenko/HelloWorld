package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser() {
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.lu.lv/");
    }

    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
        }


    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium Tests");
        parluks.quit();
    }

    @Test
    public void testPageTitle(){
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums,"Latvijas Universitāte");
        parluks.quit();
    }

    @Test
    public void testRandom(){

    }
}
