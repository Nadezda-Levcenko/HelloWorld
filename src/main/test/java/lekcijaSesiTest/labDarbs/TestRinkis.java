package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {

    @Test
    public void testRekinatLaukumuDecimals(){
        calculateAreaAndAssert(4.5,63.585);
    }

    @BeforeTest
    public void pirmsTesta(){
        System.out.println("Šī ir BEFORE TEST ANOTĀCIJA");
    }

    @AfterTest
    public void pecTesta(){
        System.out.println("Šī ir AFTER TEST ANOTĀCIJA");
    }
    @BeforeMethod
    public void sagavatosanas(){ //setup
        System.out.println("Šī metode tiek izpildīta pirms katra testa");
    }

    @AfterMethod
    public void pecDarbibas(){ //tearDown
        System.out.println("Šī metode tiek izpildīta pēc katra testa");
    }

    @Test
    public void testRekinatLaukumuVesels(){
        calculateAreaAndAssert(4.0,50.24);
    }

    @Test
    public void testRekinatLaukumuNulle(){
        calculateAreaAndAssert(0.0,0.0);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
        Assert.assertEquals(true,true);
    }
}
