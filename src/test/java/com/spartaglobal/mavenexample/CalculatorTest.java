package com.spartaglobal.mavenexample;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition(){
        Assert.assertEquals(6,calculator.add(2, 4));
    }
    @Test
    public void testSubraction(){
        Assert.assertEquals(6, calculator.subtraction(10, 4));
    }
    @Test
    public void testMultiplication(){
        Assert.assertEquals(4, calculator.multiplication(2,2));
    }
    @Test
    public void testDivision(){
        Assert.assertEquals(3,calculator.division(6,2));
    }
}
