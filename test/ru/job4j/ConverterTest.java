package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

   @Test
    public void whenConvert2EuroThen140Rbl() {
       int in1 = 2;
       int expected1 = 140;
       int out1 = Converter.euroToRuble(in1);
       Assert.assertEquals(expected1, out1);
    }

   @Test
   public void whenConvert180RblThen3Dollar() {
       int in2 = 180;
       int expected2 = 3;
       int out2 = Converter.rubleToDollar(in2);
       Assert.assertEquals(expected2, out2);
   }

    @Test
    public void whenConvert3DollarThen180Rbl() {
            int in3 = 3;
            int expected3 = 180;
            int out3 = Converter.dollarToRuble(in3);
            Assert.assertEquals(expected3, out3);
    }
}