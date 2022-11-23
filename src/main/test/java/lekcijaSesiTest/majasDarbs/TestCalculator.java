package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    int count = 1;
    Calculator calculator = new Calculator();

    @Test
    public void testCalculatorAdd(){
        Assert.assertEquals(calculator.add(2,3),5);
        Assert.assertEquals(calculator.add(5,7),12);
        Assert.assertEquals(calculator.add(5,-7),-2);
    }

    @Test
    public void testCalculatorSubstract(){
        Assert.assertEquals(calculator.subtract(5,7),-2);
        Assert.assertEquals(calculator.subtract(20,3),17);
        Assert.assertEquals(calculator.subtract(52,38),14);
    }

    @Test
    public void testCalculatorMultiply(){
        Assert.assertEquals(calculator.multipy(2,30),60);
        Assert.assertEquals(calculator.multipy(2,0),0);
        Assert.assertEquals(calculator.multipy(10,30),300);
    }

    @Test
    public void testCalculatorDivide(){
        Assert.assertEquals(calculator.divide(30,2),15);
        Assert.assertEquals(calculator.divide(100,4),25);
        Assert.assertEquals(calculator.divide(125,5),25);
    }

}
